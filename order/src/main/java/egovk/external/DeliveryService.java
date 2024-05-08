package egovk.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "delivery", url = "${api.url.delivery}")
public interface DeliveryService {
    @RequestMapping(
        method = RequestMethod.PUT,
        path = "/deliveries/{id}/updatedelivery"
    )
    public void updateDelivery(
        @PathVariable("id") String deliveryId,
        @RequestBody UpdateDeliveryCommand updateDeliveryCommand
    );
}
