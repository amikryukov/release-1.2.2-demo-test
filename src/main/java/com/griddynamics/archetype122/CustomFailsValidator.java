package com.griddynamics.archetype122;

import com.griddynamics.jagger.coordinator.NodeContext;
import com.griddynamics.jagger.engine.e1.collector.ResponseValidator;

public class CustomFailsValidator <Q, E, R> extends ResponseValidator<Q, E, R> {

    public CustomFailsValidator(String taskId, String sessionId, NodeContext kernelContext) {
        super(taskId, sessionId, kernelContext);
    }

    @Override
    public String getName() {
        return "Custom Fails Validator";
    }

    private int counter = 0;

    @Override
    public boolean validate(Q q, E e, R r, long l) {

        if (counter ++ > 10) {
            counter = 0;
            return false;
        }
        return true;
    }
}
