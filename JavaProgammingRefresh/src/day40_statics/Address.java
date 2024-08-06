package day40_statics;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;
    public static String country = "USA";

    public Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public static void setCountry(String country) {
        Address.country = country;
    }

    @Override
    public String toString() {
        return buildingNumber + street + '\'' +
                city + state + zipCode;
    }
}
