package egovk.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private String deliveryId;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
}
