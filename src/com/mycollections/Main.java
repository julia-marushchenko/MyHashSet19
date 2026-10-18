/**
 *  Java program to create, read, update, and delete HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Long> mySet = new HashSet<>();

        // Add.
        mySet.add(2000000789L);
        mySet.add(3000000000987L);
        mySet.add(4000000567L);
        mySet.add(5000000345L);
        mySet.add(6000000952L);

        // Display.
        System.out.println(mySet); // Output: [2000000789, 6000000952, 4000000567, 5000000345, 3000000000987]

        // Remove.
        mySet.remove(5000000345L);

        // Display.
        System.out.println(mySet); // Output: [2000000789, 6000000952, 4000000567, 3000000000987]

        // Clear.
        mySet.clear();

    }
}