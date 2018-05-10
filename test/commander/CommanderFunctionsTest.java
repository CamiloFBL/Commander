package commander;

import org.junit.jupiter.api.Test;
import java.io.IOException;

class CommanderFunctionsTest extends CommanderFunctions {

    @Test
    void TestCreateCommNamesByKeyPress() {
        System.out.println("Testing CreateCommNamesByKeyPress method");
        CreateCommNamesByKeyPress();
        for(int i = 0; commNamesByKeyPress.length > i; i++){
            System.out.println(commNamesByKeyPress[i]);
        }
    }

    @Test
    void TestCreateCommKeyPress() {
        System.out.println("Testing CreateCommKeyPress method");
        CreateCommKeyPress();
        for(int i = 0; commKeyPress.length > i; i++){
            System.out.println(commKeyPress[i]);
        }
    }

    @Test
    void TestCreateCommByKeyPress() {
        System.out.println("Testing CreateCommKeyPress method");
        CreateCommNamesByApps();
        for(int i = 0; commNamesByApps.length > i; i++){
            System.out.println(commNamesByApps[i]);
        }
    }

    @Test
    void TestCreateCommAppsPath() {
        System.out.println("Testing CreateCommAppsPath method");
        CreateCommAppsPath();
        for(int i = 0; commAppsPath.length > i; i++){
            System.out.println(commAppsPath[i]);
        }
    }

    @Test
    void TestReadCommNamesByKeyPress() {
        System.out.println("Testing ReadCommNamesByKeyPress method");
        ReadCommNamesByKeyPress();
        for(int i = 0; commNamesByKeyPress.length > i; i++){
            System.out.println(commNamesByKeyPress[i]);
        }
    }

    @Test
    void TestReadCommKeyPress() {
        System.out.println("Testing TestReadCommKeyPress method");
        ReadCommKeyPress();
        for(int i = 0; commKeyPress.length > i; i++){
            System.out.println(commKeyPress[i]);
        }
    }

    @Test
    void TestCheckComms() throws IOException {
        CheckComms();
    }

    @Test
    void TestInitCheck() throws IOException {
        InitCheck();
    }
}