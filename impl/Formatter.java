package hw6.impl;


import hw6.studygroup.Student;

import java.util.List;

public interface Formatter { //пользователь сам решает какой формат и какой интерфейс использовать, а какой нет. (Принцип разделения интерфейса (ISP))
    public String format(List<Student> studentList);
}