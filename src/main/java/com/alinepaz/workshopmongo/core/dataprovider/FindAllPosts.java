package com.alinepaz.workshopmongo.core.dataprovider;

import com.alinepaz.workshopmongo.core.domain.Post;

import java.util.List;

public interface FindAllPosts {

    List<Post>findAll(String id);
}
