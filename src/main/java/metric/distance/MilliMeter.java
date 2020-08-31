package metric.distance;

import java.math.BigDecimal;

public class MilliMeter implements Distance {
    private BigDecimal value;

    protected MilliMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Millimeter", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(value);
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.divide(BigDecimal.valueOf(Math.pow(10, 1))).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.divide(BigDecimal.valueOf(Math.pow(10, 3))).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.divide(BigDecimal.valueOf(Math.pow(10, 4))).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.divide(BigDecimal.valueOf(Math.pow(10, 5))).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.divide(BigDecimal.valueOf(Math.pow(10, 6))).getValue());
    }

    @Override
    public Distance add(final Distance distance) {
        this.value = this.value.add(distance.toMilliMeter().getValue());
        return this;
    }

    @Override
    public Distance subtract(final Distance distance) {
        this.value = this.value.subtract(distance.toMilliMeter().getValue());
        return this;
    }

    @Override
    public Distance multiply(final BigDecimal multiplier) {
        this.value = this.value.multiply(multiplier);
        return this;
    }

    @Override
    public Distance divide(final BigDecimal divider) {
        this.value = this.value.divide(divider);
        return this;
    }
}
