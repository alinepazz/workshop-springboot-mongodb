package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.UpdateUser;
import com.alinepaz.workshopmongo.core.domain.User;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.UserEntity;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.UserEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateUserImpl implements UpdateUser {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public void update(String id, User user) {
        var userEntity = userRepository.findById(id);
        atualizarDadosUser(userEntity, user);
       userRepository.save(userEntity.get());

    }

    private void atualizarDadosUser(Optional<UserEntity> userEntity, User user) {
        userEntity.get().setName(user.getName());
        userEntity.get().setEmail(user.getEmail());
    }
}
