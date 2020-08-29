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
        return Distance.millimeter(this.divide(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(value);
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.multiply(BigDecimal.valueOf(10)).getValue());
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
        return null;
    }

    @Override
    public HectoMeter subtract(CentiMeter centiMeter) {
        return null;
    }

    @Override
    public HectoMeter subtract(DeciMeter deciMeter) {
        return null;
    }

    @Override
    public HectoMeter subtract(Meter gram) {
        return null;
    }

    @Override
    public HectoMeter subtract(DecaMeter decaMeter) {
        return null;
    }

    @Override
    public HectoMeter subtract(HectoMeter hectoMeter) {
        return null;
    }

    @Override
    public HectoMeter subtract(KiloMeter kiloMeter) {
        return null;
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
