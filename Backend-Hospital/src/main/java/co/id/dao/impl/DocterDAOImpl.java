package co.id.dao.impl;

import co.id.dao.DocterDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Doctor;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class DocterDAOImpl extends BasisDAO<Doctor> implements DocterDAO{

    @Override
    public List<Doctor> getAllDoctors() {
        List list = getSession().createCriteria(Doctor.class).list();
        return list;
    }
}