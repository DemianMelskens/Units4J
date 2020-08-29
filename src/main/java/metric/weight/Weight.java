package metric.weight;

import metric.Unit;

import java.math.BigDecimal;

public interface Weight<T> extends Unit {

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

    T add(final MilliGram milliGram);

    T add(final CentiGram centiGram);

    T add(final DeciGram deciGram);

    T add(final Gram gram);

    T add(final DecaGram decaGram);

    T add(final HectoGram hectoGram);

    T add(final KiloGram kiloGram);

    default T add(final Weight<?> weight) {
        switch (weight.getClass().getSimpleName()){
            case "MilliGram":
                return this.add((MilliGram) weight);
            case "CentiGram":
                return this.add((CentiGram) weight);
            case "DeciGram":
                return this.add((DeciGram) weight);
            case "Gram":
                return this.add((Gram) weight);
            case "DecaGram":
                return this.add((DecaGram) weight);
            case "HectoGram":
                return this.add((HectoGram) weight);
            case "KiloGram":
                return this.add((KiloGram) weight);
            default:
                throw new IllegalArgumentException(String.format("%s type is not supported!", weight.getClass().getName()));
        }
    }

    T subtract(final MilliGram milliGram);

    T subtract(final CentiGram centiGram);

    T subtract(final DeciGram deciGram);

    T subtract(final Gram gram);

    T subtract(final DecaGram decaGram);

    T subtract(final HectoGram hectoGram);

    T subtract(final KiloGram kiloGram);

    default T subtract(final Weight<?> weight) {
        switch (weight.getClass().getSimpleName()){
            case "MilliGram":
                return this.subtract((MilliGram) weight);
            case "CentiGram":
                return this.subtract((CentiGram) weight);
            case "DeciGram":
                return this.subtract((DeciGram) weight);
            case "Gram":
                return this.subtract((Gram) weight);
            case "DecaGram":
                return this.subtract((DecaGram) weight);
            case "HectoGram":
                return this.subtract((HectoGram) weight);
            case "KiloGram":
                return this.subtract((KiloGram) weight);
            default:
                throw new IllegalArgumentException(String.format("%s type is not supported!", weight.getClass().getName()));
        }
    }

    T multiply(final BigDecimal multiplicand);

    T divide(final BigDecimal divisor);

}
