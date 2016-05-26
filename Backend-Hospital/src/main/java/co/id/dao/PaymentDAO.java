package co.id.dao;

import co.id.model.Payment;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public interface PaymentDAO {
    public void save(Payment payment);
    public void saveOrUpdate(Payment Payment);
    public void delete(Payment Payment);
    public List<Payment> getAllPayments();
}