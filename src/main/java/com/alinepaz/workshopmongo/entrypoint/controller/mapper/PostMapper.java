package com.alinepaz.workshopmongo.entrypoint.controller.mapper;

import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.entrypoint.controller.request.PostRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "author", ignore = true)
    @Mapping(target = "date", ignore = true)
    Post toPost(PostRequest postRequest);

//    List<UserResponse> toUserResponse(List<User> users);
//
//    UserResponse toUserResponseById(User user);
}
