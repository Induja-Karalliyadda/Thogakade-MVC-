package model;

import dto.CustomerDto;
import dto.tm.CustomerTm;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.List;

public interface CustomerModel {
    boolean saveCustomer(CustomerDto dto) throws ClassNotFoundException, SQLException;
    boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allCustomers() throws SQLException, ClassNotFoundException;
    CustomerDto searchCustomer(String id);

}
