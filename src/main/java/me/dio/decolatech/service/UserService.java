package me.dio.decolatech.service;

import me.dio.decolatech.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
