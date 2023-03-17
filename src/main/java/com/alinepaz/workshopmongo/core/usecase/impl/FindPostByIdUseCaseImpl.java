package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.FindPostById;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.core.usecase.FindPostByIdUseCase;
import com.alinepaz.workshopmongo.dataprovider.exceptions.ResourceNotFoundException;


public class FindPostByIdUseCaseImpl implements FindPostByIdUseCase {

    private final FindPostById findPostById;

    public FindPostByIdUseCaseImpl(FindPostById findPostById) {
        this.findPostById = findPostById;
    }

    @Override
    public Post findById(String id) {
        return findPostById.findById(id)
                .orElseThrow(() ->new ResourceNotFoundException(id));
    }
}
