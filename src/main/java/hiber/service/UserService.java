package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    User readUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> listUsers();
    User findByUsername(String username);
}
