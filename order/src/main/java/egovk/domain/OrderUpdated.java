package egovk.domain;

import egovk.domain.*;
import egovk.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderUpdated extends AbstractEvent {

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;

    public OrderUpdated(Order aggregate) {
        super(aggregate);
    }

    public OrderUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
