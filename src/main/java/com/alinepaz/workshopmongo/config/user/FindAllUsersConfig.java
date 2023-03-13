package com.alinepaz.workshopmongo.config.user;

import com.alinepaz.workshopmongo.core.usecase.impl.FindAllUsersUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.FindAllUsersImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllUsersConfig {

    @Bean
    public FindAllUsersUseCaseImpl findAllUsersUseCase(FindAllUsersImpl findAllUsers){
        return new FindAllUsersUseCaseImpl(findAllUsers);
    }
}
