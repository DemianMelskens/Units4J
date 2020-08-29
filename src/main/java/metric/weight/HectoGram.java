package metric.weight;

import java.math.BigDecimal;

public class HectoGram implements Weight<BigDecimal, HectoGram> {

    private final BigDecimal value;

    protected HectoGram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Hectogram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(value * 100000);
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(value * 10000);
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(value * 1000);
    }

    @Override
    public Gram toGram() {
        return Weight.gram(value * 100);
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(value * 10);
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(value);
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(value / 10);
    }

    @Override
    public HectoGram add(final MilliGram milliGram) {
        return this.add(milliGram.toHectoGram());
    }

    @Override
    public HectoGram add(final CentiGram centiGram) {
        return this.add(centiGram.toHectoGram());
    }

    @Override
    public HectoGram add(final DeciGram deciGram) {
        return this.add(deciGram.toHectoGram());
    }

    @Override
    public HectoGram add(final Gram gram) {
        return this.add(gram.toHectoGram());
    }

    @Override
    public HectoGram add(final DecaGram decaGram) {
        return this.add(decaGram.toHectoGram());
    }

    @Override
    public HectoGram add(final HectoGram hectoGram) {
        return Weight.hectogram(value + hectoGram.getValue());
    }

    @Override
    public HectoGram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final Gram gram) {
        return this.subtract(gram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toHectoGram());
    }

    @Override
    public HectoGram subtract(final HectoGram hectoGram) {
        return Weight.hectogram(value - hectoGram.getValue());
    }

    @Override
    public HectoGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toHectoGram());
    }

    @Override
    public HectoGram multiply(final Integer multiplier) {
        return Weight.hectogram(value * multiplier);
    }

    @Override
    public HectoGram divide(final Integer divider) {
        return Weight.hectogram(value * divider);
    }
}
