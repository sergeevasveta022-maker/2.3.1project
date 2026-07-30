package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;


    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User readUser(Long id) {
        return userDao.readUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
userDao.deleteUser(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}
