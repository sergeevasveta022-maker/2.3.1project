package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;


    @Transactional
    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User readUser(Long id) {
        return userDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
userDao.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
userDao.deleteById(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}
