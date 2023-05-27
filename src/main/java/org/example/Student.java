package org.example;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthDate;
    private String gradebookNumber;

    @Override
    public String toString() {
        return  "Student " + id + ": {\n" +
                "Name: " + lastName + " " + firstName + " " + middleName +  "\n" +
                "Date of birth: " + birthDate + "\n" +
                "Number of gradebook: " + gradebookNumber + '\n' +
                "}";
    }
}
