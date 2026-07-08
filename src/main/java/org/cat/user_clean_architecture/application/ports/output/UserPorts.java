package org.cat.user_clean_architecture.application.ports.output;

import org.cat.user_clean_architecture.model.User;

public interface UserPorts {

    User create(User user);
}
