package com.alinepaz.workshopmongo.config.user;

import com.alinepaz.workshopmongo.core.usecase.impl.UpdateUserUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.UpdateUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateUserConfig {

    @Bean
    public UpdateUserUseCaseImpl updateUserUseCase(UpdateUserImpl updateUser){
        return new UpdateUserUseCaseImpl(updateUser);
    }
}
