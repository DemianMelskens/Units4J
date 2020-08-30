package metric.distance;

import java.math.BigDecimal;

public class KiloMeter implements Distance {

    private BigDecimal value;

    protected KiloMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Kilometer", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.divide(BigDecimal.valueOf(1000000)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.multiply(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(value);
    }

    @Override
    public Distance add(final Distance distance) {
        this.value = this.value.add(distance.toKiloMeter().getValue());
        return this;
    }

    @Override
    public Distance subtract(final Distance distance) {
        this.value = this.value.subtract(distance.toKiloMeter().getValue());
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
