package metric.weight;

import java.math.BigDecimal;

public class DecaGram implements Weight<DecaGram> {

    private final BigDecimal value;

    protected DecaGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Decagram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(value);
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaGram add(final MilliGram milliGram) {
        return this.add(milliGram.toDecaGram());
    }

    @Override
    public DecaGram add(final CentiGram centiGram) {
        return this.add(centiGram.toDecaGram());
    }

    @Override
    public DecaGram add(final DeciGram deciGram) {
        return this.add(deciGram.toDecaGram());
    }

    @Override
    public DecaGram add(final Gram gram) {
        return this.add(gram.toDecaGram());
    }

    @Override
    public DecaGram add(final DecaGram decaGram) {
        return new DecaGram(this.value.add(decaGram.getValue()));
    }

    @Override
    public DecaGram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toDecaGram());
    }

    @Override
    public DecaGram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final Gram gram) {
        return this.subtract(gram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final DecaGram decaGram) {
        return Weight.decagram(value.subtract(decaGram.getValue()));
    }

    @Override
    public DecaGram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toDecaGram());
    }

    @Override
    public DecaGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toDecaGram());
    }

    @Override
    public DecaGram multiply(final BigDecimal multiplier) {
        return Weight.decagram(value.multiply(multiplier));
    }

    @Override
    public DecaGram divide(final BigDecimal divider) {
        return Weight.decagram(value.divide(divider));
    }
}
