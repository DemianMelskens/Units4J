package metric.weight;

import java.math.BigDecimal;

public class CentiGram implements Weight {

    private BigDecimal value;

    protected CentiGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Centigram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(value);
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public Weight add(final Weight weight) {
        this.value = this.value.add(weight.toCentiGram().getValue());
        return this;
    }

    @Override
    public Weight subtract(final Weight weight) {
        this.value = this.value.subtract(weight.toCentiGram().getValue());
        return this;
    }

    @Override
    public Weight multiply(final BigDecimal multiplier) {
        this.value = this.value.multiply(multiplier);
        return this;
    }

    @Override
    public Weight divide(final BigDecimal divider) {
        this.value = this.value.divide(divider);
        return this;
    }
}
