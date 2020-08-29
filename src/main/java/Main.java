import metric.weight.Gram;
import metric.weight.KiloGram;
import metric.weight.Weight;

public class Main {

    public static void main(final String[] args) {
        final Gram gram = Weight.gram(10);
        final KiloGram kiloGram = Weight.kilogram(1.4);

        System.out.println(kiloGram.multiply(2).add(gram));
    }
}
