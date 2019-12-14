package HomeWork6;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class FileWorks {
    private String csvPath = "";
    private TreeMap<Integer, Country> fileData = null;

    public FileWorks(String csvPath) {
        this.csvPath = csvPath;
        this.fileData = readFile(csvPath);
    }

    public TreeMap readFile(String csvPath) {
        TreeMap<Integer, Country> readFileData = new TreeMap<>();
        BufferedReader csvReader = null;
        String row, separator = ",";
        int orderNumber = 0;
        try {
            csvReader = new BufferedReader(new FileReader(csvPath));

            while ((row = csvReader.readLine()) != null) {
                orderNumber++;
                String[] rawCountry = row.split(separator);
                Boolean boolSupport = Boolean.parseBoolean(rawCountry[1]);
                int support = boolSupport == false ? 0 : 1;
                Country country = new Country(rawCountry[0], support);
                readFileData.put(orderNumber, country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (csvReader != null) {
                try {
                    csvReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return readFileData;
    }

    public void writeFile(TreeMap<Integer, Country> fileData) {
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

    public void getFilteredList(int isTelenorSupported, TreeMap<Integer, Country> fileData) {
        Boolean support = true;
        if (isTelenorSupported == 0) {
            support = false;
        }
        for (Map.Entry<Integer, Country> entry : fileData.entrySet()) {
            Country tempCountry = entry.getValue();
            if (tempCountry.getTelenorSupportStatus().equals(support)) {
                System.out.printf("Country %s has following status for Telenor support: %b\n", tempCountry.getCountryName(),
                        tempCountry.getTelenorSupportStatus());
            }
        }
    }

}
