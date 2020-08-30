package metric.surface;

import java.math.BigDecimal;

public class DeciMeter2 implements Surface {
    private BigDecimal value;

    protected DeciMeter2(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Decimeter2", value);
    }

    @Override
    public MilliMeter2 toMilliMeter2() {
        return Surface.millimeter2(this.multiply(BigDecimal.valueOf(Math.pow(10, 4))).getValue());
    }

    @Override
    public CentiMeter2 toCentiMeter2() {
        return Surface.centimeter2(this.multiply(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public DeciMeter2 toDeciMeter2() {
        return Surface.decimeter2(value);
    }

    @Override
    public Meter2 toMeter2() {
        return Surface.meter2(this.divide(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public DecaMeter2 toDecaMeter2() {
        return Surface.decameter2(this.divide(BigDecimal.valueOf(Math.pow(10, 4))).getValue());
    }

    @Override
    public HectoMeter2 toHectoMeter2() {
        return Surface.hectometer2(this.divide(BigDecimal.valueOf(Math.pow(10, 6))).getValue());
    }

    @Override
    public KiloMeter2 toKiloMeter2() {
        return Surface.kilometer2(this.divide(BigDecimal.valueOf(Math.pow(10, 8))).getValue());
    }

    @Override
    public Surface add(final Surface surface) {
        this.value = this.value.add(surface.toDeciMeter2().getValue());
        return this;
    }

    @Override
    public Surface subtract(final Surface surface) {
        this.value = this.value.subtract(surface.toDeciMeter2().getValue());
        return this;
    }

    @Override
    public Surface multiply(final BigDecimal multiplier) {
        this.value = this.value.multiply(multiplier);
        return this;
    }

    @Override
    public Surface divide(final BigDecimal divider) {
        this.value = this.value.divide(divider);
        return this;
    }
}
