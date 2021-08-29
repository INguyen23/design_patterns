package strategy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Uses the binary search algorithm to search through a list of data to see if an element exist within the list
 * @author Ivon Nguyen
 * Reference https://www.geeksforgeeks.org/binary-search-a-string/
 */
public class BinarySearch implements SearchBehavior {
    
    /** 
     * Checks over the list of data using the Binary Sort algorithm to check for an item in the list
     */
    public boolean contains(ArrayList<String> data, String item) { 
        Collections.sort(data);

        int first = 0;
        int last = data.size() - 1;

        while(first <= last) { 
            int mid = first + (last - first) / 2;
            
            int res = item.compareTo(data.get(mid));

            if(res == 0) { 
                return true;
            }
            if(res > 0) { 
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }

            return false;
        }
        return false;
    }
}
