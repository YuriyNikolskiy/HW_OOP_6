package hw6.impl;

import hw6.studygroup.User;

import java.util.List;

public class View {
    public String studentView(List<User> student) { //Безболезненное взаимозамещение "Parent" and "Child" (Принцип подстановки Барбары Лисков (LSP))
        return student.toString();
    }

    public String sgView(List<User> students) {
        return students.toString(); //Безболезненное взаимозамещение "Parent" and "Child" (Принцип подстановки Барбары Лисков (LSP))
}
}

