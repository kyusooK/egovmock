package egovk.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateOrderCommand {

    private String orderId;
    private String productId;
    private String qty;
    private String productName;
}
