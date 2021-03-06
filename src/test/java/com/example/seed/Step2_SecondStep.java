package com.example.seed;

import com.google.inject.Inject;
import com.github.timols.seeder.annotation.Step;
import com.github.timols.seeder.step.SeedStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Step(number = "2")
public class Step2_SecondStep implements SeedStep {

    private static final Logger logger = LoggerFactory.getLogger(SeedStep.class);
    private final PersistenceService persistenceService;

    @Inject
    public Step2_SecondStep(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    @Override
    public void perform() {
        logger.info("2nd Step baby!!");
        Object newObject = persistenceService.find();
        logger.debug("Object Hash: " + newObject.hashCode());

    }
}
