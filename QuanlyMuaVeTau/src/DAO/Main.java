package DAO;

import java.util.List;
import java.util.Scanner;

import DTO.CustomerModel;

public class Main {
	private static CustomerDAO customerDAO = new CustomerDAOImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Please choose an option:");
            System.out.println("1. Them 1 khach hang moi");
            System.out.println("2. Hien thi tat ca cac khach hang dang mua ve");
            System.out.println("3. Tim 1 khach hang theo CMND");
            System.out.println("4. Xoa 1 mot khach hang");
            System.out.println("5. Update du lieu theo CMND");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                  case 1:
                    addCustomer();
                    break;
				
				  case 2: 
					  getAllCustomers(); 
					  break; 
				  case 3: 
					  getCustomerById(); 
					  break; 
				  case 4: 
					  deleteCustomer(); 
					  break; 
				  case 5: 
					  updateCustomer(); 
					  break; 
				  case 6:
				  isRunning = false; 
				  break; 
				  default: System.out.println("Invalid choice");
				  break;
				 
            }
        }
    }

    private static void addCustomer() {
        System.out.print("So CMND: ");
        String SoCMND = scanner.nextLine();
        System.out.print("Ten khach hang: ");
        String Tenkhachhang = scanner.nextLine();
        System.out.print("Ga den: ");
        String Gaden = scanner.nextLine();
        System.out.print("Gia: ");
        double Gia = scanner.nextDouble();
        scanner.nextLine();
        
        CustomerModel cus = new CustomerModel(SoCMND, Tenkhachhang, Gaden, Gia);
        customerDAO.addCustomer(cus);

        System.out.println("Customer added successfully");
        }
     private static void getAllCustomers() {
    	 List<CustomerModel> cus = customerDAO.getAllCustomers();
    	 System.out.println("Danh sach khach hang mua ve:");
         for (CustomerModel customer : cus) {
             System.out.println(customer);
         }
     }
    private static void getCustomerById() {
        System.out.print("Nhap SoCMND: ");
        String SoCMND = scanner.nextLine();
        CustomerModel customer = customerDAO.getCustomerById(SoCMND);
        if (customer != null) {
            System.out.println("Tim khach hang:");
            System.out.println(customer);
        } else {
            System.out.println("Khong the tim khach hang nay");
        }
    }
    private static void deleteCustomer() {
    	 System.out.print("Nhap SoCMND: ");
         String SoCMND = scanner.nextLine();
         customerDAO.deleteCustomer(SoCMND);
         System.out.println("Customer deleted successfully");
    }
    private static void updateCustomer() {
    	  System.out.print("Nhap SoCMND muon sua: ");
          String SoCMND = scanner.nextLine();
          CustomerModel customer = customerDAO.getCustomerById(SoCMND);
          if (customer == null) {
              System.out.println("Khong tim thay khach hang nay");
              return;
          }

          System.out.print("Nhap ten khach hang: ");
          String tenkhachhang = scanner.nextLine();
          if (!tenkhachhang.isEmpty()) {
              customer.setTenkhachhang(tenkhachhang);
          }

          System.out.print("Nhap ga den: ");
          String gaden = scanner.nextLine();
          if (!gaden.isEmpty()) {
              customer.setGaden(gaden);
          }

          System.out.print("Nhap gia: ");
          String Gia = scanner.nextLine();
          if (!Gia.isEmpty()) {
              double gia = Double.parseDouble(Gia);
              customer.setGia(gia);
          }

          customerDAO.updateCustomer(customer);
          System.out.println("Customer updated successfully");
      }
    }

 