package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CustomerModel;

public class CustomerDAOImpl implements CustomerDAO{
	 private ConnectionDAO db;
	 private Connection connection;

	    public CustomerDAOImpl() {
	        db = new ConnectionDAO();
	    }

		@Override
		public void addCustomer(CustomerModel customer) {
			 String sql = "INSERT INTO customer (SoCMND, Tenkhachhang, Gaden, Gia) VALUES (?, ?, ?, ?)";
		        try {
		            connection = db.getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setString(1, customer.getSoCMND());
		            preparedStatement.setString(2, customer.getTenkhachhang());
		            preparedStatement.setString(3, customer.getGaden());
		            preparedStatement.setDouble(4, customer.getGia());
		            preparedStatement.executeUpdate();
		            preparedStatement.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            db.closeConnection();
		        }
		 }

		@Override
			    public List<CustomerModel> getAllCustomers() {
			        List<CustomerModel> customers = new ArrayList<>();
			        String sql = "SELECT * FROM customer";
			        try {
			            connection = db.getConnection();
			            PreparedStatement preparedStatement = connection.prepareStatement(sql);
			            ResultSet resultSet = preparedStatement.executeQuery();
			            while (resultSet.next()) {
			                CustomerModel customer = new CustomerModel(
			                        resultSet.getString("SoCMND"),
			                        resultSet.getString("Tenkhachhang"),
			                        resultSet.getString("Gaden"),
			                        resultSet.getDouble("Gia"));
			                customers.add(customer);
			            }
			            resultSet.close();
			            preparedStatement.close();
			        } catch (SQLException e) {
			            e.printStackTrace();
			        } finally {
			            db.closeConnection();
			        }
			        return customers;
			    }

		@Override
		public CustomerModel getCustomerById(String id) {
			 CustomerModel customer = null;
		        String sql = "SELECT * FROM customer WHERE SoCMND = ?";
		        try {
		            connection = db.getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setString(1, id);
		            ResultSet resultSet = preparedStatement.executeQuery();
		            if (resultSet.next()) {
		                customer = new CustomerModel(
		                        resultSet.getString("SoCMND"),
		                        resultSet.getString("Tenkhachhang"),
		                        resultSet.getString("Gaden"),
		                        resultSet.getDouble("Gia"));
		            }
		            resultSet.close();
		            preparedStatement.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            db.closeConnection();
		        }
		        return customer;
		    }

		@Override
		public void deleteCustomer(String id) {
			 String sql = "DELETE FROM customer WHERE SoCMND = ?";
		        try {
		            connection = db.getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setString(1, id);
		            preparedStatement.executeUpdate();
		            preparedStatement.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            db.closeConnection();
		        }
		}

		@Override
		public void updateCustomer(CustomerModel customer) {
			  String sql = "UPDATE customer SET Tenkhachhang = ?, Gaden = ?, Gia = ? WHERE SoCMND = ?";
		        try {
		            connection = db.getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setString(1, customer.getTenkhachhang());
		            preparedStatement.setString(2, customer.getGaden());
		            preparedStatement.setDouble(3, customer.getGia());
		            preparedStatement.setString(4, customer.getSoCMND());
		            preparedStatement.executeUpdate();
		            preparedStatement.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            db.closeConnection();
		        }
		    }
		}


