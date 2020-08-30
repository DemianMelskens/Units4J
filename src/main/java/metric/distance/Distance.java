package metric.distance;

import metric.Unit;

import java.math.BigDecimal;

public interface Distance extends Unit {
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

    Distance add(final Distance distance);

    Distance subtract(final Distance distance);

    Distance multiply(final BigDecimal multiplicand);

    Distance divide(final BigDecimal divisor);
}
