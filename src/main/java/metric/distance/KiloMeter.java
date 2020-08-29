package metric.distance;

import java.math.BigDecimal;

public class KiloMeter implements Distance<KiloMeter> {

    private final BigDecimal value;

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
        return Distance.centimeter(this.divide(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(value);
    }

    @Override
    public KiloMeter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toKiloMeter());
    }

    @Override
    public KiloMeter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toKiloMeter());
    }

    @Override
    public KiloMeter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toKiloMeter());
    }

    @Override
    public KiloMeter add(Meter meter) {
        return this.add(meter.toKiloMeter());
    }

    @Override
    public KiloMeter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toKiloMeter());
    }

    @Override
    public KiloMeter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toKiloMeter());
    }

    @Override
    public KiloMeter add(KiloMeter kiloMeter) {
        return Distance.kilometer(value.add(kiloMeter.getValue()));
    }

    @Override
    public KiloMeter subtract(MilliMeter milliMeter) {
        return null;
    }

    @Override
    public KiloMeter subtract(CentiMeter centiMeter) {
        return null;
    }

    @Override
    public KiloMeter subtract(DeciMeter deciMeter) {
        return null;
    }

    @Override
    public KiloMeter subtract(Meter gram) {
        return null;
    }

    @Override
    public KiloMeter subtract(DecaMeter decaMeter) {
        return null;
    }

    @Override
    public KiloMeter subtract(HectoMeter hectoMeter) {
        return null;
    }

    @Override
    public KiloMeter subtract(KiloMeter kiloMeter) {
        return null;
    }

    @Override
    public KiloMeter multiply(BigDecimal multiplicand) {
        return Distance.kilometer(value.multiply(multiplicand));
    }

    @Override
    public KiloMeter divide(BigDecimal divisor) {
        return Distance.kilometer(value.divide(divisor));
    }
}
