package co.id.dao;

import co.id.model.Patient;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface PatientDAO {
    public void save(Patient patient);
    public void saveOrUpdate(Patient patient);
    public void delete(Patient patient);
    public List<Patient> getAllPatients();
}