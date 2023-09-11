package org.surojit.cses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingArrayTest {

    @Test
    void solverFor() {
        long result = IncreasingArray.solverFor(new long[]{3,2,5,1,7});
        assertEquals(result,5);
    }
}