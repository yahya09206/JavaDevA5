package day40_statics;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;
    public static String country = "USA";
    public static String planet = "Earth";

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }



    @Override
    public String toString() {
        return buildingNumber + street + '\n' +
                city + " " + state + " " + zipCode;
    }
}
