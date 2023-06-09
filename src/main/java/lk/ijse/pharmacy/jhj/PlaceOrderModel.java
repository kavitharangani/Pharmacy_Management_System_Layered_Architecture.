package lk.ijse.pharmacy.jhj;

import lk.ijse.pharmacy.db.DBConnection;
import lk.ijse.pharmacy.model.CartPlaceOrderDTO;


import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class PlaceOrderModel {

    public static boolean save(String customerId, String orderId, double total, List<CartPlaceOrderDTO> dtoList) throws SQLException {
        Connection connection = null;

        try {
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);

            boolean isSave =OrderModel.save(orderId,LocalDate.now(),customerId,total);
            if (isSave){
                boolean isUpdated = MedicineModel.updateQtySupplies(dtoList);
                if (isUpdated){
                    boolean isSaveOrderDetail = OrderDetailModel.save1(orderId,dtoList);
                    if(isSaveOrderDetail) {
                        connection.commit();
                        return true;
                    }
                }
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
            return false;
        }finally {
            connection.setAutoCommit(true);
        }
    }

}
