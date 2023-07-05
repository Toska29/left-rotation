package main;

import java.util.Arrays;
import java.util.List;

public class LeftRotationOperation {
    public static List<Integer> rotLeft(List<Integer> listArray, int d){
        Integer[] arrayOfInteger = listArray.toArray(new Integer[0]);
        int sizeOfArray = listArray.size();
        Integer[] rotatedArray = new Integer[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            int newIndex = (i + sizeOfArray - d) % sizeOfArray;
            rotatedArray[newIndex] = arrayOfInteger[i];
        }

        return Arrays.asList(rotatedArray);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        int d = 2;
        List<Integer> rotatedArray = rotLeft(integerList, d);

        for (int number: rotatedArray) {
            System.out.print(number + " ");
        }

    }
    
}
