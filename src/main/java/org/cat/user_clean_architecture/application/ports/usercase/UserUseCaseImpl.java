package org.cat.user_clean_architecture.application.ports.usercase;

import org.cat.user_clean_architecture.application.ports.input.IUserUseCase;
import org.cat.user_clean_architecture.application.ports.output.UserPorts;
import org.cat.user_clean_architecture.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserUseCaseImpl implements IUserUseCase {

    private final UserPorts userPort;

    public UserUseCaseImpl(UserPorts userPort) {
        this.userPort = userPort;
    }

    @Override
    public User create(User user) {
        return null;
    }
}
