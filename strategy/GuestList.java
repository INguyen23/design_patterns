package strategy;

import java.util.ArrayList;

/**
 * A list of people that includes methods that can add, remove, and search the list
 * @author Ivon Nguyen
 */
public class GuestList { 
    private String title;
    private ArrayList<String> people = new ArrayList<>();
    private SearchBehavior searchBehavior;

    public GuestList(String title) { 
        this.title = title;
    }

    /**
     * Checks the list and adds person if they are not on the list
     * @param person Element in the list
     * @return true or false 
     */
    public boolean add(String person) { 
        if(people.contains(person)) { 
            return false;
        }
        else { 
            people.add(person);
            return true;
        }
    }

    /**
     * Checks the list and removes person if they are in the list
     * @param person Element in the list
     * @return true or false
     */
    public boolean remove(String person) { 
        if(people.contains(person)) { 
            people.remove(person);
            return true;
        }
        else { 
            return false;
        }
    }

    /**
     * gets the title of the list
     * @return title 
     */
    public String getTitle() { 
        return this.title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) { 
        searchBehavior = searchBehavior;
    }

    public ArrayList<String> getList() { 
        return people;
    }
}