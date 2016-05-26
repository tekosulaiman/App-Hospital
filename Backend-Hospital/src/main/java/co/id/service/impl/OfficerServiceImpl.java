package co.id.service.impl;

import co.id.dao.OfficerDAO;
import co.id.dao.impl.OfficerDAOImpl;
import co.id.model.Officer;
import co.id.service.OfficerService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class OfficerServiceImpl implements OfficerService{

    private final OfficerDAO officerDAO;
    
    public OfficerServiceImpl() {
       officerDAO = new OfficerDAOImpl();
    }

    @Override
    public void save(Officer officer) {
       officerDAO.save(officer);
    }

    @Override
    public void saveOrUpdate(Officer officer) {
      officerDAO.saveOrUpdate(officer);
    }

    @Override
    public void delete(Officer officer) {
        officerDAO.delete(officer);
    }

    @Override
    public List<Officer> getAllOfficers() {
         return officerDAO.getAllOfficers();
    }
}