package com.alinepaz.workshopmongo.dataprovider.repository;

import com.alinepaz.workshopmongo.dataprovider.repository.entity.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<PostEntity, String> {
}
