package metric.weight;

import java.math.BigDecimal;

public class KiloGram implements Weight<BigDecimal, KiloGram> {

    private final BigDecimal value;

    protected KiloGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Kilogram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(value.multiply(BigDecimal.valueOf(1000000)));
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(value * 100000);
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(value * 10000);
    }

    @Override
    public Gram toGram() {
        return Weight.gram(value * 1000);
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(value * 100);
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(value * 10);
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(value);
    }

    @Override
    public KiloGram add(final MilliGram milliGram) {
        return this.add(milliGram.toKiloGram());
    }

    @Override
    public KiloGram add(final CentiGram centiGram) {
        return this.add(centiGram.toKiloGram());
    }

    @Override
    public KiloGram add(final DeciGram deciGram) {
        return this.add(deciGram.toKiloGram());
    }

    @Override
    public KiloGram add(final Gram gram) {
        return this.add(gram.toKiloGram());
    }

    @Override
    public KiloGram add(final DecaGram decaGram) {
        return this.add(decaGram.toKiloGram());
    }

    @Override
    public KiloGram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toKiloGram());
    }

    @Override
    public KiloGram add(final KiloGram kiloGram) {
        return Weight.kilogram(value + kiloGram.getValue());
    }

    @Override
    public KiloGram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final Gram gram) {
        return this.subtract(gram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toKiloGram());
    }

    @Override
    public KiloGram subtract(final KiloGram kiloGram) {
        return Weight.kilogram(value - kiloGram.getValue());
    }

    @Override
    public KiloGram multiply(final Integer multiplier) {
        return Weight.kilogram(value * multiplier);
    }

    @Override
    public KiloGram divide(final Integer divider) {
        return Weight.kilogram(value * divider);
    }
}
