package strategy;

import java.util.ArrayList;

/**
 * Uses the linear search algorithm to see if the list contains an element
 * @author Ivon Nguyen
 * Reference https://www.geeksforgeeks.org/java-program-to-search-arraylist-element-using-binary-search/
 */
public class LinearSearch implements SearchBehavior {
    
    public boolean contains(ArrayList<String> data, String item) { 
        /*
        for(String item : items) { 
            
        }
        */
        int n = data.size();
        for(int i = 0; i < n; i++) { 
            if(data.get(i) == item) { 
                return true;
            }
        }
        return false;
    }
}
