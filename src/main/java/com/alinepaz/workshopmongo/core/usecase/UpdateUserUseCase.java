package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.User;

public interface UpdateUserUseCase {
   void update(String id, User user);
}
