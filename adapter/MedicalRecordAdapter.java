package adapter;

import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) { 
        this.record = record;
    }

    public String getFirstName() { 
        return record.getName().split(" ")[0];
    }

    public String getLastName() { 
        return record.getName().split(" ")[1];
    }

    public Date getBirthday() { 
        return record.getBirthdate();
    }

    public Gender getGender() { 
        
    }

    public void addVisit(Date date, boolean well, String description) { 

    }

    public ArrayList<Visit> getVisitHistory() { 

    }

    public String toString() { 
       
    }
}
