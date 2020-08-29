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

        final Gram initial = Weight.gram(0);

        Weight<?> result = weights.stream().reduce(initial, (acc, weight) -> acc = (Weight<?>) acc.add(weight));

        System.out.println(result);
    }
}
