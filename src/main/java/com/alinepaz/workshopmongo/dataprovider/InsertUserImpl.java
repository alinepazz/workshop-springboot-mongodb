package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.InsertUser;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertUserImpl implements InsertUser {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public void insert(User user) {
        var userEntity = userEntityMapper.toUserEntity(user);
        userRepository.insert(userEntity);

    }
}
