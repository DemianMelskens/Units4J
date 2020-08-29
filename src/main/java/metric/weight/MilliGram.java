package metric.weight;

import java.math.BigDecimal;

public class MilliGram implements Weight<MilliGram> {

    private final BigDecimal value;

    protected MilliGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Milligram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(value);
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.divide(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(1000000)).getValue());
    }

    @Override
    public MilliGram add(final MilliGram milliGram) {
        return new MilliGram(this.value.add(milliGram.getValue()));
    }

    @Override
    public MilliGram add(final CentiGram centiGram) {
        return this.add(centiGram.toMilliGram());
    }

    @Override
    public MilliGram add(final DeciGram deciGram) {
        return this.add(deciGram.toMilliGram());
    }

    @Override
    public MilliGram add(final Gram gram) {
        return this.add(gram.toMilliGram());
    }

    @Override
    public MilliGram add(final DecaGram decaGram) {
        return this.add(decaGram.toMilliGram());
    }

    @Override
    public MilliGram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toMilliGram());
    }

    @Override
    public MilliGram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final MilliGram milliGram) {
        return Weight.milligram(value.subtract(milliGram.getValue()));
    }

    @Override
    public MilliGram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final Gram gram) {
        return this.subtract(gram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toMilliGram());
    }

    @Override
    public MilliGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toMilliGram());
    }

    @Override
    public MilliGram multiply(final BigDecimal multiplier) {
        return Weight.milligram(value.multiply(multiplier));
    }

    @Override
    public MilliGram divide(final BigDecimal divider) {
        return Weight.milligram(value.divide(divider));
    }
}
