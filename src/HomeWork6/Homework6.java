package HomeWork6;

import java.util.TreeMap;

public class Homework6 {
    public static void main(String[] args) {

        TreeMap<Integer, Country> fileData;
        String filePath = "D:\\IdeaProjects\\AutomationTEAM\\src\\HomeWork6\\new.csv";
        String countryForUpdate = "Denmark";
        String country = "Ukraine";
        DictionaryWorks fw = new DictionaryWorks(filePath);
        boolean telenorSupport = true;
        boolean newTelenorStatus = true;
        boolean telenorSupportForNewCountry = false;

        fw.printCountriesByStatus(telenorSupport);
        fw.updateCountryByName(countryForUpdate, newTelenorStatus);
        fw.addNewCountry(country, telenorSupportForNewCountry);
        fw.writeFile();


    }

}
