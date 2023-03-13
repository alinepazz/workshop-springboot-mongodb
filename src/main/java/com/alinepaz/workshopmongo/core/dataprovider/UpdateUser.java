package com.alinepaz.workshopmongo.core.dataprovider;

import com.alinepaz.workshopmongo.core.domain.User;

public interface UpdateUser {

    void update(String id, User user);
}
