package egovk.infra;

import egovk.domain.*;
import egovk.service.*;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/testAggs")
public class TestAggController {

    @Resource(name = "testAggService")
    private TestAggService testAggService;

    @GetMapping("/testAggs")
    public List<TestAgg> getAllTestAggs() throws Exception {
        // Get all testAggs via TestAggService
        return testAggService.getAllTestAggs();
    }

    @GetMapping("/testAggs/{id}")
    public Optional<TestAgg> getTestAggById(@PathVariable Long id)
        throws Exception {
        // Get a testAgg by ID via TestAggService
        return testAggService.getTestAggById(id);
    }

    @PostMapping("/testAggs")
    public TestAgg createTestAgg(@RequestBody TestAgg testAgg)
        throws Exception {
        // Create a new testAgg via TestAggService
        return testAggService.createTestAgg(testAgg);
    }

    @PutMapping("/testAggs/{id}")
    public TestAgg updateTestAgg(
        @PathVariable Long id,
        @RequestBody TestAgg testAgg
    ) throws Exception {
        // Update an existing testAgg via TestAggService
        return testAggService.updateTestAgg(testAgg);
    }

    @DeleteMapping("/testAggs/{id}")
    public void deleteTestAgg(@PathVariable Long id) throws Exception {
        // Delete a testAgg via TestAggService
        testAggService.deleteTestAgg(id);
    }
}
