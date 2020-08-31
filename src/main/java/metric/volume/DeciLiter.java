package metric.volume;

import java.math.BigDecimal;

public class DeciLiter implements Volume {
    private BigDecimal value;

    protected DeciLiter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Deciliter", value);
    }

    @Override
    public MilliMeter3 toMilliMeter3() {
        return Volume.millimeter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 5))).getValue());
    }

    @Override
    public CentiMeter3 toCentiMeter3() {
        return Volume.centimeter3(this.multiply(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public DeciMeter3 toDeciMeter3() {
        return Volume.decimeter3(this.divide(BigDecimal.valueOf(Math.pow(10, 1))).getValue());
    }

    @Override
    public Meter3 toMeter3() {
        return Volume.meter3(this.divide(BigDecimal.valueOf(Math.pow(10, 4))).getValue());
    }

    @Override
    public DecaMeter3 toDecaMeter3() {
        return Volume.decameter3(this.divide(BigDecimal.valueOf(Math.pow(10, 7))).getValue());
    }

    @Override
    public HectoMeter3 toHectoMeter3() {
        return Volume.hectometer3(this.divide(BigDecimal.valueOf(Math.pow(10, 10))).getValue());
    }

    @Override
    public KiloMeter3 toKiloMeter3() {
        return Volume.kilometer3(this.divide(BigDecimal.valueOf(Math.pow(10, 13))).getValue());
    }

    @Override
    public MilliLiter toMilliLiter() {
        return Volume.milliliter(this.multiply(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public CentiLiter toCentiLiter() {
        return Volume.centiliter(this.multiply(BigDecimal.valueOf(Math.pow(10, 1))).getValue());
    }

    @Override
    public DeciLiter toDeciLiter() {
        return Volume.deciliter(this.value);
    }

    @Override
    public Liter toLiter() {
        return Volume.liter(this.divide(BigDecimal.valueOf(Math.pow(10, 1))).getValue());
    }

    @Override
    public DecaLiter toDecaLiter() {
        return Volume.decaliter(this.divide(BigDecimal.valueOf(Math.pow(10, 2))).getValue());
    }

    @Override
    public HectoLiter toHectoLiter() {
        return Volume.hectoliter(this.divide(BigDecimal.valueOf(Math.pow(10, 3))).getValue());
    }

    @Override
    public KiloLiter toKiloLiter() {
        return Volume.kiloliter(this.divide(BigDecimal.valueOf(Math.pow(10, 4))).getValue());
    }

    @Override
    public Volume add(final Volume volume) {
        this.value = this.value.add(volume.toDeciLiter().getValue());
        return this;
    }

    @Override
    public Volume subtract(final Volume volume) {
        this.value = this.value.subtract(volume.toDeciLiter().getValue());
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
