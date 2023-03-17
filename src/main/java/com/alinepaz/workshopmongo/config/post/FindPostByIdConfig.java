package com.alinepaz.workshopmongo.config.post;

import com.alinepaz.workshopmongo.core.usecase.impl.FindPostByIdUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.FindPostByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindPostByIdConfig {

    @Bean
    public FindPostByIdUseCaseImpl findPostByIdUseCase(FindPostByIdImpl findPostById){
        return new FindPostByIdUseCaseImpl(findPostById);
    }
}
