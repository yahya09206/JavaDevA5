package day40_statics;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;
    public static String country = "United States";

    public Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
