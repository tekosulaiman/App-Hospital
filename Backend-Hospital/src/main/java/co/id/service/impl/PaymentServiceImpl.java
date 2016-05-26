package co.id.service.impl;

import co.id.dao.PaymentDAO;
import co.id.dao.impl.PaymentDAOImpl;
import co.id.model.Payment;
import co.id.service.PaymentService;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PaymentServiceImpl implements PaymentService{

    private final PaymentDAO paymentDAO;
    
    public PaymentServiceImpl() {
       paymentDAO = new PaymentDAOImpl();
    }

    @Override
    public void save(Payment patient) {
       paymentDAO.save(patient);
    }

    @Override
    public void saveOrUpdate(Payment patient) {
      paymentDAO.saveOrUpdate(patient);
    }

    @Override
    public void delete(Payment patient) {
        paymentDAO.delete(patient);
    }

    @Override
    public List<Payment> getAllPayments() {
         return paymentDAO.getAllPayments();
    }
}