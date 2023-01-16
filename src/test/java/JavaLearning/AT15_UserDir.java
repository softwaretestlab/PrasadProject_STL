package JavaLearning;

import org.junit.Test;

public class AT15_UserDir {
    @Test
    public void UserDirectory() {
        System.out.println(System.getProperty("user.dir"));
        // C:\Users\softw\IdeaProjects\PrasadProject_STL\src\test\java\JavaLearning\PrasadImage.png
        System.out.println(System.getProperty("user.dir")+"\\src\\test\\java\\JavaLearning\\PrasadImage.png");

    }

    }
