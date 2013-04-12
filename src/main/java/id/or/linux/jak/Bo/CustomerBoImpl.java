package id.or.linux.jak.Bo;

import id.or.linux.jak.DAO.CustomerDao;
import id.or.linux.jak.DAO.CustomerDaoImpl;
import id.or.linux.jak.domain.Customer;
import id.or.linux.spring.SpringApplicationContext;

public class CustomerBoImpl implements CustomerBo {
//	CustomerDao customerDao = (CustomerDao) SpringApplicationContext.getBean("customerDao");

	CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}





	@Override
	public void AddCustomer(Customer custom) {
		// TODO Auto-generated method stub
		
		customerDao.addCustomer(custom);
	}
	
	

}
