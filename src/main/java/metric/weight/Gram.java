package metric.weight;

import java.math.BigDecimal;

public class Gram implements Weight<Gram> {

    private final BigDecimal value;

    protected Gram(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s Gram", value);
    }

    @Override
    public MilliGram toMilliGram() {
        return Weight.milligram(this.multiply(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public CentiGram toCentiGram() {
        return Weight.centigram(this.multiply(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public DeciGram toDeciGram() {
        return Weight.decigram(this.multiply(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public Gram toGram() {
        return Weight.gram(value);
    }

    @Override
    public DecaGram toDecaGram() {
        return Weight.decagram(this.divide(BigDecimal.valueOf(10)).getValue());
    }

    @Override
    public HectoGram toHectoGram() {
        return Weight.hectogram(this.divide(BigDecimal.valueOf(100)).getValue());
    }

    @Override
    public KiloGram toKiloGram() {
        return Weight.kilogram(this.divide(BigDecimal.valueOf(1000)).getValue());
    }

    @Override
    public Gram add(final MilliGram milliGram) {
        return this.add(milliGram.toGram());
    }

    @Override
    public Gram add(final CentiGram centiGram) {
        return this.add(centiGram.toGram());
    }

    @Override
    public Gram add(final DeciGram deciGram) {
        return this.add(deciGram.toGram());
    }

    @Override
    public Gram add(final Gram gram) {
        return new Gram(this.value.add(gram.getValue()));
    }

    @Override
    public Gram add(final DecaGram decaGram) {
        return this.add(decaGram.toGram());
    }

    @Override
    public Gram add(final HectoGram hectoGram) {
        return this.add(hectoGram.toGram());
    }

    @Override
    public Gram add(final KiloGram kiloGram) {
        return this.add(kiloGram.toGram());
    }

    @Override
    public Gram subtract(final MilliGram milliGram) {
        return this.subtract(milliGram.toGram());
    }

    @Override
    public Gram subtract(final CentiGram centiGram) {
        return this.subtract(centiGram.toGram());
    }

    @Override
    public Gram subtract(final DeciGram deciGram) {
        return this.subtract(deciGram.toGram());
    }

    @Override
    public Gram subtract(final Gram gram) {
        return Weight.gram(value.subtract(gram.getValue()));
    }

    @Override
    public Gram subtract(final DecaGram decaGram) {
        return this.subtract(decaGram.toGram());
    }

    @Override
    public Gram subtract(final HectoGram hectoGram) {
        return this.subtract(hectoGram.toGram());
    }

    @Override
    public Gram subtract(final KiloGram kiloGram) {
        return this.subtract(kiloGram.toGram());
    }

    @Override
    public Gram multiply(final BigDecimal multiplier) {
        return Weight.gram(value.multiply(multiplier));
    }

    @Override
    public Gram divide(final BigDecimal divider) {
        return Weight.gram(value.divide(divider));
    }
}
