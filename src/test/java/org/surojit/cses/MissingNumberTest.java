package org.surojit.cses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void solverFor() {
        var k = new long[]{2, 3, 5, 1};
        assertEquals(MissingNumber.solverFor(k),4);

    }
}