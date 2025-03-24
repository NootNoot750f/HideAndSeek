package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FuzzyFinderTest {

    @Test
    void testLinearSearch() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int index1 = finder.linearSearch(sortedFuzzies);
        int index2 = finder.linearSearch(randomFuzzies);

        assertTrue(index1 >= 0, "Linear search should find the golden fuzzy in sorted list");
        assertTrue(index2 >= 0, "Linear search should find the golden fuzzy in random list");
    }

    @Test
    void testBinarySearch() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int index1 = finder.binarySearch(sortedFuzzies);
        int index2 = finder.binarySearch(randomFuzzies);

        assertTrue(index1 >= 0, "Binary search should find the golden fuzzy in sorted list");
        assertEquals(-1, index2, "Binary search should not work on a random list");
    }
}
