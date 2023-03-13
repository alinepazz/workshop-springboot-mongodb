package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.FindAllUsers;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllUsersImpl implements FindAllUsers {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public List<User> findAll() {

        var userEntity = userRepository.findAll();

        return userEntityMapper.toUser(userEntity);
    }
}
