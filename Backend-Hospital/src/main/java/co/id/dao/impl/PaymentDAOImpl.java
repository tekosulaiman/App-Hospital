package co.id.dao.impl;

import co.id.dao.PaymentDAO;
import co.id.dao.base.BasisDAO;
import co.id.model.Payment;
import java.util.List;

/**
 *
 * @author tekosulaiman@yahoo.com
 */
public class PaymentDAOImpl extends BasisDAO<Payment> implements PaymentDAO{

    @Override
    public List<Payment> getAllPayments() {
        List list = getSession().createCriteria(Payment.class).list();
        return list;
    }
}