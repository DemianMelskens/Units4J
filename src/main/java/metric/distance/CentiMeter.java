package metric.distance;

import java.math.BigDecimal;

public class CentiMeter implements Distance<CentiMeter>{
    private final BigDecimal value;

    protected CentiMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Centimeter", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(value);
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.multiply(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public CentiMeter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toCentiMeter());
    }

    @Override
    public CentiMeter add(CentiMeter centiMeter) {
        return Distance.centimeter(value.add(centiMeter.getValue()));
    }

    @Override
    public CentiMeter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toCentiMeter());
    }

    @Override
    public CentiMeter add(Meter meter) {
        return this.add(meter.toCentiMeter());
    }

    @Override
    public CentiMeter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toCentiMeter());
    }

    @Override
    public CentiMeter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toCentiMeter());
    }

    @Override
    public CentiMeter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(MilliMeter milliMeter) {
        return this.subtract(milliMeter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(CentiMeter centiMeter) {
        return Distance.centimeter(value.subtract(centiMeter.getValue()));
    }

    @Override
    public CentiMeter subtract(DeciMeter deciMeter) {
        return this.subtract(deciMeter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(Meter meter) {
        return this.subtract(meter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(DecaMeter decaMeter) {
        return this.subtract(decaMeter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(HectoMeter hectoMeter) {
        return this.subtract(hectoMeter.toCentiMeter());
    }

    @Override
    public CentiMeter subtract(KiloMeter kiloMeter) {
        return this.subtract(kiloMeter.toCentiMeter());
    }

    @Override
    public CentiMeter multiply(BigDecimal multiplicand) {
        return Distance.centimeter(value.multiply(multiplicand));
    }

    @Override
    public CentiMeter divide(BigDecimal divisor) {
        return Distance.centimeter(value.divide(divisor));
    }
}
