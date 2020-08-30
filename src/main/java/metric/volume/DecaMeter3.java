package metric.volume;

import java.math.BigDecimal;

public class DecaMeter3 implements Volume {
    private BigDecimal value;

    protected DecaMeter3(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Decameter3", value);
    }

    @Override
    public MilliMeter3 toMilliMeter3() {
        return Volume.millimeter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 12))).getValue());
    }

    @Override
    public CentiMeter3 toCentiMeter3() {
        return Volume.centimeter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 9))).getValue());
    }

    @Override
    public DeciMeter3 toDeciMeter3() {
        return Volume.decimeter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 6))).getValue());
    }

    @Override
    public Meter3 toMeter3() {
        return Volume.meter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 3))).getValue());
    }

    @Override
    public DecaMeter3 toDecaMeter3() {
        return Volume.decameter3(value);
    }

    @Override
    public HectoMeter3 toHectoMeter3() {
        return Volume.hectometer3(this.divide(BigDecimal.valueOf(Math.pow(10, 3))).getValue());
    }

    @Override
    public KiloMeter3 toKiloMeter3() {
        return Volume.kilometer3(this.divide(BigDecimal.valueOf(Math.pow(10, 6))).getValue());
    }

    @Override
    public Volume add(final Volume volume) {
        this.value = this.value.add(volume.toDecaMeter3().getValue());
        return this;
    }

    @Override
    public Volume subtract(final Volume volume) {
        this.value = this.value.subtract(volume.toDecaMeter3().getValue());
        return this;
    }

    @Override
    public Volume multiply(final BigDecimal multiplier) {
        this.value = this.value.multiply(multiplier);
        return this;
    }

    @Override
    public Volume divide(final BigDecimal divider) {
        this.value = this.value.divide(divider);
        return this;
    }
}
