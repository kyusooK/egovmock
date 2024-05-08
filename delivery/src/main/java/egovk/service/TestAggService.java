package egovk.service;

import egovk.domain.*;
import java.util.List;
import java.util.Optional;

public interface TestAggService {
    List<TestAgg> getAllTestAggs() throws Exception;
    Optional<TestAgg> getTestAggById(Long id) throws Exception;
    TestAgg createTestAgg(TestAgg testAgg) throws Exception;
    TestAgg updateTestAgg(TestAgg testAgg) throws Exception;
    void deleteTestAgg(Long id) throws Exception;
}
