package hw6.impl;

import hw6.studygroup.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService us = new UserService();
        List<User> users = new ArrayList<>();
        users.add(us.create(new Student()));
        users.add(us.create(new Students()));
        users.add(us.create(new Teacher()));
        us.read(users);
        View view = new View();
        System.out.println(view.studentView(users));
        System.out.println(view.sgView(users));

    }
}