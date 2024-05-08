package egovk.domain;

import egovk.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "testAggs", path = "testAggs")
public interface TestAggRepository
    extends PagingAndSortingRepository<TestAgg, Long> {}
