package metric.distance;

import java.math.BigDecimal;

public class DecaMeter implements Distance<DecaMeter> {
    private final BigDecimal value;

    protected DecaMeter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Decameter", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(value);
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaMeter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toDecaMeter());
    }

    @Override
    public DecaMeter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toDecaMeter());
    }

    @Override
    public DecaMeter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toDecaMeter());
    }

    @Override
    public DecaMeter add(Meter meter) {
        return this.add(meter.toDecaMeter());
    }

    @Override
    public DecaMeter add(DecaMeter decaMeter) {
        return Distance.decameter(value.add(decaMeter.getValue()));
    }

    @Override
    public DecaMeter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toDecaMeter());
    }

    @Override
    public DecaMeter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toDecaMeter());
    }

    @Override
    public DecaMeter subtract(MilliMeter milliMeter) {
        return null;
    }

    @Override
    public DecaMeter subtract(CentiMeter centiMeter) {
        return null;
    }

    @Override
    public DecaMeter subtract(DeciMeter deciMeter) {
        return null;
    }

    @Override
    public DecaMeter subtract(Meter gram) {
        return null;
    }

    @Override
    public DecaMeter subtract(DecaMeter decaMeter) {
        return null;
    }

    @Override
    public DecaMeter subtract(HectoMeter hectoMeter) {
        return null;
    }

    @Override
    public DecaMeter subtract(KiloMeter kiloMeter) {
        return null;
    }

    @Override
    public DecaMeter multiply(BigDecimal multiplicand) {
        return Distance.decameter(value.multiply(multiplicand));
    }

    @Override
    public DecaMeter divide(BigDecimal divisor) {
        return Distance.decameter(value.divide(divisor));
    }
}
