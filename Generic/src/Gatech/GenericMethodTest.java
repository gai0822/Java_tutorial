package Gatech;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericMethodTest {

    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static < E > void printArrayList( ArrayList<E> inputArray ) {
        // Display array elements
        Iterator iter = inputArray.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

        ArrayList<Integer> IntArrayList = new ArrayList<Integer>();
        IntArrayList.add(1);
        IntArrayList.add(2);
        IntArrayList.add(3);
        IntArrayList.add(4);
        IntArrayList.add(5);

        System.out.println("\nIntArrayList contains:");
        printArrayList(IntArrayList);

    }
}
