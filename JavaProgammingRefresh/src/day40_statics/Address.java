package day40_statics;

public class Address {

    public String buildingNumber;
    public String streetNumber;
    public String cityName;
    public String stateName;
    public String zipCode;
    public static String countryName = "USA";

    public Address(String buildingNumber, String streetNumber, String cityName, String stateName, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return
                buildingNumber + " " + streetNumber + "\n" +
                        cityName + " " + stateName + ", " + zipCode;
    }
}
