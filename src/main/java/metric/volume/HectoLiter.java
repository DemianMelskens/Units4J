package metric.volume;

import java.math.BigDecimal;

public class HectoLiter implements Volume {
    private BigDecimal value;

    protected HectoLiter(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("%s Hectometer3", value);
    }

    @Override
    public Volume add(final Volume volume) {
        this.value = this.value.add(volume.toHectoMeter3().getValue());
        return this;
    }

    @Override
    public Volume subtract(final Volume volume) {
        this.value = this.value.subtract(volume.toHectoMeter3().getValue());
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
