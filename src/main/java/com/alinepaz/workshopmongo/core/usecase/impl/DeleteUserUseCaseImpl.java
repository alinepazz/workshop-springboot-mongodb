package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.DeleteUser;
import com.alinepaz.workshopmongo.core.usecase.DeleteUserUseCase;
import org.springframework.dao.EmptyResultDataAccessException;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final DeleteUser deleteUser;

    public DeleteUserUseCaseImpl(DeleteUser deleteUser) {
        this.deleteUser = deleteUser;
    }

    @Override
    public void delete(String id) {

        try {
            deleteUser.delete(id);
        }catch (EmptyResultDataAccessException e){
            throw new RuntimeException("User not found" + e.getMessage());
        }
    }
}
