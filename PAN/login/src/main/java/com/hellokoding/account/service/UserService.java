package com.hellokoding.account.service;

import com.hellokoding.account.model.User;

public interface UserService {

    void save(final User user);

    User findByUsername(final String username);
}
