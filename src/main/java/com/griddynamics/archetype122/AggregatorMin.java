package com.griddynamics.archetype122;

import com.griddynamics.jagger.engine.e1.collector.MetricAggregator;
import com.griddynamics.jagger.engine.e1.collector.MetricAggregatorProvider;

public class AggregatorMin implements MetricAggregatorProvider {
    @Override
    public MetricAggregator provide() {
        return new MetricAggregator<Double>() {

            double min = Double.MAX_VALUE;

            @Override
            public void append(Double number) {

                if (number < min) {
                    min = number;
                }
            }

            @Override
            public Double getAggregated() {
                return min;
            }

            @Override
            public void reset() {
                min = Double.MAX_VALUE;
            }

            @Override
            public String getName() {
                return "-min";
            }
        };
    }
}
