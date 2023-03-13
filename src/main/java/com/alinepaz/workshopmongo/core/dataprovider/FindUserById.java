package com.alinepaz.workshopmongo.core.dataprovider;

import com.alinepaz.workshopmongo.core.domain.User;

import java.util.Optional;

public interface FindUserById {

    Optional<User> findById(String id);
}
