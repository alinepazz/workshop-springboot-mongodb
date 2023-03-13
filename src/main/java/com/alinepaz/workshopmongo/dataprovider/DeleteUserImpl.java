package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.DeleteUser;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserImpl implements DeleteUser {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
