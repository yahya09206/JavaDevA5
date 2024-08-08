package day43_oop_encapsulation;

public class Encapsulation {

    public String username = "Cydeo",
                    password = "Cydeo123";


    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){

        this.username = username;
    }

    public void setPassword(String password){

        this.password = password;
    }
}
