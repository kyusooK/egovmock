package egovk.domain;

import egovk.domain.*;
import egovk.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryUpdated extends AbstractEvent {

    private String deliveryId;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;

    public DeliveryUpdated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
