package com.alinepaz.workshopmongo.dataprovider.repository.mapper;


import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);
}
