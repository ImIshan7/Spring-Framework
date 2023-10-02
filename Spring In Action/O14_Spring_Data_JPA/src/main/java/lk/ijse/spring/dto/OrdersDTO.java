package lk.ijse.spring.dto;



import java.time.LocalDate;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
public class OrdersDTO {
    private String oid;
    private LocalDate date;
    private String cusID;
    private List<OrderDetailsDTO> orderDetails;


}
