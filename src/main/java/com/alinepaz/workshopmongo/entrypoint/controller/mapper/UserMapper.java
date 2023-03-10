package com.alinepaz.workshopmongo.entrypoint.controller.mapper;

import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRequest userRequest);
}
