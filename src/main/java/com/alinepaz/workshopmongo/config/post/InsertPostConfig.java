package com.alinepaz.workshopmongo.config.post;

import com.alinepaz.workshopmongo.core.usecase.impl.InsertPostUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.InsertPostImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertPostConfig {

    @Bean
    public InsertPostUseCaseImpl insertPostUseCase(InsertPostImpl insertPost){
        return new InsertPostUseCaseImpl(insertPost);
    }
}
