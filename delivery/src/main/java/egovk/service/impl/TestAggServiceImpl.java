package egovk.service.impl;

import egovk.domain.TestAgg;
import egovk.domain.TestAggRepository;
import egovk.service.TestAggService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testAggService")
@Transactional
public class TestAggServiceImpl
    extends EgovAbstractServiceImpl
    implements TestAggService {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        TestAggServiceImpl.class
    );

    @Autowired
    TestAggRepository testAggRepository;

    @Override
    public List<TestAgg> getAllTestAggs() throws Exception {
        // Get all testAggs
        return StreamSupport
            .stream(testAggRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<TestAgg> getTestAggById(Long id) throws Exception {
        // Get a testAgg by ID
        return testAggRepository.findById(id);
    }

    @Override
    public TestAgg createTestAgg(TestAgg testAgg) throws Exception {
        // Create a new testAgg
        return testAggRepository.save(testAgg);
    }

    @Override
    public TestAgg updateTestAgg(TestAgg testAgg) throws Exception {
        // Update an existing testAgg via TestAggService
        if (testAggRepository.existsById(testAgg.getId())) {
            return testAggRepository.save(testAgg);
        } else {
            throw processException("info.nodata.msg");
        }
    }

    @Override
    public void deleteTestAgg(Long id) throws Exception {
        // Delete a testAgg
        testAggRepository.deleteById(id);
    }
}
