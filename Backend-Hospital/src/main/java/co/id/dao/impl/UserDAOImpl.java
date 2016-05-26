package co.id.dao.impl;

import co.id.dao.UserDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.User;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class UserDAOImpl extends BasisDAO<User> implements UserDAO{

    @Override
    public List<User> getAllUsers() {
        List list = getSession().createCriteria(User.class).list();
        return list;
    }
}