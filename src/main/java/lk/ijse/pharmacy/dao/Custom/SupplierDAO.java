package lk.ijse.pharmacy.dao.Custom;

import lk.ijse.pharmacy.dao.CrudDAO;
import lk.ijse.pharmacy.dao.SQLUtil;
import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.entity.Supplier;
import lk.ijse.pharmacy.model.SupplierDTO;
import lk.ijse.pharmacy.util.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface SupplierDAO extends CrudDAO<Supplier> {
     //boolean save(String orderId, LocalDate now, double total) ;

    public Supplier search(String id) throws SQLException;

    public boolean delete(String id) throws SQLException;

    public List<String> getIds() throws SQLException;



}
