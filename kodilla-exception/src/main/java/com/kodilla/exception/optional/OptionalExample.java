package com.kodilla.exception.optional;

import com.kodilla.exception.nullpointer.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("FFF");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getName()));
//        8.3 TEORIA NA TEMAT OPTIONALA TO DRAMATYCZNY BALAGAN...
    }
}