package co.id.dao.impl;

import co.id.dao.InpatientDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Inpatient;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class InpatientDAOImpl extends BasisDAO<Inpatient> implements InpatientDAO{

    @Override
    public List<Inpatient> getAllInpatients() {
        List list = getSession().createCriteria(Inpatient.class).list();
        return list;
    }
}