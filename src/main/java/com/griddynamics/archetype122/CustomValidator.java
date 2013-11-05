package com.griddynamics.archetype122;

import com.griddynamics.jagger.coordinator.NodeContext;
import com.griddynamics.jagger.engine.e1.collector.ResponseValidator;

public class CustomValidator<Q, E, R> extends ResponseValidator<Q, E, R> {

    public CustomValidator(String taskId, String sessionId, NodeContext kernelContext) {
        super(taskId, sessionId, kernelContext);
    }

    @Override
    public java.lang.String getName() {
        return "Custom Validator";
    }

    @Override
    public boolean validate(Q q, E e, R s, long l) {
        return true;
    }
}
