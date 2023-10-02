package lk.ijse.spring.dto;


import java.math.BigDecimal;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
public class OrderDetailsDTO {
    private String oid;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;
}
