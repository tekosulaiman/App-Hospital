package co.id.dao;

import co.id.model.Officer;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface OfficerDAO {
    public void save(Officer officer);
    public void saveOrUpdate(Officer officer);
    public void delete(Officer officer);
    public List<Officer> getAllOfficers();
}