package org.example;

import java.sql.Date;
import java.util.List;

public class StudentSettings {
    private final Connection conn = new Connection();

    /**Пошук всіх студентів в БД*/
    public List<Student> getAllStudent() throws DatabaseExcep {
        return conn.findAll();
    }

    /**Пошук студентів за прізвищем*/
    public List<Student> getByLastName(String lastName) throws DatabaseExcep {
        List<Student> students = conn.findAll();
        return students.stream()
                .filter(student -> student.getLastName().equals(lastName))
                .toList();
    }

    /**Пошук всіх студентів за датою народження*/
    public List<Student> getByBirthDate(Date fromDate, Date toDate) throws DatabaseExcep {
        List<Student> students = conn.findAll();
        return students.stream()
                .filter(student -> student.getBirthDate().after(fromDate)
                        && student.getBirthDate().before(toDate))
                .toList();
    }
}
