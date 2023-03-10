package com.alinepaz.workshopmongo.config.user;

import com.alinepaz.workshopmongo.core.usecase.impl.InsertUserUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.InsertUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertUserConfig {

    @Bean
    public InsertUserUseCaseImpl insertUserUseCase(InsertUserImpl insertUser){
        return new InsertUserUseCaseImpl(insertUser);
    }
}
