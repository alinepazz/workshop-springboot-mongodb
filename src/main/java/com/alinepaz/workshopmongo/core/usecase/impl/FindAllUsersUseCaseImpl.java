package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.FindAllUsers;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.core.usecase.FindAllUsersUseCase;

import java.util.List;

public class FindAllUsersUseCaseImpl implements FindAllUsersUseCase {

    private final FindAllUsers findAllUsers;

    public FindAllUsersUseCaseImpl(FindAllUsers findAllUsers) {
        this.findAllUsers = findAllUsers;
    }

    @Override
    public List<User> findAll() {
        return findAllUsers.findAll();
    }
}
