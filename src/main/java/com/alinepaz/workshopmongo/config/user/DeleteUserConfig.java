package com.alinepaz.workshopmongo.config.user;

import com.alinepaz.workshopmongo.core.usecase.impl.DeleteUserUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.DeleteUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteUserConfig {

    @Bean
    public DeleteUserUseCaseImpl deleteUserUseCase(DeleteUserImpl deleteUser){
        return new DeleteUserUseCaseImpl(deleteUser);
    }
}
