package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserService {

    public List<User> findAll() {
        return User.findAll().list();
    }

    public User findById(int id) {
        return User.findById(id);
    }

    @Transactional
    public User save(User user) {
        User.persist(user);
        return user;
    }

    public void delete(int id) {
        User.deleteById(id);
    }

    @Transactional
    public User changePw(int id, String newPw) {
        User.update("password = ?1 where id = ?2", newPw, id);
        return User.findById(id);
    }
}
