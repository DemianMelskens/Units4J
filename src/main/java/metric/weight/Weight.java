package metric.weight;

import metric.Unit;

import java.math.BigDecimal;

public interface Weight extends Unit {

    static MilliGram milligram(final Integer value) {
        return new MilliGram(BigDecimal.valueOf(value));
    }

    static MilliGram milligram(final Long value) {
        return new MilliGram(BigDecimal.valueOf(value));
    }

    static MilliGram milligram(final Double value) {
        return new MilliGram(BigDecimal.valueOf(value));
    }

    static MilliGram milligram(final BigDecimal value) {
        return new MilliGram(value);
    }

    static CentiGram centigram(final Integer value) {
        return new CentiGram(BigDecimal.valueOf(value));
    }

    static CentiGram centigram(final Long value) {
        return new CentiGram(BigDecimal.valueOf(value));
    }

    static CentiGram centigram(final Double value) {
        return new CentiGram(BigDecimal.valueOf(value));
    }

    static CentiGram centigram(final BigDecimal value) {
        return new CentiGram(value);
    }

    static DeciGram decigram(final Integer value) {
        return new DeciGram(BigDecimal.valueOf(value));
    }

    static DeciGram decigram(final Long value) {
        return new DeciGram(BigDecimal.valueOf(value));
    }

    static DeciGram decigram(final Double value) {
        return new DeciGram(BigDecimal.valueOf(value));
    }

    static DeciGram decigram(final BigDecimal value) {
        return new DeciGram(value);
    }

    static Gram gram(final Integer value) {
        return new Gram(BigDecimal.valueOf(value));
    }

    static Gram gram(final Long value) {
        return new Gram(BigDecimal.valueOf(value));
    }

    static Gram gram(final Double value) {
        return new Gram(BigDecimal.valueOf(value));
    }

    static Gram gram(final BigDecimal value) {
        return new Gram(value);
    }

    static DecaGram decagram(final Integer value) {
        return new DecaGram(BigDecimal.valueOf(value));
    }

    static DecaGram decagram(final Long value) {
        return new DecaGram(BigDecimal.valueOf(value));
    }

    static DecaGram decagram(final Double value) {
        return new DecaGram(BigDecimal.valueOf(value));
    }

    static DecaGram decagram(final BigDecimal value) {
        return new DecaGram(value);
    }

    static HectoGram hectogram(final Integer value) {
        return new HectoGram(BigDecimal.valueOf(value));
    }

    static HectoGram hectogram(final Long value) {
        return new HectoGram(BigDecimal.valueOf(value));
    }

    static HectoGram hectogram(final Double value) {
        return new HectoGram(BigDecimal.valueOf(value));
    }

    static HectoGram hectogram(final BigDecimal value) {
        return new HectoGram(value);
    }

    static KiloGram kilogram(final Integer value) {
        return new KiloGram(BigDecimal.valueOf(value));
    }

    static KiloGram kilogram(final Long value) {
        return new KiloGram(BigDecimal.valueOf(value));
    }

    static KiloGram kilogram(final Double value) {
        return new KiloGram(BigDecimal.valueOf(value));
    }

    static KiloGram kilogram(final BigDecimal value) {
        return new KiloGram(value);
    }

    MilliGram toMilliGram();

    CentiGram toCentiGram();

    DeciGram toDeciGram();

    Gram toGram();

    DecaGram toDecaGram();

    HectoGram toHectoGram();

    KiloGram toKiloGram();

    Weight add(final Weight weight);

    Weight subtract(final Weight weight);

    Weight multiply(final BigDecimal multiplicand);

    Weight divide(final BigDecimal divisor);

}
