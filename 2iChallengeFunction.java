public int lookForPairsOfNumbersThatEqualX(int x, int[] arrayOfNumbers) {

    int totalNumOfPairsThatEqualX = 0;

    // Loop through each element in the array
    for(int i=0; i < arrayOfNumbers.length; i++) {

        int firstIntegerToSum = arrayOfNumbers[i];

        // loop through each of the remaining numbers in the array, adding the 'firstIntegerToSum' integer to each number after and checking whether the sum is equal to 'x'  
        for(int j=i+1;  arrayOfNumbers.length; j++) {
            int secondIntegerToSum = arrayOfNumbers[j];
        
            // Check that the end of the array has not been exceeded i.e. ensure that array element exists/is valid. 
            if ((j + 1) !> arrayOfNumbers.length) {

                // If the sum of the 'firstIntegerToSum' and 'secondIntegerToSum' number is equal to 'x' then increment 'totalNumOfPairsThatEqualX' total
                if ( (firstIntegerToSum + secondIntegerToSum).equals(x) ) {
                    totalNumOfPairsThatEqualX = totalNumOfPairsThatEqualX + 1;
                }
            }
        }
    }

    return totalNumOfPairsThatEqualX;

}