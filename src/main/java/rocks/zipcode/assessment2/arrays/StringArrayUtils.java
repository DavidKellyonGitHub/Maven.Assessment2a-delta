package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if (startingIndex < 0 ) {
            return new String[]{};
        }

        if (startingIndex >= 0) {
            String[] resultArray = new String[endingIndex - startingIndex];
            int j = 0;
            for (int i = startingIndex; i < endingIndex; i++) {
                resultArray[j] = arrayToBeSpliced[i];
                j++;
            }
                return resultArray;
            }
        return new String[]{};
        }



    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int begin = 0;
        if (startingIndex < 0) {
            return new String[]{};
        }
        if (startingIndex >= 0 && startingIndex <= arrayToBeSpliced.length - 1) {
            begin = startingIndex;
            String[] resultArray = new String[arrayToBeSpliced.length - begin];
            int j = 0;
            for (int i = begin; i < arrayToBeSpliced.length; i++) {
                resultArray[j] = arrayToBeSpliced[i];
                j++;
            }
            return resultArray;
        }
        return new String[]{};
    }}





