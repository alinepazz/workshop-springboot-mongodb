package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.User;

import java.util.Optional;

public interface FindUserByIdUseCase {

   User findById(String id);
}
