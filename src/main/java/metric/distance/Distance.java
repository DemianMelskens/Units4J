package metric.distance;

import metric.Unit;

import java.math.BigDecimal;

public interface Distance<T> extends Unit {
    static MilliMeter millimeter(final Integer value) {
        return new MilliMeter(BigDecimal.valueOf(value));
    }

    static MilliMeter millimeter(final Long value) {
        return new MilliMeter(BigDecimal.valueOf(value));
    }

    static MilliMeter millimeter(final Double value) {
        return new MilliMeter(BigDecimal.valueOf(value));
    }

    static MilliMeter millimeter(final BigDecimal value) {
        return new MilliMeter(value);
    }

    static CentiMeter centimeter(final Integer value) {
        return new CentiMeter(BigDecimal.valueOf(value));
    }

    static CentiMeter centimeter(final Long value) {
        return new CentiMeter(BigDecimal.valueOf(value));
    }

    static CentiMeter centimeter(final Double value) {
        return new CentiMeter(BigDecimal.valueOf(value));
    }

    static CentiMeter centimeter(final BigDecimal value) {
        return new CentiMeter(value);
    }

    static DeciMeter decimeter(final Integer value) {
        return new DeciMeter(BigDecimal.valueOf(value));
    }

    static DeciMeter decimeter(final Long value) {
        return new DeciMeter(BigDecimal.valueOf(value));
    }

    static DeciMeter decimeter(final Double value) {
        return new DeciMeter(BigDecimal.valueOf(value));
    }

    static DeciMeter decimeter(final BigDecimal value) {
        return new DeciMeter(value);
    }

    static Meter meter(final Integer value) {
        return new Meter(BigDecimal.valueOf(value));
    }

    static Meter meter(final Long value) {
        return new Meter(BigDecimal.valueOf(value));
    }

    static Meter meter(final Double value) {
        return new Meter(BigDecimal.valueOf(value));
    }

    static Meter meter(final BigDecimal value) {
        return new Meter(value);
    }

    static DecaMeter decameter(final Integer value) {
        return new DecaMeter(BigDecimal.valueOf(value));
    }

    static DecaMeter decameter(final Long value) {
        return new DecaMeter(BigDecimal.valueOf(value));
    }

    static DecaMeter decameter(final Double value) {
        return new DecaMeter(BigDecimal.valueOf(value));
    }

    static DecaMeter decameter(final BigDecimal value) {
        return new DecaMeter(value);
    }

    static HectoMeter hectometer(final Integer value) {
        return new HectoMeter(BigDecimal.valueOf(value));
    }

    static HectoMeter hectometer(final Long value) {
        return new HectoMeter(BigDecimal.valueOf(value));
    }

    static HectoMeter hectometer(final Double value) {
        return new HectoMeter(BigDecimal.valueOf(value));
    }

    static HectoMeter hectometer(final BigDecimal value) {
        return new HectoMeter(value);
    }

    static KiloMeter kilometer(final Integer value) {
        return new KiloMeter(BigDecimal.valueOf(value));
    }

    static KiloMeter kilometer(final Long value) {
        return new KiloMeter(BigDecimal.valueOf(value));
    }

    static KiloMeter kilometer(final Double value) {
        return new KiloMeter(BigDecimal.valueOf(value));
    }

    static KiloMeter kilometer(final BigDecimal value) {
        return new KiloMeter(value);
    }

    MilliMeter toMilliMeter();

    CentiMeter toCentiMeter();

    DeciMeter toDeciMeter();

    Meter toMeter();

    DecaMeter toDecaMeter();

    HectoMeter toHectoMeter();

    KiloMeter toKiloMeter();

    T add(final MilliMeter milliMeter);

    T add(final CentiMeter centiMeter);

    T add(final DeciMeter deciMeter);

    T add(final Meter gram);

    T add(final DecaMeter decaMeter);

    T add(final HectoMeter hectoMeter);

    T add(final KiloMeter kiloMeter);

    default T add(final Distance<?> distance) {
        switch (distance.getClass().getSimpleName()) {
            case "MilliMeter":
                return this.add((MilliMeter) distance);
            case "CentiMeter":
                return this.add((CentiMeter) distance);
            case "DeciMeter":
                return this.add((DeciMeter) distance);
            case "Meter":
                return this.add((Meter) distance);
            case "DecaMeter":
                return this.add((DecaMeter) distance);
            case "HectoMeter":
                return this.add((HectoMeter) distance);
            case "KiloMeter":
                return this.add((KiloMeter) distance);
            default:
                throw new IllegalArgumentException(String.format("%s type is not supported!", distance.getClass().getName()));
        }
    }

    T subtract(final MilliMeter milliMeter);

    T subtract(final CentiMeter centiMeter);

    T subtract(final DeciMeter deciMeter);

    T subtract(final Meter gram);

    T subtract(final DecaMeter decaMeter);

    T subtract(final HectoMeter hectoMeter);

    T subtract(final KiloMeter kiloMeter);

    default T subtract(final Distance<?> distance) {
        switch (distance.getClass().getSimpleName()) {
            case "MilliMeter":
                return this.subtract((MilliMeter) distance);
            case "CentiMeter":
                return this.subtract((CentiMeter) distance);
            case "DeciMeter":
                return this.subtract((DeciMeter) distance);
            case "Meter":
                return this.subtract((Meter) distance);
            case "DecaMeter":
                return this.subtract((DecaMeter) distance);
            case "HectoMeter":
                return this.subtract((HectoMeter) distance);
            case "KiloMeter":
                return this.subtract((KiloMeter) distance);
            default:
                throw new IllegalArgumentException(String.format("%s type is not supported!", distance.getClass().getName()));
        }
    }

    T multiply(final BigDecimal multiplicand);

    T divide(final BigDecimal divisor);
}
