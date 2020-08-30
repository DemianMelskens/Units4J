package metric.surface;

import metric.Unit;

import java.math.BigDecimal;

public interface Surface extends Unit {
    static MilliMeter2 millimeter2(final Integer value) {
        return new MilliMeter2(BigDecimal.valueOf(value));
    }

    static MilliMeter2 millimeter2(final Long value) {
        return new MilliMeter2(BigDecimal.valueOf(value));
    }

    static MilliMeter2 millimeter2(final Double value) {
        return new MilliMeter2(BigDecimal.valueOf(value));
    }

    static MilliMeter2 millimeter2(final BigDecimal value) {
        return new MilliMeter2(value);
    }

    static CentiMeter2 centimeter2(final Integer value) {
        return new CentiMeter2(BigDecimal.valueOf(value));
    }

    static CentiMeter2 centimeter2(final Long value) {
        return new CentiMeter2(BigDecimal.valueOf(value));
    }

    static CentiMeter2 centimeter2(final Double value) {
        return new CentiMeter2(BigDecimal.valueOf(value));
    }

    static CentiMeter2 centimeter2(final BigDecimal value) {
        return new CentiMeter2(value);
    }

    static DeciMeter2 decimeter2(final Integer value) {
        return new DeciMeter2(BigDecimal.valueOf(value));
    }

    static DeciMeter2 decimeter2(final Long value) {
        return new DeciMeter2(BigDecimal.valueOf(value));
    }

    static DeciMeter2 decimeter2(final Double value) {
        return new DeciMeter2(BigDecimal.valueOf(value));
    }

    static DeciMeter2 decimeter2(final BigDecimal value) {
        return new DeciMeter2(value);
    }

    static Meter2 meter2(final Integer value) {
        return new Meter2(BigDecimal.valueOf(value));
    }

    static Meter2 meter2(final Long value) {
        return new Meter2(BigDecimal.valueOf(value));
    }

    static Meter2 meter2(final Double value) {
        return new Meter2(BigDecimal.valueOf(value));
    }

    static Meter2 meter2(final BigDecimal value) {
        return new Meter2(value);
    }

    static DecaMeter2 decameter2(final Integer value) {
        return new DecaMeter2(BigDecimal.valueOf(value));
    }

    static DecaMeter2 decameter2(final Long value) {
        return new DecaMeter2(BigDecimal.valueOf(value));
    }

    static DecaMeter2 decameter2(final Double value) {
        return new DecaMeter2(BigDecimal.valueOf(value));
    }

    static DecaMeter2 decameter2(final BigDecimal value) {
        return new DecaMeter2(value);
    }

    static HectoMeter2 hectometer2(final Integer value) {
        return new HectoMeter2(BigDecimal.valueOf(value));
    }

    static HectoMeter2 hectometer2(final Long value) {
        return new HectoMeter2(BigDecimal.valueOf(value));
    }

    static HectoMeter2 hectometer2(final Double value) {
        return new HectoMeter2(BigDecimal.valueOf(value));
    }

    static HectoMeter2 hectometer2(final BigDecimal value) {
        return new HectoMeter2(value);
    }

    static KiloMeter2 kilometer2(final Integer value) {
        return new KiloMeter2(BigDecimal.valueOf(value));
    }

    static KiloMeter2 kilometer2(final Long value) {
        return new KiloMeter2(BigDecimal.valueOf(value));
    }

    static KiloMeter2 kilometer2(final Double value) {
        return new KiloMeter2(BigDecimal.valueOf(value));
    }

    static KiloMeter2 kilometer2(final BigDecimal value) {
        return new KiloMeter2(value);
    }

    MilliMeter2 toMilliMeter2();

    CentiMeter2 toCentiMeter2();

    DeciMeter2 toDeciMeter2();

    Meter2 toMeter2();

    DecaMeter2 toDecaMeter2();

    HectoMeter2 toHectoMeter2();

    KiloMeter2 toKiloMeter2();

    Surface add(final Surface surface);

    Surface subtract(final Surface surface);

    Surface multiply(final BigDecimal multiplicand);

    Surface divide(final BigDecimal divisor);
}
