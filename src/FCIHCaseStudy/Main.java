
package FCIHCaseStudy;

import FCIH_GUI.LoginFrame;
import java.io.File;

/**
 *
 * @author Salma Hnay
 */
public class Main {

    public static Department general = new Department("0", "General", "General Dept");
    public static Department cs = new Department("1", "CS", "Computer Science");
    public static Department is = new Department("2", "IS", "Information System");
    public static Department it = new Department("3", "IT", "Information Technology");
    public static Department sw = new Department("4", "SW", "Software Engineering");
    public static Department sa = new Department("5", "SA", "Student Affairs");
    public static Department sta = new Department("5", "StA", "Staff Affairs");

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
        checkDirectoryContents(currentDir);

    LoginFrame f = new LoginFrame();
    f.setVisible(true);
    }

    public static void checkDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        boolean studentFile = true;
        boolean profFile = true;
       
        boolean courseFile = true;

        for (File file : files) {

            if (file.getName().contains("Students.bin")) {
                studentFile = false;
            } else if (file.getName().contains("Professor.bin")) {
                profFile = false;
            
            } else if (file.getName().contains("Courses.bin")) {
                courseFile = false;
            }
        }
        if (studentFile) {
            Student x = new Student();
            x.commitToFile();
        }

        if (profFile) {
            Professor x = new Professor();
            x.commitToFile();
        }
        
        if (courseFile) {
            Course x = new Course();
            x.commitToFile();
        }
    }

}
