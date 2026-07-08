package org.cat.user_clean_architecture.infrestructure.adapters.output;



import org.cat.user_clean_architecture.application.ports.output.UserPorts;
import org.cat.user_clean_architecture.infrestructure.adapters.output.mapper.UserEntityMapper;
import org.cat.user_clean_architecture.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter implements UserPorts {

    private final UserEntityRepository repository;
    private final UserEntityMapper userEntityMapper;

    public UserAdapter(UserEntityRepository repository, UserEntityMapper userEntityMapper){
        this.repository = repository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User create(User user) {
        UserEntity userEntity = repository.save(
                UserEntityMapper.INSTANCE.toUserEntity(user)
        );
        return UserEntityMapper.INSTANCE.toUser(userEntity);

    }

}

