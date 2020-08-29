import metric.distance.Distance;
import metric.distance.Meter;
import metric.weight.Gram;
import metric.weight.KiloGram;
import metric.weight.MilliGram;
import metric.weight.Weight;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<Weight<?>> weights = List.of(
                Weight.milligram(24),
                Weight.gram(1),
                Weight.kilogram(1.401)
        );

        final List<Distance<?>> distances = List.of(
                Distance.millimeter(24),
                Distance.meter(1),
                Distance.kilometer(1.401)
        );

        final Gram initialGram = Weight.gram(0);
        final Meter initialMeter = Distance.meter(0);

        Weight<?> gramResult = weights.stream().reduce(initialGram, (acc, weight) -> acc = (Weight<?>) acc.add(weight));
        Distance<?> meterResult = distances.stream().reduce(initialMeter, (acc, distance) -> acc = (Distance<?>) acc.add(distance));

        System.out.println(gramResult);
        System.out.println(meterResult);
    }
}
