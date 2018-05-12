package commander;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static commander.CommanderRobot.allowedKeys;
import static org.junit.jupiter.api.Assertions.*;

class CommanderRobotTest extends CommanderFunctions {

    @Test
    void TestAllowedKeysString(){
        System.out.println(allowedKeys.length);
        System.out.println(Arrays.toString(allowedKeys));
    }

    @Test
    void TestKeysCheck() {
        System.out.println(CommanderRobot.KeysCheck("ctrl+esc+i"));
    }
}