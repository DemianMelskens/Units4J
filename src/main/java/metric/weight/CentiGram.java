package metric.weight;

import java.math.BigDecimal;

public class CentiGram implements Weight<BigDecimal, CentiGram> {

    private final BigDecimal value;

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
        return Weight.milligram(this.multiply(10).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(value);
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.divide(10).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(this.divide(100).getValue());
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.divide(1000).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(10000).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(100000).getValue());
    }

    @Override
    public CentiGram add(final MilliGram milliGram) {
        return this.add(milliGram.toCentiGram());
    }

    @Override
    public CentiGram add(final CentiGram centiGram) {
        return new CentiGram(this.value.add(centiGram.getValue()));
    }

    @Override
    public CentiGram add(final DeciGram deciGram) {
        return this.add(deciGram.toCentiGram());
    }

    @Override
    public CentiGram add(final Gram gram) {
        return this.add(gram.toCentiGram());
    }

    @Override
    public CentiGram add(final DecaGram decaGram) {
        return this.add(decaGram.toCentiGram());
    }

    @Override
    public CentiGram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toCentiGram());
    }

    @Override
    public CentiGram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final CentiGram centiGram) {
        return Weight.centigram(value.subtract(centiGram.getValue()));
    }

    @Override
    public CentiGram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final Gram gram) {
        return this.subtract(gram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toCentiGram());
    }

    @Override
    public CentiGram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toCentiGram());
    }

    @Override
    public CentiGram multiply(final Integer multiplier) {
        return Weight.centigram(value.multiply(BigDecimal.valueOf(multiplier)));
    }

    @Override
    public CentiGram divide(final Integer divider) {
        return Weight.centigram(value.divide(BigDecimal.valueOf(divider)));
    }
}
