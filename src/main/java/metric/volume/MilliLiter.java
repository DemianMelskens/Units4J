package metric.volume;

import java.math.BigDecimal;

public class MilliLiter implements Volume {
    private BigDecimal value;

    protected MilliLiter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Millimeter3", value);
    }

    @Override
    public Volume add(final Volume volume) {
        this.value = this.value.add(volume.toMilliMeter3().getValue());
        return this;
    }

    @Override
    public Volume subtract(final Volume volume) {
        this.value = this.value.subtract(volume.toMilliMeter3().getValue());
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
