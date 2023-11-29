package interfaces;

import classes.Customer;

public interface CustomerOperation {

    public Customer getCustomer(String Nid);

    void insertCustomer(Customer c);

    void removeCustomer(Customer c);

    void showAllCustomers();

}