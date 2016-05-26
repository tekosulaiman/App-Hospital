package co.id.service.impl;

import co.id.dao.UserDAO;
import co.id.dao.impl.UserDAOImpl;
import co.id.model.User;
import co.id.service.UserService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;
    
    public UserServiceImpl() {
       userDAO = new UserDAOImpl();
    }

    @Override
    public void save(User user) {
       userDAO.save(user);
    }

    @Override
    public void saveOrUpdate(User user) {
      userDAO.saveOrUpdate(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public List<User> getAllUsers() {
         return userDAO.getAllUsers();
    }
}