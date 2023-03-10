package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.InsertUser;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.core.usecase.InsertUserUseCase;

public class InsertUserUseCaseImpl implements InsertUserUseCase {

    private final InsertUser insertUser;

    public InsertUserUseCaseImpl(InsertUser insertUser) {
        this.insertUser = insertUser;
    }

    @Override
    public void insert(User user) {
        insertUser.insert(user);
    }
}
