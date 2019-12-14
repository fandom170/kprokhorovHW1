package HomeWork6;

import java.util.Map;
import java.util.TreeMap;

public class DataUpdate {
    public void countryUpdate(int telenor, String country, TreeMap<Integer, Country> data) {
        for (Map.Entry<Integer, Country> entry : data.entrySet()) {
            Country tempCountry = entry.getValue();
            if (tempCountry.getCountryName().equals(country)) {
                tempCountry.setIsTelenorSupported(telenor);
            }
        }
    }
}
