package co.id.service.impl;

import co.id.dao.InpatientDAO;
import co.id.dao.impl.InpatientDAOImpl;
import co.id.model.Inpatient;
import co.id.service.InpatientService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class InpatientServiceImpl implements InpatientService{

    private final InpatientDAO inpatientDAO;
    
    public InpatientServiceImpl() {
       inpatientDAO = new InpatientDAOImpl();
    }

    @Override
    public void save(Inpatient inpatient) {
       inpatientDAO.save(inpatient);
    }

    @Override
    public void saveOrUpdate(Inpatient inpatient) {
      inpatientDAO.saveOrUpdate(inpatient);
    }

    @Override
    public void delete(Inpatient inpatient) {
        inpatientDAO.delete(inpatient);
    }

    @Override
    public List<Inpatient> getAllInpatients() {
         return inpatientDAO.getAllInpatients();
    }
}