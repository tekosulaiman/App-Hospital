package co.id.dao.impl;

import co.id.dao.PatientDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Patient;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PatientDAOImpl extends BasisDAO<Patient> implements PatientDAO{

    @Override
    public List<Patient> getAllPatients() {
        List list = getSession().createCriteria(Patient.class).list();
        return list;
    }
}