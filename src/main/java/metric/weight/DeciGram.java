package metric.weight;

import java.math.BigDecimal;

public class DeciGram implements Weight<DeciGram> {

    private final BigDecimal value;

    protected DeciGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Decigram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(value);
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public DeciGram add(final MilliGram milliGram) {
        return this.add(milliGram.toDeciGram());
    }

    @Override
    public DeciGram add(final CentiGram centiGram) {
        return this.add(centiGram.toDeciGram());
    }

    @Override
    public DeciGram add(final DeciGram deciGram) {
        return Weight.decigram(value.add(deciGram.getValue()));
    }

    @Override
    public DeciGram add(final Gram gram) {
        return this.add(gram.toDeciGram());
    }

    @Override
    public DeciGram add(final DecaGram decaGram) {
        return this.add(decaGram.toDeciGram());
    }

    @Override
    public DeciGram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toDeciGram());
    }

    @Override
    public DeciGram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final DeciGram deciGram) {
        return Weight.decigram(value.subtract(deciGram.getValue()));
    }

    @Override
    public DeciGram subtract(final Gram gram) {
        return this.subtract(gram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toDeciGram());
    }

    @Override
    public DeciGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toDeciGram());
    }

    @Override
    public DeciGram multiply(final BigDecimal multiplier) {
        return Weight.decigram(value.multiply(multiplier));
    }

    @Override
    public DeciGram divide(final BigDecimal divider) {
        return Weight.decigram(value.divide(divider));
    }
}
