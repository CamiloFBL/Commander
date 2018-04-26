package commander;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.PropertyResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class CommanderFunctionsTest extends CommanderFunctions {

    @Test
    void TestCreateCommNamesByKeyPress() {
        CreateCommNamesByKeyPress();
    }

    @Test
    void TestCreateCommKeyPress() {
        CreateCommKeyPress();
    }

    @Test
    void TestReadCommNamesByKeyPress() {
        System.out.println("Testing ReadCommNamesByKeyPress method");
        ReadCommNamesByKeyPress();
    }

    @Test
    void TestReadCommKeyPress() {
        System.out.println("Testing TestReadCommKeyPress method");
        ReadCommKeyPress();
    }

    @Test
    void TestCheckComms() {
        CheckComms();
    }

    @Test
    void TestInitCheck() {
        InitCheck();
    }
}