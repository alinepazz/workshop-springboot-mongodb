package com.alinepaz.workshopmongo.dataprovider.repository.mapper;

import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.PostEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostEntityMapper {
    PostEntity toPostEntity(Post post);

    Post toPostById(PostEntity postEntity);
}
