package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class MaxTest {

    @Test
    public void when3and14Then14() {
        Max testMax = new Max();
        int result = testMax.max(3, 14);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when3and14and154Then154() {
        Max testMax = new Max();
        int result = testMax.max(3, 14, 154);
        int expected = 154;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when3and14and154and2344Then2344() {
        Max testMax = new Max();
        int result = testMax.max(3, 14, 154, 2344);
        int expected = 2344;
        assertThat(result).isEqualTo(expected);
    }
}