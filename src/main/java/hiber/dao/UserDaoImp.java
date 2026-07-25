package hiber.dao;

import hiber.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User readUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
entityManager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
entityManager.remove(readUser(id));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        List<User> query= entityManager.createQuery("from User").getResultList();
        return query;
    }
}
