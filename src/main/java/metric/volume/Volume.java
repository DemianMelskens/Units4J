package metric.volume;

import metric.Unit;

import java.math.BigDecimal;

public interface Volume extends Unit {
    static MilliMeter3 millimeter3(final Integer value) {
        return new MilliMeter3(BigDecimal.valueOf(value));
    }

    static MilliMeter3 millimeter3(final Long value) {
        return new MilliMeter3(BigDecimal.valueOf(value));
    }

    static MilliMeter3 millimeter3(final Double value) {
        return new MilliMeter3(BigDecimal.valueOf(value));
    }

    static MilliMeter3 millimeter3(final BigDecimal value) {
        return new MilliMeter3(value);
    }

    static CentiMeter3 centimeter3(final Integer value) {
        return new CentiMeter3(BigDecimal.valueOf(value));
    }

    static CentiMeter3 centimeter3(final Long value) {
        return new CentiMeter3(BigDecimal.valueOf(value));
    }

    static CentiMeter3 centimeter3(final Double value) {
        return new CentiMeter3(BigDecimal.valueOf(value));
    }

    static CentiMeter3 centimeter3(final BigDecimal value) {
        return new CentiMeter3(value);
    }

    static DeciMeter3 decimeter3(final Integer value) {
        return new DeciMeter3(BigDecimal.valueOf(value));
    }

    static DeciMeter3 decimeter3(final Long value) {
        return new DeciMeter3(BigDecimal.valueOf(value));
    }

    static DeciMeter3 decimeter3(final Double value) {
        return new DeciMeter3(BigDecimal.valueOf(value));
    }

    static DeciMeter3 decimeter3(final BigDecimal value) {
        return new DeciMeter3(value);
    }

    static Meter3 meter3(final Integer value) {
        return new Meter3(BigDecimal.valueOf(value));
    }

    static Meter3 meter3(final Long value) {
        return new Meter3(BigDecimal.valueOf(value));
    }

    static Meter3 meter3(final Double value) {
        return new Meter3(BigDecimal.valueOf(value));
    }

    static Meter3 meter3(final BigDecimal value) {
        return new Meter3(value);
    }

    static DecaMeter3 decameter3(final Integer value) {
        return new DecaMeter3(BigDecimal.valueOf(value));
    }

    static DecaMeter3 decameter3(final Long value) {
        return new DecaMeter3(BigDecimal.valueOf(value));
    }

    static DecaMeter3 decameter3(final Double value) {
        return new DecaMeter3(BigDecimal.valueOf(value));
    }

    static DecaMeter3 decameter3(final BigDecimal value) {
        return new DecaMeter3(value);
    }

    static HectoMeter3 hectometer3(final Integer value) {
        return new HectoMeter3(BigDecimal.valueOf(value));
    }

    static HectoMeter3 hectometer3(final Long value) {
        return new HectoMeter3(BigDecimal.valueOf(value));
    }

    static HectoMeter3 hectometer3(final Double value) {
        return new HectoMeter3(BigDecimal.valueOf(value));
    }

    static HectoMeter3 hectometer3(final BigDecimal value) {
        return new HectoMeter3(value);
    }

    static KiloMeter3 kilometer3(final Integer value) {
        return new KiloMeter3(BigDecimal.valueOf(value));
    }

    static KiloMeter3 kilometer3(final Long value) {
        return new KiloMeter3(BigDecimal.valueOf(value));
    }

    static KiloMeter3 kilometer3(final Double value) {
        return new KiloMeter3(BigDecimal.valueOf(value));
    }

    static MilliLiter milliliter(final Integer value) {
        return new MilliLiter(BigDecimal.valueOf(value));
    }

    static MilliLiter milliliter(final Long value) {
        return new MilliLiter(BigDecimal.valueOf(value));
    }

    static MilliLiter milliliter(final Double value) {
        return new MilliLiter(BigDecimal.valueOf(value));
    }

    static MilliLiter milliliter(final BigDecimal value) {
        return new MilliLiter(value);
    }

    static CentiLiter centiliter(final Integer value) {
        return new CentiLiter(BigDecimal.valueOf(value));
    }

    static CentiLiter centiliter(final Long value) {
        return new CentiLiter(BigDecimal.valueOf(value));
    }

    static CentiLiter centiliter(final Double value) {
        return new CentiLiter(BigDecimal.valueOf(value));
    }

    static CentiLiter centiliter(final BigDecimal value) {
        return new CentiLiter(value);
    }

    static DeciLiter deciliter(final Integer value) {
        return new DeciLiter(BigDecimal.valueOf(value));
    }

    static DeciLiter deciliter(final Long value) {
        return new DeciLiter(BigDecimal.valueOf(value));
    }

    static DeciLiter deciliter(final Double value) {
        return new DeciLiter(BigDecimal.valueOf(value));
    }

    static DeciLiter deciliter(final BigDecimal value) {
        return new DeciLiter(value);
    }

    static Liter liter(final Integer value) {
        return new Liter(BigDecimal.valueOf(value));
    }

    static Liter liter(final Long value) {
        return new Liter(BigDecimal.valueOf(value));
    }

    static Liter liter(final Double value) {
        return new Liter(BigDecimal.valueOf(value));
    }

    static Liter liter(final BigDecimal value) {
        return new Liter(value);
    }

    static DecaLiter decaliter(final Integer value) {
        return new DecaLiter(BigDecimal.valueOf(value));
    }

    static DecaLiter decaliter(final Long value) {
        return new DecaLiter(BigDecimal.valueOf(value));
    }

    static DecaLiter decaliter(final Double value) {
        return new DecaLiter(BigDecimal.valueOf(value));
    }

    static DecaLiter decaliter(final BigDecimal value) {
        return new DecaLiter(value);
    }

    static HectoLiter hectoliter(final Integer value) {
        return new HectoLiter(BigDecimal.valueOf(value));
    }

    static HectoLiter hectoliter(final Long value) {
        return new HectoLiter(BigDecimal.valueOf(value));
    }

    static HectoLiter hectoliter(final Double value) {
        return new HectoLiter(BigDecimal.valueOf(value));
    }

    static HectoLiter hectoliter(final BigDecimal value) {
        return new HectoLiter(value);
    }

    static KiloLiter kiloliter(final Integer value) {
        return new KiloLiter(BigDecimal.valueOf(value));
    }

    static KiloLiter kiloliter(final Long value) {
        return new KiloLiter(BigDecimal.valueOf(value));
    }

    static KiloLiter kiloliter(final Double value) {
        return new KiloLiter(BigDecimal.valueOf(value));
    }

    static KiloMeter3 kilometer3(final BigDecimal value) {
        return new KiloMeter3(value);
    }

    MilliMeter3 toMilliMeter3();

    CentiMeter3 toCentiMeter3();

    DeciMeter3 toDeciMeter3();

    Meter3 toMeter3();

    DecaMeter3 toDecaMeter3();

    HectoMeter3 toHectoMeter3();

    KiloMeter3 toKiloMeter3();

    Volume add(final Volume volume);

    Volume subtract(final Volume volume);

    Volume multiply(final BigDecimal multiplicand);

    Volume divide(final BigDecimal divisor);
}
