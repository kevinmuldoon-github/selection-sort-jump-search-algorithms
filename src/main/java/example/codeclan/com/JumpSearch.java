package example.codeclan.com;

import java.util.ArrayList;

public class JumpSearch {

    public boolean find(ArrayList<Integer> numbers, int searchNumber){

        boolean foundNumber = false; // initialise found status to false

        int arrayLength = numbers.size();
        int jumpSize = (int) Math.sqrt(arrayLength); // size of jump
        int jumpPosition = (int) Math.sqrt(arrayLength); // initialise jump position
        int lastStep = 0; // initialise last step

        // keep jumping until you're close to the search number
        while (numbers.get(Math.min(jumpPosition, arrayLength)-1) < searchNumber) {
            lastStep = jumpPosition;
            jumpPosition += jumpSize;
        } // end while

        // perform linear search from jump position
        while (numbers.get(lastStep) < searchNumber){
            lastStep++;
        } // end while

        //
        if (numbers.get(lastStep) == searchNumber) {
            foundNumber = true;
        } // end if

    return foundNumber;

    }

}
