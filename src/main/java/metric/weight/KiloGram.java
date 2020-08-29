package metric.weight;

import java.math.BigDecimal;

public class KiloGram implements Weight<KiloGram> {

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
        return Weight.milligram(this.multiply(BigDecimal.valueOf(1000000)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.multiply(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.multiply(BigDecimal.valueOf(10)).getValue());
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
        return Weight.kilogram(value.add(kiloGram.getValue()));
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
        return Weight.kilogram(value.subtract(kiloGram.getValue()));
    }

    @Override
    public KiloGram multiply(final BigDecimal multiplier) {
        return Weight.kilogram(value.multiply(multiplier));
    }

    @Override
    public KiloGram divide(final BigDecimal divider) {
        return Weight.kilogram(value.divide(divider));
    }
}
