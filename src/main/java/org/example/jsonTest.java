package org.example;

import controller.UniversityCreator;
import junit.framework.Assert;
import model.University;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;
//import org.junit.Test;

public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "src/main/java/org/example/myJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}
