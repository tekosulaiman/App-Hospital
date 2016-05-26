package co.id.dao;

import co.id.model.User;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface UserDAO {
    public void save(User user);
    public void saveOrUpdate(User user);
    public void delete(User user);
    public List<User> getAllUsers();
}