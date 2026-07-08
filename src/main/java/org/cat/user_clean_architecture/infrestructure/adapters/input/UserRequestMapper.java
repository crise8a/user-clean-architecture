package org.cat.user_clean_architecture.infrestructure.adapters.input;

import org.cat.user_clean_architecture.infrestructure.adapters.input.dto.UserRequest;
import org.cat.user_clean_architecture.infrestructure.adapters.input.dto.UserResponse;
import org.cat.user_clean_architecture.infrestructure.adapters.output.mapper.UserEntityMapper;
import org.cat.user_clean_architecture.model.User;
import org.mapstruct.factory.Mappers;

public interface UserRequestMapper {

    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);
}
