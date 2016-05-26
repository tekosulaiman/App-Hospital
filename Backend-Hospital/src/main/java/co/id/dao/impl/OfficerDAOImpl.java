package co.id.dao.impl;

import co.id.dao.OfficerDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Officer;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class OfficerDAOImpl extends BasisDAO<Officer> implements OfficerDAO{

    @Override
    public List<Officer> getAllOfficers() {
        List list = getSession().createCriteria(Officer.class).list();
        return list;
    }
}