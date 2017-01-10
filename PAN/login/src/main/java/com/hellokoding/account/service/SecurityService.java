package com.hellokoding.account.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autologin(final String username, final String password);
}
