package controller;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {
    Group createGroup(int countOfStudents, int maxStudentsCount) {
        Group group = new Group();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            students.add(studentCreator.createTypicalStudent());
        }
        group.setStudents(students);
        group.setMaxStudentsCount(maxStudentsCount);
        return group;
    }

    Group createTypicalGroup() {
        Group group = createGroup(4, 8);
        return group;
    }

}