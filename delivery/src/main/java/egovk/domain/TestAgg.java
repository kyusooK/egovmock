package egovk.domain;

import egovk.DeliveryApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TestAgg_table")
@Data
//<<< DDD / Aggregate Root
public class TestAgg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static TestAggRepository repository() {
        TestAggRepository testAggRepository = DeliveryApplication.applicationContext.getBean(
            TestAggRepository.class
        );
        return testAggRepository;
    }
}
//>>> DDD / Aggregate Root
