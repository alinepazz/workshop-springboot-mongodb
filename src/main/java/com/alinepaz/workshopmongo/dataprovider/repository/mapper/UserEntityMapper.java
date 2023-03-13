package com.alinepaz.workshopmongo.dataprovider.repository.mapper;


import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);

    List<User>toUser(List<UserEntity> userEntity);
}
