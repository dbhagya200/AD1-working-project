package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.scene.control.Alert;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CustomerDAO {
     ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException ;

    void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;

     void updateCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;

    void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
    boolean ExistCustomer(String id) throws SQLException, ClassNotFoundException ;
    ResultSet generateNewID() throws SQLException, ClassNotFoundException ;
    CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

    ResultSet getAllCustomer() throws SQLException, ClassNotFoundException;



}
