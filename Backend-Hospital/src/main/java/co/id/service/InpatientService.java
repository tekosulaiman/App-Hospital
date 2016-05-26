package co.id.service;

import co.id.model.Inpatient;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface InpatientService {
    public void save(Inpatient inpatient);
    public void saveOrUpdate(Inpatient inpatient);
    public void delete(Inpatient inpatient);
    public List<Inpatient> getAllInpatients();
}