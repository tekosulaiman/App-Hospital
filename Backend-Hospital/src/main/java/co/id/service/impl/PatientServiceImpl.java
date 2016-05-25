package co.id.service.impl;

import co.id.dao.PatientDAO;
import co.id.dao.impl.PatientDAOImpl;
import co.id.model.Patient;
import co.id.service.PatientService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PatientServiceImpl implements PatientService{

    private final PatientDAO patientDAO;
    
    public PatientServiceImpl() {
       patientDAO = new PatientDAOImpl();
    }

    @Override
    public void save(Patient patient) {
       patientDAO.save(patient);
    }

    @Override
    public void saveOrUpdate(Patient patient) {
      patientDAO.saveOrUpdate(patient);
    }

    @Override
    public void delete(Patient patient) {
        patientDAO.delete(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
         return patientDAO.getAllPatients();
    }
}