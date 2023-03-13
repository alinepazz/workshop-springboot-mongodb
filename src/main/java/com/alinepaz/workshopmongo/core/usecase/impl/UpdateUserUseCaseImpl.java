package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.UpdateUser;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.core.usecase.UpdateUserUseCase;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UpdateUser updateUser;

    public UpdateUserUseCaseImpl(UpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public void update(String id, User user) {
        updateUser.update(id, user);
    }
}
