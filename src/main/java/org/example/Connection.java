package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Connection {

    /**Запит*/
    public static final String SELECT_ALL_STUDENTS = "SELECT * FROM student";

    /**Назви стопців в таблиці*/
    public static final String ID = "id";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String MIDDLE_NAME = "middle_name";
    public static final String BIRTH_DATE = "birth_date";
    public static final String GRADEBOOK_NUMBER = "gradebook_number";

    /**З'єднання з базою даних*/
    private java.sql.Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/student_data?user=root&password=1724";
        java.sql.Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /**Отримання студентів з бази даних*/
    public List<Student> findAll() throws DatabaseExcep {
        try (java.sql.Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(SELECT_ALL_STUDENTS)) {
            return getStudents(stmt);
        } catch (SQLException e) {
            throw new DatabaseExcep("Cannot get all students from database", e);
        }
    }
    private List<Student> getStudents(PreparedStatement stmt) throws SQLException {
        List<Student> students = new ArrayList<>();
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Student student = Student.builder()
                    .id(rs.getInt(ID))
                    .firstName(rs.getString(FIRST_NAME))
                    .lastName(rs.getString(LAST_NAME))
                    .middleName(rs.getString(MIDDLE_NAME))
                    .birthDate(Date.valueOf(rs.getString(BIRTH_DATE)))
                    .gradebookNumber(rs.getString(GRADEBOOK_NUMBER))
                    .build();

            students.add(student);
        }
        return students;
    }
}
