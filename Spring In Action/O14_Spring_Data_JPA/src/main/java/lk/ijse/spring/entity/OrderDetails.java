package lk.ijse.spring.entity;


import java.math.BigDecimal;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//@ToString
//@IdClass(OrderItem_PK.class)
public class OrderDetails {
//    @Id
    private String oid;
//    @Id
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    //Out-Verse
    //@ManyToOne
    //@JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    //Out-verse
   // @ManyToOne
    //@JoinColumn(name = "itemCode",referencedColumnName = "code",insertable = false,updatable = false)
    private Item items;
}
