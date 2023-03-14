package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.Post;

public interface InsertPostUseCase {

    void insert(String id, Post post);
}
