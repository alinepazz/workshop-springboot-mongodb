package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.FindUserById;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.core.usecase.FindUserByIdUseCase;

import java.util.Optional;

public class FindUserByIdUseCaseImpl implements FindUserByIdUseCase {

    private final FindUserById findUserById;

    public FindUserByIdUseCaseImpl(FindUserById findUserById) {
        this.findUserById = findUserById;
    }

    @Override
    public User findById(String id) {
        return findUserById.findById(id).orElseThrow(() ->new RuntimeException("User not found!"));
    }
}
