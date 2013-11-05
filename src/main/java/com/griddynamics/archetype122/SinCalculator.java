package com.griddynamics.archetype122;

import com.griddynamics.jagger.engine.e1.collector.MetricCalculator;

public class SinCalculator  implements MetricCalculator {

    private double x = 0;
    private final double step = Math.PI/500;

    @Override
    public Double calculate(Object response) {
        double result = Math.sin(x) + 1;
        x += step;
        return result;
    }
}