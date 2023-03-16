package com.alinepaz.workshopmongo.config.post;

import com.alinepaz.workshopmongo.core.usecase.impl.FindAllPostsUseCaseImpl;
import com.alinepaz.workshopmongo.dataprovider.FindAllPostsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllPostsConfig {

    @Bean
    public FindAllPostsUseCaseImpl findAllPostsUseCase(FindAllPostsImpl findAllPosts){
        return new FindAllPostsUseCaseImpl(findAllPosts);
    }
}
