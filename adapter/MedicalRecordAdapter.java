package adapter;

import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;

    /**
     * Initailizing Constructor
     * @param record
     */
    public MedicalRecordAdapter(HealthRecord record) { 
        this.record = record;
    }

    /**
     * gets the first name of the patient
     * @return patients first name
     */
    public String getFirstName() { 
        String name = record.getName();
        return name.split(" ")[0];
    }

    /**
     * gets the last name of the patient
     * @return patients last name
     */
    public String getLastName() { 
        String name = record.getName();
        return name.split(" ")[1];
    }

    /**
     * gets the birthday of the patient
     * @return patients birthday
     */
    public Date getBirthday() { 
        return record.getBirthdate();
    }

    /**
     * parse gender from String to type Gender to get the gender of the patient
     * @return gender of the patient 
     */
    public Gender getGender() { 
        Gender gender;
        if(record.getGender().equalsIgnoreCase("male")) {
            gender = Gender.MALE;
            return gender;
        } else if(record.getGender().equalsIgnoreCase("female")) {
            gender = Gender.FEMALE;
            return gender;
        } else {
            gender = Gender.OTHER;
            return gender;
        }
    }

    /**
     * add a visit to an array of visits
     * @param date 
     * @param well
     * @param description
     */
    public void addVisit(Date date, boolean well, String description) { 
        record.addHistory(date, well, description);
    }

    /**
     * parse Health Record visit information into Medical Record format 
     * @return formatted visit history 
     */
    public ArrayList<Visit> getVisitHistory() { 
        ArrayList<Visit> visitHistory = new ArrayList<Visit>();
        ArrayList<String> visitAsStrings = new ArrayList<>();
        visitAsStrings = record.getHistory();
        for(int i = 0; i < record.getHistory().size(); i++) {
            String history = visitAsStrings.get(i);
            String[] line = history.split(System.lineSeparator());
            String[] splitLine = line[0].split(" ");
            String[] splitLine2 = line[1].split(" ");
            String[] splitLine3 = line[2].split(" ");
            String dateString = splitLine[1]; 
            dateString += splitLine[2];
            dateString += splitLine[3];
            dateString += splitLine[4];
            String[] dateValues = dateString.split("/");
            String wellString = splitLine2[1];
            String description = splitLine3[1];
            Date date = new Date();
            Boolean well = true;
            if(wellString.equalsIgnoreCase("false")) {
                well = false;
            }
            visitHistory.add(new Visit(date, well, description));
        }
        return visitHistory;
    }

    public String toString() { 
        String result = "***** " + this.getFirstName() + " " + this.getLastName() + " *****\n";
        result += "Birthday: " + this.getBirthday() + "\n";
        result += "Gender: " + this.getGender() + "\n";
        result += "Medical Visit History: \n";

        if(getVisitHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : getVisitHistory()){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
