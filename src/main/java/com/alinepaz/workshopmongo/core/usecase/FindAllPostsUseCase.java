package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.Post;

import java.util.List;

public interface FindAllPostsUseCase {

    List<Post>findAll(String id);
}
