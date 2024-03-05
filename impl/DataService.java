package hw6.impl;

import hw6.studygroup.Student;
import hw6.studygroup.Students;
import hw6.studygroup.Teacher;
import hw6.studygroup.User;

import java.util.List;

public interface DataService { // На каждый объект возлагается одна обязанность, полностью инкапсулированная в класс. (Принцип единственной ответственности (SRP))
    User create(Student student);

    User create(Students students);

    User create(Teacher teacher);

    List<User> read(List<User> users);
}
