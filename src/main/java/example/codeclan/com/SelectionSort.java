package example.codeclan.com;

import java.util.ArrayList;

public class SelectionSort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> numbers){

        for (int i=0; i < numbers.size(); i++) {
            int minIndex = i; // define a minimum index that changes with each loop

            // Loop round remaining numbers to find lowest number
            for (int nextNumber = i + 1; nextNumber < numbers.size(); nextNumber++){
                // NextNumber becomes new minIndex if it is the lowest number
                if (numbers.get(minIndex) > numbers.get(nextNumber)) {
                    minIndex = nextNumber;
                } // end if
            }// end second for loop

            // if loop to swap current number with lowest number
            if (minIndex != i){
                int tempNumber = numbers.get(i); // set temp number to current number value
                numbers.set(i, numbers.get(minIndex)); // set current number to number at minIndex
                numbers.set(minIndex, tempNumber); // set number at minIndex to temp number

            } // end if

        } // end first for loop

        return numbers;

    }

}
