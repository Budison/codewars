package com.github.budison.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TrollTest {

    @Test
    public void testDisemvowelWithExamples() {
        // Given
        String input1 = "This website is for losers LOL!";
        String input2 = "No offense but,\nYour writing is among the worst I've ever read";
        String input3 = "What are you, a communist?";

        // When
        String result1 = Troll.disemvowel(input1);
        String result2 = Troll.disemvowel(input2);
        String result3 = Troll.disemvowel(input3);

        // Then
        assertEquals("Ths wbst s fr lsrs LL!", result1);
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", result2);
        assertEquals("Wht r y,  cmmnst?", result3);
    }
}
