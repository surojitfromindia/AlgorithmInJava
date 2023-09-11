package org.surojit.cses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepetitionTest {

    @Test
    void solveFor() {
       var n = Repetition.solveFor("AAAA");
       assertEquals(n,4);
    }
}