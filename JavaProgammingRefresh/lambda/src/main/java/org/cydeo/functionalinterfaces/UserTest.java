package org.cydeo.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(32).build());
        users.add(User.builder().firstName("Mitch").lastName("Samuel").age(23).build());
        users.add(User.builder().firstName("Meech").lastName("Evans").age(44).build());
        users.add(User.builder().firstName("Meeks").lastName("Sally").age(51).build());
        // Print all elements in the list
        printName(users, p -> true);


        // Print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p){

        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
