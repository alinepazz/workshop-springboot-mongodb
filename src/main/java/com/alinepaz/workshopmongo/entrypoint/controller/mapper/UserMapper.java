package com.alinepaz.workshopmongo.entrypoint.controller.mapper;

import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.response.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRequest userRequest);

    List<UserResponse> toUserResponse(List<User> users);

    UserResponse toUserResponseById(User user);
}
