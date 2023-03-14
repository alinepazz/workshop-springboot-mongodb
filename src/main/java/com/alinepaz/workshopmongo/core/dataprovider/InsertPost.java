package com.alinepaz.workshopmongo.core.dataprovider;


import com.alinepaz.workshopmongo.core.domain.Post;

public interface InsertPost {

    void insert(String id, Post post);
}
