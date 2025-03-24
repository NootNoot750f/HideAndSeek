package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int linearSortedIndex = finder.linearSearch(sortedFuzzies);
        int binarySortedIndex = finder.binarySearch(sortedFuzzies);
        int linearRandomIndex = finder.linearSearch(randomFuzzies);
        int binaryRandomIndex = finder.binarySearch(randomFuzzies);
        
        System.out.println("Results of Searching for the Golden Fuzzy:");
        System.out.println("Linear Search (Sorted List): Index " + linearSortedIndex);
        System.out.println("Binary Search (Sorted List): Index " + binarySortedIndex);
        System.out.println("Linear Search (Random List): Index " + linearRandomIndex);
        System.out.println("Binary Search (Random List): Index " + binaryRandomIndex);
    }
}
