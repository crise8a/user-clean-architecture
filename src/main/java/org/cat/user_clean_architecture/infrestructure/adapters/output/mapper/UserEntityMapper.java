package org.cat.user_clean_architecture.infrestructure.adapters.output.mapper;

import org.cat.user_clean_architecture.infrestructure.adapters.output.UserEntity;
import org.cat.user_clean_architecture.infrestructure.adapters.output.UserEntityRepository;
import org.cat.user_clean_architecture.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityMapper {
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    UserEntity toUserEntity(User user);
    User toUser (UserEntity userEntity);
}


