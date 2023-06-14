package lk.ijse.pharmacy.model;

import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;

public class OrderTm {
    private String code;
    private  String description;
    private Integer qty;
    private  Double unitPrice;
    private  Double total;
    private Button btn;

    public OrderTm(String code, String description, Integer qty, Double unitPrice, Double total, Button btn) {
        this.code = code;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.total = total;
        this.btn = btn;
    }

    public static int countOrders() {
        return 0;
    }

    public static double getTotalOrderSales() {
        return 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
