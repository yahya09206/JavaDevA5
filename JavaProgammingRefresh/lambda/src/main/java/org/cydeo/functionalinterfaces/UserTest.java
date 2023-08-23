package org.cydeo.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        // Print all elements in the list
    }

    private static void printName(List<User> users, Predicate<User> p){

        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
