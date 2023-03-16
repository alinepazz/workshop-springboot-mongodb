package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.FindAllPosts;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.core.usecase.FindAllPostsUseCase;

import java.util.List;

public class FindAllPostsUseCaseImpl implements FindAllPostsUseCase {

    private final FindAllPosts findAllPosts;

    public FindAllPostsUseCaseImpl(FindAllPosts findAllPosts) {
        this.findAllPosts = findAllPosts;
    }

    @Override
    public List<Post> findAll(String id) {
        return findAllPosts.findAll(id);
    }
}
