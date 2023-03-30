package DAO;

import java.util.List;

import DTO.CustomerModel;

public interface CustomerDAO {
	  void addCustomer(CustomerModel customer);
	    List<CustomerModel> getAllCustomers();
	    CustomerModel getCustomerById(String id);
	    void deleteCustomer(String id);
	    void updateCustomer(CustomerModel customer);
}
