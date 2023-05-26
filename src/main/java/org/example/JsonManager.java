package org.example;

//import com.google.gson.Gson;
import com.google.gson.Gson;
import model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    public void writeToJson(Object rck, String filePath) {
        Gson gson = new Gson();
        String json = gson.toJson(rck);
        try {
            FileWriter myWriter = new FileWriter(filePath);
            gson.toJson(rck,myWriter);
            //myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public Object readFromJson(String filePath) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return null;
    }
}