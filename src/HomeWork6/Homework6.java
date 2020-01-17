package HomeWork6;

public class Homework6 {
    public static void main(String[] args) {

        String filePath = "src/HomeWork6/CountriesList.csv";
        String country1ForUpdate = "Denmark";
        String country2ForUpdate = "Hungary";
        String newCountry = "Ukraine";
        Helpers fw = new Helpers(filePath);
        boolean telenorSupport = true;
        boolean newTelenorStatus = true;
        boolean telenorSupportForNewCountry = false;

        fw.printCountriesByStatus(telenorSupport);
        fw.updateCountryByName(country1ForUpdate, newTelenorStatus);
        fw.updateCountryByName(country2ForUpdate, newTelenorStatus);
        fw.addNewCountry(newCountry, telenorSupportForNewCountry);
        fw.printCountriesByStatus(false);
        fw.writeFile();
    }
}
