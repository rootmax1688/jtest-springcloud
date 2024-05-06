package order.jtest.springclould.service;

import com.jtest.springcloud.pojo.Payment;
import order.jtest.springclould.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImple implements PaymentService {
    @Autowired
    PaymentDao paymentDao2;
    @Override
    public int create(Payment payment) {
        return paymentDao2.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao2.queryById(id);
    }
}