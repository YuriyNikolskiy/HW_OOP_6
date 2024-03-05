package hw6.impl;

import hw6.studygroup.Student;
import hw6.studygroup.Students;
import hw6.studygroup.Teacher;
import hw6.studygroup.User;

import java.util.Date;
import java.util.List;

public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return new Student(new Date(), "std_fio", 1);
    }

    @Override
    public User create(Students students) {
        return new Students(new Date(), 2);
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(new Date(), "teach_fio", 1);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
