package day40_statics;

public class Address {

    public String buildingNumber;
    public String streetNumber;
    public String cityName;
    public String stateName;
    public String zipCode;
    public static String countryName = "USA";

    public void setInfo(String buildingNumber, String streetNumber, String cityName, String stateName, String zipCode){

        buildingNumber = buildingNumber;
        streetNumber = streetNumber;
        cityName = cityName;
        stateName = stateName;
        zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
