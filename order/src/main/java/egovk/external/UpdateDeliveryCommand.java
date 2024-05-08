package egovk.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateDeliveryCommand {

    @Id
    private String deliveryId;

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
}
