package com.github.budison.codewars;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ListFilteringTest {

    @Test
    public void testListFilteringWithExamples() {
        // Given
        List<Object> input1 = List.of(1,2,"a", "b");
        List<Object> input2 = List.of(1,"a","b",0,15);
        List<Object> input3 = List.of(1,2,"aasf","1","123",123);

        // Then
        List<Object> result1 = ListFiltering.filterList(input1);
        List<Object> result2 = ListFiltering.filterList(input2);
        List<Object> result3 = ListFiltering.filterList(input3);

        // Then
        assertEquals(List.of(1,2), result1, formatInput(input1));
        assertEquals(List.of(1,0,15), result2, formatInput(input2));
        assertEquals(List.of(1,2,123), result3, formatInput(input3));
    }

    @Test void testListFilteringWithBorderCases() {
        // Given
        List<Object> borderCase1 = List.of("a", "b", "1");
        List<Object> borderCase2 = List.of();

        // When
        List<Object> result1 = ListFiltering.filterList(borderCase1);
        List<Object> result2 = ListFiltering.filterList(borderCase2);

        // Then
        assertEquals(List.of(), result1, formatInput(List.of("a","b","1")));
        assertEquals(List.of(), result2, formatInput(List.of()));
    }

    @Test void testListFilteringWithRandomInput() {
        // Given
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for(int i = 0; i < 20; i++) {
            int size = rand.nextInt(20);
            List<Object> randomInput = new ArrayList<>();
            List<Integer> expected = new ArrayList<>();
            for(int j = 0; j < size; ++j) {
                if(rand.nextBoolean()) {
                    int n = rand.nextInt(0, 1000);
                    randomInput.add(n);
                    expected.add(n);
                } else {
                    if(rand.nextBoolean())
                        randomInput.add(rand.ints(rand.nextInt(6), 48, 123)
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                .toString());
                    else randomInput.add(Integer.toString(rand.nextInt(1000)));
                }
            }

            // When
            List<Object> result = ListFiltering.filterList(List.copyOf(randomInput));

            // Then
            assertEquals(expected, result, formatInput(randomInput));
        }
    }

    private String formatInput(List<Object> input) {
        String partialInput = input.stream()
                .map(x -> x instanceof String ? "\"" + x + "\"" : x.toString())
                .collect(Collectors.joining(", "));
        return String.format("For input: [%s]", partialInput);
    }
}
