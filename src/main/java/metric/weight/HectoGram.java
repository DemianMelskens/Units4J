package metric.weight;

import java.math.BigDecimal;

public class HectoGram implements Weight<HectoGram> {

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
        return Weight.milligram(this.multiply(BigDecimal.valueOf(100000)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.multiply(BigDecimal.valueOf(10000)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(value);
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(10)).getValue());
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
        return Weight.hectogram(value.add( hectoGram.getValue()));
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
        return Weight.hectogram(value.subtract(hectoGram.getValue()));
    }

    @Override
    public HectoGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toHectoGram());
    }

    @Override
    public HectoGram multiply(final BigDecimal multiplier) {
        return Weight.hectogram(value.multiply(multiplier));
    }

    @Override
    public HectoGram divide(final BigDecimal divider) {
        return Weight.hectogram(value.divide(divider));
    }
}
