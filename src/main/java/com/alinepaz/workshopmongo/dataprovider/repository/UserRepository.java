package com.alinepaz.workshopmongo.dataprovider.repository;

import com.alinepaz.workshopmongo.dataprovider.repository.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}
