package egovk.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateDeliveryCommand {

    private String deliveryId;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
}
