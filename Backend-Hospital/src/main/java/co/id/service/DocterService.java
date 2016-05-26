package co.id.service;

import co.id.model.Doctor;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface DocterService {
    public void save(Doctor doctor);
    public void saveOrUpdate(Doctor doctor);
    public void delete(Doctor doctor);
    public List<Doctor> getAllDoctors();
}