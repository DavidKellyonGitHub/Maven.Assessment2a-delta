package rocks.zipcode.assessment2.arrays;

import java.awt.event.WindowFocusListener;
import java.util.*;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] resultArray = new Integer[integerArray.length+1];
        int i = 0;
        for (Integer orig : integerArray) {
            resultArray[i] = orig;
            i++;
        }
        resultArray[resultArray.length-1] = valueToBeAdded;
        return resultArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        int i = 0;
        for (Integer orig : integerArray){

            if (orig%2 == 0){
                integerArray[i]++;
            } else if (orig%2 !=0){
                integerArray[i]--;
            }
            i++;
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        int i = 0;
        for (Integer even : integerArray){
            if (even%2 == 0){
                integerArray[i]++;
            }
            i++;
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        int i = 0;
        for (Integer odd : input){
            if (odd%2 != 0){
                input[i]--;
            }
            i++;
        }
        return input;

    }
}
