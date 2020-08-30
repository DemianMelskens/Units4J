import metric.distance.Distance;
import metric.surface.Surface;
import metric.weight.Weight;

import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<Weight> weights = List.of(
                Weight.milligram(24),
                Weight.gram(1),
                Weight.kilogram(1.401)
        );

        final List<Distance> distances = List.of(
                Distance.millimeter(24),
                Distance.meter(1),
                Distance.kilometer(1.401)
        );

        final Weight initialGram = Weight.gram(0);
        final Distance initialMeter = Distance.hectometer(0);

        final Weight gramResult = weights.stream().reduce(initialGram, Weight::add);
        final Distance meterResult = distances.stream().reduce(initialMeter, Distance::add);

        final Surface kilometerSquared = Surface.kilometer2(1);

        System.out.println(gramResult);
        System.out.println(meterResult);
        System.out.println(kilometerSquared.toMilliMeter2());
    }
}
