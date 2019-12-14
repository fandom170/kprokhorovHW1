package HomeWork6;

public class Country {
    private String name;
    private Boolean isTelenorSupported;


    public Country(String name, int telenorSupported) {
        this.name = name;
        this.isTelenorSupported = telenorSupported > 0 ? true : false;
    }

    public String getCountryName() {
        return name;
    }

    public Boolean getTelenorSupportStatus() {
        return isTelenorSupported;
    }

    public void setIsTelenorSupported(int telenor) {
        if (telenor > 0) {
            isTelenorSupported = true;
        } else {
            isTelenorSupported = false;
        }

    }

}
