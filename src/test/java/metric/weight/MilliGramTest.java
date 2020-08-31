package metric.weight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

class MilliGramTest {

    MilliGram milliGram;

    @BeforeEach
    void setUp() {
        milliGram = Weight.milligram(1);
    }

    @Test
    void toMilliGram() {
        assertThat(milliGram.getValue(), is(equalTo(BigDecimal.valueOf(1))));
    }

    @Test
    void toCentiGram() {
        assertThat(milliGram.toCentiGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 1))))));
    }

    @Test
    void toDeciGram() {
        assertThat(milliGram.toDeciGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 2))))));
    }

    @Test
    void toGram() {
        assertThat(milliGram.toGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 3))))));
    }

    @Test
    void toDecaGram() {
        assertThat(milliGram.toDecaGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 4))))));
    }

    @Test
    void toHectoGram() {
        assertThat(milliGram.toHectoGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 5))))));
    }

    @Test
    void toKiloGram() {
        assertThat(milliGram.toKiloGram().getValue(), is(equalTo(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, 6))))));
    }

    public static Stream<Arguments> addParameters() {
        return Stream.of(
                Arguments.of(Weight.milligram(1), BigDecimal.valueOf(2)),
                Arguments.of(Weight.centigram(1), BigDecimal.valueOf(11)),
                Arguments.of(Weight.decigram(1), BigDecimal.valueOf(101)),
                Arguments.of(Weight.gram(1), BigDecimal.valueOf(1001)),
                Arguments.of(Weight.decagram(1), BigDecimal.valueOf(10001)),
                Arguments.of(Weight.hectogram(1), BigDecimal.valueOf(100001)),
                Arguments.of(Weight.kilogram(1), BigDecimal.valueOf(1000001))
        );
    }

    @ParameterizedTest
    @MethodSource("addParameters")
    void add(Weight augend, BigDecimal expected) {
        Weight result = milliGram.add(augend);
        assertThat(result.getValue(), is(equalTo(expected)));
    }

    public static Stream<Arguments> subtractParameters() {
        return Stream.of(
                Arguments.of(Weight.milligram(1), BigDecimal.valueOf(0)),
                Arguments.of(Weight.centigram(1), BigDecimal.valueOf(-9)),
                Arguments.of(Weight.decigram(1), BigDecimal.valueOf(-99)),
                Arguments.of(Weight.gram(1), BigDecimal.valueOf(-999)),
                Arguments.of(Weight.decagram(1), BigDecimal.valueOf(-9999)),
                Arguments.of(Weight.hectogram(1), BigDecimal.valueOf(-99999)),
                Arguments.of(Weight.kilogram(1), BigDecimal.valueOf(-999999))
        );
    }

    @ParameterizedTest
    @MethodSource("subtractParameters")
    void subtract(Weight subtrahend, BigDecimal expected) {
        Weight result = milliGram.subtract(subtrahend);
        assertThat(result.getValue(), is(equalTo(expected)));
    }

    @Test
    void multiply() {
        Weight result = milliGram.multiply(BigDecimal.valueOf(2));
        assertThat(result.getValue(), is(equalTo(BigDecimal.valueOf(2))));
    }

    @Test
    void divide() {
        Weight result = milliGram.divide(BigDecimal.valueOf(2));
        assertThat(result.getValue(), is(equalTo(BigDecimal.valueOf(0.5))));
    }
}
