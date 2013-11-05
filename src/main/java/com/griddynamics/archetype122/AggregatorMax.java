package com.griddynamics.archetype122;

import com.griddynamics.jagger.engine.e1.collector.MetricAggregator;
import com.griddynamics.jagger.engine.e1.collector.MetricAggregatorProvider;


public class AggregatorMax implements MetricAggregatorProvider {
    @Override
    public MetricAggregator provide() {
        return new MetricAggregator<Double>() {

            double max = Double.MIN_VALUE;

            @Override
            public void append(Double number) {

                if (number > max) {
                    max = number;
                }
            }

            @Override
            public Double getAggregated() {
                return max;
            }

            @Override
            public void reset() {
                max = Double.MIN_VALUE;
            }

            @Override
            public String getName() {
                return "-max";
            }
        };
    }
}
