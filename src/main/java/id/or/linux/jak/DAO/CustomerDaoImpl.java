package id.or.linux.jak.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



import id.or.linux.jak.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().save(customer);
	}

	
	
}
