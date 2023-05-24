package controller;

import model.Department;
import model.Faculty;
import model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {
    Faculty createFaculty(int countOfDepartments, int maxDepartmentsCount, Human boss) {
        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < countOfDepartments; i++) {
            departments.add(departmentCreator.createTypicalDepartment());
        }

        faculty.setDepartments(departments);
        faculty.setMaxDepartmentsCount(maxDepartmentsCount);
        faculty.setBoss(boss);
        return faculty;
    }

    Faculty createTypicalFaculty() {
        HumanCreator humanCreator = new HumanCreator();
        Faculty group = createFaculty(2, 3, humanCreator.createTypicalHuman());
        return group;
    }

}