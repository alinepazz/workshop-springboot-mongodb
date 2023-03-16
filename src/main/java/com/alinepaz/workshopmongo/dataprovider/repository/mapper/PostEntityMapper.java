package com.alinepaz.workshopmongo.dataprovider.repository.mapper;

import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.PostEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostEntityMapper {

    PostEntity toPostEntity(Post post);

    List<Post> toPost(List<PostEntity> posts);
}
