package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MinNumberArrayTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = MinNumberArray.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = MinNumberArray.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = MinNumberArray.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}