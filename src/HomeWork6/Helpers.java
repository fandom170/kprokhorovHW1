package HomeWork6;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Helpers {
    private String csvPath;
    private TreeMap<Integer, Country> fileData = null;

    public Helpers(String csvPath) {
        this.csvPath = csvPath;
        fileData = new TreeMap<>();
        readFile();
    }

    public void readFile() {
        BufferedReader csvReader = null;
        String row, separator = ",";
        int orderNumber = 0;
        try {
            csvReader = new BufferedReader(new FileReader(csvPath));
            while ((row = csvReader.readLine()) != null) {
                if (row.equals("") || row.equals(" ")) {
                    break;
                }
                orderNumber++;
                String[] rawCountry = row.split(separator);
                Boolean boolSupport = Boolean.parseBoolean(rawCountry[1]);
                Country country = new Country(rawCountry[0], boolSupport);
                fileData.put(orderNumber, country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Wrong data in source file.");
            System.exit(-1);
        } finally {
            if (csvReader != null) {
                try {
                    csvReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void writeFile() {
        FileWriter csvWriter = null;

        try {
            csvWriter = new FileWriter(csvPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, Country> entry : fileData.entrySet()) {
            Country tempCountry = entry.getValue();
            String newLine = tempCountry.getCountryName() + "," + tempCountry.getTelenorSupportStatus() + "\n";
            try {
                csvWriter.write(newLine);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (csvWriter != null) {
            try {
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void printCountriesByStatus(boolean isTelenorSupported) {
        for (Map.Entry<Integer, Country> entry : fileData.entrySet()) {
            Country tempCountry = entry.getValue();
            if (tempCountry.getTelenorSupportStatus() == isTelenorSupported) {
                System.out.printf("Country %s has following status for Telenor support: %b\n", tempCountry.getCountryName(),
                        tempCountry.getTelenorSupportStatus());
            }
        }
    }

    public void updateCountryByName(String countryName, boolean telenorSupport) {
        for (Map.Entry<Integer, Country> entry : fileData.entrySet()) {
            Country tempCountry = entry.getValue();
            if (tempCountry.getCountryName().equals(countryName)) {
                tempCountry.setIsTelenorSupported(telenorSupport);
                int orderNo = entry.getKey();
                fileData.replace(orderNo, tempCountry);
            }
        }
    }

    public void addNewCountry(String countryName, boolean telenorSupport) {
        int newOrderNo = fileData.lastKey() + 1;
        Country newCountry = new Country(countryName, telenorSupport);
        fileData.put(newOrderNo, newCountry);
    }
}
