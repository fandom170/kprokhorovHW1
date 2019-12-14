package HomeWork6;

import java.util.TreeMap;

public class Homework6 {
    public static void main(String[] args) {

        TreeMap<Integer, Country> fileData;
        String filePath = "D:\\IdeaProjects\\AutomationTEAM\\src\\HomeWork6\\new.csv";
        String countryForUpdate = "Denmark";
        String country = "Ukraine";
        FileWorks fw = new FileWorks(filePath);
        DataUpdate du = new DataUpdate();
        int telenorSupport = 1;
        fileData = fw.readFile(filePath);
        int newNumber = fileData.size() + 1;
        Country newCountry = new Country(country, telenorSupport);
        fileData.put(newNumber, newCountry);
        fw.getFilteredList(telenorSupport, fileData);
        du.countryUpdate(telenorSupport, countryForUpdate, fileData);
        fw.writeFile(fileData);


    }

}
