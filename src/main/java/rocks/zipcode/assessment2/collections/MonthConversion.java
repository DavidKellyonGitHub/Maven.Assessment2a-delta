package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    LinkedHashMap<Integer, String> numMonth = new LinkedHashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        this.numMonth.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return this.numMonth.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        if (this.numMonth.containsValue(monthName)) {
            for (Map.Entry<Integer, String> entry : numMonth.entrySet()) {
                if (entry.getValue().contains(monthName)) {
                    return entry.getKey();
                }

            }
        } else if(!this.numMonth.containsValue(monthName)){
            this.returnNull();
        }
        return 0;
    }

    public String returnNull(){
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return this.numMonth.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return this.numMonth.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.numMonth.entrySet().size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.numMonth.replace(monthNumber,monthName);
    }
}
