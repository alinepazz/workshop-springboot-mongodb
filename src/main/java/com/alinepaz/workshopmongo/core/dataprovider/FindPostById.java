package com.alinepaz.workshopmongo.core.dataprovider;

import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.core.domain.User;

import java.util.Optional;

public interface FindPostById {

    Optional<Post> findById(String id);
}
