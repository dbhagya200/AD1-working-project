package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {
    String generateNewOrderId() throws SQLException, ClassNotFoundException ;
   boolean existOrderId(String orderId) throws SQLException, ClassNotFoundException ;

    boolean saveOrder(OrderDTO orderDTO) throws SQLException, ClassNotFoundException;

    void commit() throws SQLException, ClassNotFoundException;
}
