package org.cat.user_clean_architecture.application.ports.input;

import org.cat.user_clean_architecture.model.User;

public interface IUserUseCase {
    User create (User user);
}
