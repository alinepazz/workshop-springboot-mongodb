package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.User;

import java.util.List;

public interface FindAllUsersUseCase {

    List<User> findAll();
}
