package egovk.infra;

import egovk.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestAggHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TestAgg>> {

    @Override
    public EntityModel<TestAgg> process(EntityModel<TestAgg> model) {
        return model;
    }
}
