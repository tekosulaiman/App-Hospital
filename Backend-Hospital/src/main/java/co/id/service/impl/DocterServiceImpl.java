package co.id.service.impl;

import co.id.dao.DocterDAO;
import co.id.dao.impl.DocterDAOImpl;
import co.id.model.Doctor;
import co.id.service.DocterService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class DocterServiceImpl implements DocterService{

    private final DocterDAO docterDAO;
    
    public DocterServiceImpl() {
       docterDAO = new DocterDAOImpl();
    }

    @Override
    public void save(Doctor doctor) {
       docterDAO.save(doctor);
    }

    @Override
    public void saveOrUpdate(Doctor doctor) {
      docterDAO.saveOrUpdate(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        docterDAO.delete(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
         return docterDAO.getAllDoctors();
    }
}