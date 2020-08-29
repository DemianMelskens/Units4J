package metric.distance;

import java.math.BigDecimal;

public class MilliMeter implements Distance<MilliMeter> {
    private final BigDecimal value;

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
        return Distance.centimeter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.divide(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.divide(BigDecimal.valueOf(1000000)).getValue());
    }

    @Override
    public MilliMeter add(MilliMeter milliMeter) {
        return Distance.millimeter(value.add(milliMeter.getValue()));
    }

    @Override
    public MilliMeter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toMilliMeter());
    }

    @Override
    public MilliMeter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toMilliMeter());
    }

    @Override
    public MilliMeter add(Meter meter) {
        return this.add(meter.toMilliMeter());
    }

    @Override
    public MilliMeter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toMilliMeter());
    }

    @Override
    public MilliMeter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toMilliMeter());
    }

    @Override
    public MilliMeter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(MilliMeter milliMeter) {
        return Distance.millimeter(value.subtract(milliMeter.getValue()));
    }

    @Override
    public MilliMeter subtract(CentiMeter centiMeter) {
        return this.subtract(centiMeter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(DeciMeter deciMeter) {
        return this.subtract(deciMeter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(Meter meter) {
        return this.subtract(meter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(DecaMeter decaMeter) {
        return this.subtract(decaMeter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(HectoMeter hectoMeter) {
        return this.subtract(hectoMeter.toMilliMeter());
    }

    @Override
    public MilliMeter subtract(KiloMeter kiloMeter) {
        return this.subtract(kiloMeter.toMilliMeter());
    }

    @Override
    public MilliMeter multiply(BigDecimal multiplicand) {
        return Distance.millimeter(value.multiply(multiplicand));
    }

    @Override
    public MilliMeter divide(BigDecimal divisor) {
        return Distance.millimeter(value.divide(divisor));
    }
}
