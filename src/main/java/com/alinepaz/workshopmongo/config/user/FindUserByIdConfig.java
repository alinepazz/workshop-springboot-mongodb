package com.alinepaz.workshopmongo.config.user;

import com.alinepaz.workshopmongo.core.usecase.impl.FindUserByIdUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.FindUserByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindUserByIdConfig {

    @Bean
    public FindUserByIdUseCaseImpl findUserByIdUseCase(FindUserByIdImpl findUserById){
        return new FindUserByIdUseCaseImpl(findUserById);
    }
}
