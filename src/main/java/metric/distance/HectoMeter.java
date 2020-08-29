package metric.distance;

import java.math.BigDecimal;

public class HectoMeter implements Distance<HectoMeter> {
    private final BigDecimal value;

    protected HectoMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Hectometer", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.multiply(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(value);
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoMeter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toHectoMeter());
    }

    @Override
    public HectoMeter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toHectoMeter());
    }

    @Override
    public HectoMeter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toHectoMeter());
    }

    @Override
    public HectoMeter add(Meter meter) {
        return this.add(meter.toHectoMeter());
    }

    @Override
    public HectoMeter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toHectoMeter());
    }

    @Override
    public HectoMeter add(HectoMeter hectoMeter) {
        return Distance.hectometer(value.add(hectoMeter.getValue()));
    }

    @Override
    public HectoMeter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(MilliMeter milliMeter) {
        return this.subtract(milliMeter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(CentiMeter centiMeter) {
        return this.subtract(centiMeter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(DeciMeter deciMeter) {
        return this.subtract(deciMeter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(Meter meter) {
        return this.subtract(meter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(DecaMeter decaMeter) {
        return this.subtract(decaMeter.toHectoMeter());
    }

    @Override
    public HectoMeter subtract(HectoMeter hectoMeter) {
        return Distance.hectometer(value.subtract(hectoMeter.getValue()));
    }

    @Override
    public HectoMeter subtract(KiloMeter kiloMeter) {
        return this.subtract(kiloMeter.toHectoMeter());
    }

    @Override
    public HectoMeter multiply(BigDecimal multiplicand) {
        return Distance.hectometer(value.multiply(multiplicand));
    }

    @Override
    public HectoMeter divide(BigDecimal divisor) {
        return Distance.hectometer(value.divide(divisor));
    }
}
