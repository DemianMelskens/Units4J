package metric.distance;

import java.math.BigDecimal;

public class Meter implements Distance<Meter> {
    private final BigDecimal value;

    protected Meter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Meter", value);
    }

    @Override
    public MilliMeter toMilliMeter() {
        return Distance.millimeter(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public CentiMeter toCentiMeter() {
        return Distance.centimeter(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DeciMeter toDeciMeter() {
        return Distance.decimeter(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public Meter toMeter() {
        return Distance.meter(value);
    }

    @Override
    public DecaMeter toDecaMeter() {
        return Distance.decameter(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoMeter toHectoMeter() {
        return Distance.hectometer(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public KiloMeter toKiloMeter() {
        return Distance.kilometer(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public Meter add(MilliMeter milliMeter) {
        return this.add(milliMeter.toMeter());
    }

    @Override
    public Meter add(CentiMeter centiMeter) {
        return this.add(centiMeter.toMeter());
    }

    @Override
    public Meter add(DeciMeter deciMeter) {
        return this.add(deciMeter.toMeter());
    }

    @Override
    public Meter add(Meter meter) {
        return Distance.meter(value.add(meter.getValue()));
    }

    @Override
    public Meter add(DecaMeter decaMeter) {
        return this.add(decaMeter.toMeter());
    }

    @Override
    public Meter add(HectoMeter hectoMeter) {
        return this.add(hectoMeter.toMeter());
    }

    @Override
    public Meter add(KiloMeter kiloMeter) {
        return this.add(kiloMeter.toMeter());
    }

    @Override
    public Meter subtract(MilliMeter milliMeter) {
        return null;
    }

    @Override
    public Meter subtract(CentiMeter centiMeter) {
        return null;
    }

    @Override
    public Meter subtract(DeciMeter deciMeter) {
        return null;
    }

    @Override
    public Meter subtract(Meter gram) {
        return null;
    }

    @Override
    public Meter subtract(DecaMeter decaMeter) {
        return null;
    }

    @Override
    public Meter subtract(HectoMeter hectoMeter) {
        return null;
    }

    @Override
    public Meter subtract(KiloMeter kiloMeter) {
        return null;
    }

    @Override
    public Meter multiply(BigDecimal multiplicand) {
        return Distance.meter(value.multiply(multiplicand));
    }

    @Override
    public Meter divide(BigDecimal divisor) {
        return Distance.meter(value.divide(divisor));
    }
}
