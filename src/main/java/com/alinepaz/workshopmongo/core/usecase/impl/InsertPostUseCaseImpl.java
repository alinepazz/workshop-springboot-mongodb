package com.alinepaz.workshopmongo.core.usecase.impl;

import com.alinepaz.workshopmongo.core.dataprovider.InsertPost;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.core.usecase.InsertPostUseCase;

public class InsertPostUseCaseImpl implements InsertPostUseCase {

    private final InsertPost insertPost;

    public InsertPostUseCaseImpl(InsertPost insertPost) {
        this.insertPost = insertPost;
    }

    @Override
    public void insert(String id, Post post) {
        insertPost.insert(id, post);
    }
}
