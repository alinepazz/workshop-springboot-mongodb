package com.alinepaz.workshopmongo.core.usecase;

import com.alinepaz.workshopmongo.core.domain.Post;

public interface FindPostByIdUseCase {

   Post findById(String id);
}
