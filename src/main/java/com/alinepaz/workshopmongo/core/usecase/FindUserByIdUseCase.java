package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.User;

public interface FindUserByIdUseCase {

   User findById(String id);
}
