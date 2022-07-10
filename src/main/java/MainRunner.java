import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    static TestNG testNG;
    public static void main(String[] args){
        testNG = new TestNG();
        String path = System.getProperty("user.dir")+"\\"+"testng.xml";
        System.out.println("Path "+path);
        List<String> xmlList = new ArrayList<String>();
        xmlList.add(path);
        testNG.setTestSuites(xmlList);
        testNG.run();
    }
}
