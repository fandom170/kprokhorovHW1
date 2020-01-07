package HomeWork6;

public class Country {
    private String name;
    private boolean isTelenorSupported;


    public Country(String name, boolean telenorSupported) {
        this.name = name;
        this.isTelenorSupported = telenorSupported;
    }

    public String getCountryName() {
        return name;
    }

    public Boolean getTelenorSupportStatus() {
        return isTelenorSupported;
    }

    public void setIsTelenorSupported(boolean telenor) {
        isTelenorSupported = telenor;
    }
}
