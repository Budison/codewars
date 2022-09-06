package com.github.budison.codewars;

import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ListFilteringTest {

    @Test
    public void testListFiltering() {
        assertEquals(List.of(1,2), ListFiltering.filterList(List.of(1,2,"a","b")), formatInput(List.of(1,2,"a","b")));
        assertEquals(List.of(1,0,15), ListFiltering.filterList(List.of(1,"a","b",0,15)), formatInput(List.of(1,"a","b",0,15)));
        assertEquals(List.of(1,2,123), ListFiltering.filterList(List.of(1,2,"aasf","1","123",123)), formatInput(List.of(1,2,"aasf","1","123",123)));
    }

    private String formatInput(List<Object> input) {
        String partialInput = input.stream()
                .map(x -> x instanceof String ? "\"" + x + "\"" : x.toString())
                .collect(Collectors.joining(", "));
        return String.format("For input: [%s]", partialInput);
    }
}
