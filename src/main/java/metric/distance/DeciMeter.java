package metric.distance;

import java.math.BigDecimal;

public class DeciMeter implements Distance<DeciMeter> {
    private final BigDecimal value;

    protected DeciMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Decimeter", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(value);
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public DeciMeter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toDeciMeter());
    }

    @Override
    public DeciMeter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toDeciMeter());
    }

    @Override
    public DeciMeter add(DeciMeter deciMeter) {
        return Distance.decimeter(value.add(deciMeter.getValue()));
    }

    @Override
    public DeciMeter add(Meter meter) {
        return this.add(meter.toDeciMeter());
    }

    @Override
    public DeciMeter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toDeciMeter());
    }

    @Override
    public DeciMeter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toDeciMeter());
    }

    @Override
    public DeciMeter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(MilliMeter milliMeter) {
        return this.subtract(milliMeter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(CentiMeter centiMeter) {
        return this.subtract(centiMeter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(DeciMeter deciMeter) {
        return Distance.decimeter(value.subtract(deciMeter.getValue()));
    }

    @Override
    public DeciMeter subtract(Meter meter) {
        return this.subtract(meter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(DecaMeter decaMeter) {
        return this.subtract(decaMeter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(HectoMeter hectoMeter) {
        return this.subtract(hectoMeter.toDeciMeter());
    }

    @Override
    public DeciMeter subtract(KiloMeter kiloMeter) {
        return this.subtract(kiloMeter.toDeciMeter());
    }

    @Override
    public DeciMeter multiply(BigDecimal multiplicand) {
        return Distance.decimeter(value.multiply(multiplicand));
    }

    @Override
    public DeciMeter divide(BigDecimal divisor) {
        return Distance.decimeter(value.divide(divisor));
    }
}
