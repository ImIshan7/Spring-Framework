package lk.ijse.spring.entity;

import java.math.BigDecimal;

//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@ToString
public class Item {
//    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private BigDecimal unitPrice;

}
