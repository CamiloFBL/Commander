package commander;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;

public class CommanderRobot {

    public static String[] allowedKeys = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","f1","f2","f3","f4","f5","f6","f7","f8","f9","f10","f11","f12","f13","f14","f15","f16","f17","f18","f19","f20","f21","f22","f23","f24","windows","context","up","down","left","right","esc","enter","backspace","tab","shift","ctrl","alt","altgr","prtscreen","caps","numlock","home","insert","end","pgdown","pgup","del"};

    public static void RobotKeyPresses(String KeyPress) {
        try{
            Robot robot = new Robot();
            if(KeyPress.equals("a"))
                robot.keyPress((KeyEvent.VK_A));
            if(KeyPress.equals("b"))
                robot.keyPress((KeyEvent.VK_B));
            if(KeyPress.equals("c"))
                robot.keyPress((KeyEvent.VK_C));
            if(KeyPress.equals("d"))
                robot.keyPress((KeyEvent.VK_D));
            if(KeyPress.equals("e"))
                robot.keyPress((KeyEvent.VK_E));
            if(KeyPress.equals("f"))
                robot.keyPress((KeyEvent.VK_F));
            if(KeyPress.equals("g"))
                robot.keyPress((KeyEvent.VK_G));
            if(KeyPress.equals("h"))
                robot.keyPress((KeyEvent.VK_H));
            if(KeyPress.equals("i"))
                robot.keyPress((KeyEvent.VK_I));
            if(KeyPress.equals("j"))
                robot.keyPress((KeyEvent.VK_J));
            if(KeyPress.equals("k"))
                robot.keyPress((KeyEvent.VK_K));
            if(KeyPress.equals("l"))
                robot.keyPress((KeyEvent.VK_L));
            if(KeyPress.equals("m"))
                robot.keyPress((KeyEvent.VK_M));
            if(KeyPress.equals("n"))
                robot.keyPress((KeyEvent.VK_N));
            if(KeyPress.equals("o"))
                robot.keyPress((KeyEvent.VK_O));
            if(KeyPress.equals("p"))
                robot.keyPress((KeyEvent.VK_P));
            if(KeyPress.equals("q"))
                robot.keyPress((KeyEvent.VK_Q));
            if(KeyPress.equals("r"))
                robot.keyPress((KeyEvent.VK_R));
            if(KeyPress.equals("s"))
                robot.keyPress((KeyEvent.VK_S));
            if(KeyPress.equals("t"))
                robot.keyPress((KeyEvent.VK_T));
            if(KeyPress.equals("u"))
                robot.keyPress((KeyEvent.VK_U));
            if(KeyPress.equals("v"))
                robot.keyPress((KeyEvent.VK_V));
            if(KeyPress.equals("w"))
                robot.keyPress((KeyEvent.VK_W));
            if(KeyPress.equals("x"))
                robot.keyPress((KeyEvent.VK_X));
            if(KeyPress.equals("y"))
                robot.keyPress((KeyEvent.VK_Y));
            if(KeyPress.equals("z"))
                robot.keyPress((KeyEvent.VK_Z));
            if(KeyPress.equals("0"))
                robot.keyPress((KeyEvent.VK_0));
            if(KeyPress.equals("1"))
                robot.keyPress((KeyEvent.VK_1));
            if(KeyPress.equals("2"))
                robot.keyPress((KeyEvent.VK_2));
            if(KeyPress.equals("3"))
                robot.keyPress((KeyEvent.VK_3));
            if(KeyPress.equals("4"))
                robot.keyPress((KeyEvent.VK_4));
            if(KeyPress.equals("5"))
                robot.keyPress((KeyEvent.VK_5));
            if(KeyPress.equals("6"))
                robot.keyPress((KeyEvent.VK_6));
            if(KeyPress.equals("7"))
                robot.keyPress((KeyEvent.VK_7));
            if(KeyPress.equals("8"))
                robot.keyPress((KeyEvent.VK_8));
            if(KeyPress.equals("9"))
                robot.keyPress((KeyEvent.VK_9));
            if(KeyPress.equals("f1"))
                robot.keyPress((KeyEvent.VK_F1));
            if(KeyPress.equals("f2"))
                robot.keyPress((KeyEvent.VK_F2));
            if(KeyPress.equals("f3"))
                robot.keyPress((KeyEvent.VK_F3));
            if(KeyPress.equals("f4"))
                robot.keyPress((KeyEvent.VK_F4));
            if(KeyPress.equals("f5"))
                robot.keyPress((KeyEvent.VK_F5));
            if(KeyPress.equals("f6"))
                robot.keyPress((KeyEvent.VK_F6));
            if(KeyPress.equals("f7"))
                robot.keyPress((KeyEvent.VK_F7));
            if(KeyPress.equals("f8"))
                robot.keyPress((KeyEvent.VK_F8));
            if(KeyPress.equals("f9"))
                robot.keyPress((KeyEvent.VK_F9));
            if(KeyPress.equals("f10"))
                robot.keyPress((KeyEvent.VK_F10));
            if(KeyPress.equals("f11"))
                robot.keyPress((KeyEvent.VK_F11));
            if(KeyPress.equals("f12"))
                robot.keyPress((KeyEvent.VK_F12));
            if(KeyPress.equals("f13"))
                robot.keyPress((KeyEvent.VK_F13));
            if(KeyPress.equals("f14"))
                robot.keyPress((KeyEvent.VK_F14));
            if(KeyPress.equals("f15"))
                robot.keyPress((KeyEvent.VK_F15));
            if(KeyPress.equals("f16"))
                robot.keyPress((KeyEvent.VK_F16));
            if(KeyPress.equals("f17"))
                robot.keyPress((KeyEvent.VK_F17));
            if(KeyPress.equals("f18"))
                robot.keyPress((KeyEvent.VK_F18));
            if(KeyPress.equals("f19"))
                robot.keyPress((KeyEvent.VK_F19));
            if(KeyPress.equals("f20"))
                robot.keyPress((KeyEvent.VK_F20));
            if(KeyPress.equals("f21"))
                robot.keyPress((KeyEvent.VK_F21));
            if(KeyPress.equals("f22"))
                robot.keyPress((KeyEvent.VK_F22));
            if(KeyPress.equals("f23"))
                robot.keyPress((KeyEvent.VK_F23));
            if(KeyPress.equals("f24"))
                robot.keyPress((KeyEvent.VK_F24));
            if(KeyPress.equals("windows"))
                robot.keyPress((KeyEvent.VK_WINDOWS));
            if(KeyPress.equals("context"))
                robot.keyPress((KeyEvent.VK_CONTEXT_MENU));
            if(KeyPress.equals("up"))
                robot.keyPress((KeyEvent.VK_UP));
            if(KeyPress.equals("down"))
                robot.keyPress((KeyEvent.VK_DOWN));
            if(KeyPress.equals("left"))
                robot.keyPress((KeyEvent.VK_LEFT));
            if(KeyPress.equals("right"))
                robot.keyPress((KeyEvent.VK_RIGHT));
            if(KeyPress.equals("esc"))
                robot.keyPress((KeyEvent.VK_ESCAPE));
            if(KeyPress.equals("enter"))
                robot.keyPress((KeyEvent.VK_ENTER));
            if(KeyPress.equals("backspace"))
                robot.keyPress((KeyEvent.VK_BACK_SPACE));
            if(KeyPress.equals("tab"))
                robot.keyPress((KeyEvent.VK_TAB));
            if(KeyPress.equals("shift"))
                robot.keyPress((KeyEvent.VK_SHIFT));
            if(KeyPress.equals("ctrl"))
                robot.keyPress((KeyEvent.VK_CONTROL));
            if(KeyPress.equals("alt"))
                robot.keyPress((KeyEvent.VK_ALT));
            if(KeyPress.equals("altgr"))
                robot.keyPress((KeyEvent.VK_ALT_GRAPH));
            if(KeyPress.equals("prtscreen"))
                robot.keyPress((KeyEvent.VK_PRINTSCREEN));
            if(KeyPress.equals("caps"))
                robot.keyPress((KeyEvent.VK_CAPS_LOCK));
            if(KeyPress.equals("numlock"))
                robot.keyPress((KeyEvent.VK_NUM_LOCK));
            if(KeyPress.equals("home"))
                robot.keyPress((KeyEvent.VK_HOME));
            if(KeyPress.equals("insert"))
                robot.keyPress((KeyEvent.VK_INSERT));
            if(KeyPress.equals("end"))
                robot.keyPress((KeyEvent.VK_END));
            if(KeyPress.equals("pgdown"))
                robot.keyPress((KeyEvent.VK_PAGE_DOWN));
            if(KeyPress.equals("pgup"))
                robot.keyPress((KeyEvent.VK_PAGE_UP));
            if(KeyPress.equals("del"))
                robot.keyPress((KeyEvent.VK_DELETE));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void RobotKeyReleases(String KeyPress){
        try{
            Robot robot = new Robot();
            if(KeyPress.equals("a"))
                robot.keyRelease((KeyEvent.VK_A));
            if(KeyPress.equals("b"))
                robot.keyRelease((KeyEvent.VK_B));
            if(KeyPress.equals("c"))
                robot.keyRelease((KeyEvent.VK_C));
            if(KeyPress.equals("d"))
                robot.keyRelease((KeyEvent.VK_D));
            if(KeyPress.equals("e"))
                robot.keyRelease((KeyEvent.VK_E));
            if(KeyPress.equals("f"))
                robot.keyRelease((KeyEvent.VK_F));
            if(KeyPress.equals("g"))
                robot.keyRelease((KeyEvent.VK_G));
            if(KeyPress.equals("h"))
                robot.keyRelease((KeyEvent.VK_H));
            if(KeyPress.equals("i"))
                robot.keyRelease((KeyEvent.VK_I));
            if(KeyPress.equals("j"))
                robot.keyRelease((KeyEvent.VK_J));
            if(KeyPress.equals("k"))
                robot.keyRelease((KeyEvent.VK_K));
            if(KeyPress.equals("l"))
                robot.keyRelease((KeyEvent.VK_L));
            if(KeyPress.equals("m"))
                robot.keyRelease((KeyEvent.VK_M));
            if(KeyPress.equals("n"))
                robot.keyRelease((KeyEvent.VK_N));
            if(KeyPress.equals("o"))
                robot.keyRelease((KeyEvent.VK_O));
            if(KeyPress.equals("p"))
                robot.keyRelease((KeyEvent.VK_P));
            if(KeyPress.equals("q"))
                robot.keyRelease((KeyEvent.VK_Q));
            if(KeyPress.equals("r"))
                robot.keyRelease((KeyEvent.VK_R));
            if(KeyPress.equals("s"))
                robot.keyRelease((KeyEvent.VK_S));
            if(KeyPress.equals("t"))
                robot.keyRelease((KeyEvent.VK_T));
            if(KeyPress.equals("u"))
                robot.keyRelease((KeyEvent.VK_U));
            if(KeyPress.equals("v"))
                robot.keyRelease((KeyEvent.VK_V));
            if(KeyPress.equals("w"))
                robot.keyRelease((KeyEvent.VK_W));
            if(KeyPress.equals("x"))
                robot.keyRelease((KeyEvent.VK_X));
            if(KeyPress.equals("y"))
                robot.keyRelease((KeyEvent.VK_Y));
            if(KeyPress.equals("z"))
                robot.keyRelease((KeyEvent.VK_Z));
            if(KeyPress.equals("0"))
                robot.keyRelease((KeyEvent.VK_0));
            if(KeyPress.equals("1"))
                robot.keyRelease((KeyEvent.VK_1));
            if(KeyPress.equals("2"))
                robot.keyRelease((KeyEvent.VK_2));
            if(KeyPress.equals("3"))
                robot.keyRelease((KeyEvent.VK_3));
            if(KeyPress.equals("4"))
                robot.keyRelease((KeyEvent.VK_4));
            if(KeyPress.equals("5"))
                robot.keyRelease((KeyEvent.VK_5));
            if(KeyPress.equals("6"))
                robot.keyRelease((KeyEvent.VK_6));
            if(KeyPress.equals("7"))
                robot.keyRelease((KeyEvent.VK_7));
            if(KeyPress.equals("8"))
                robot.keyRelease((KeyEvent.VK_8));
            if(KeyPress.equals("9"))
                robot.keyRelease((KeyEvent.VK_9));
            if(KeyPress.equals("f1"))
                robot.keyRelease((KeyEvent.VK_F1));
            if(KeyPress.equals("f2"))
                robot.keyRelease((KeyEvent.VK_F2));
            if(KeyPress.equals("f3"))
                robot.keyRelease((KeyEvent.VK_F3));
            if(KeyPress.equals("f4"))
                robot.keyRelease((KeyEvent.VK_F4));
            if(KeyPress.equals("f5"))
                robot.keyRelease((KeyEvent.VK_F5));
            if(KeyPress.equals("f6"))
                robot.keyRelease((KeyEvent.VK_F6));
            if(KeyPress.equals("f7"))
                robot.keyRelease((KeyEvent.VK_F7));
            if(KeyPress.equals("f8"))
                robot.keyRelease((KeyEvent.VK_F8));
            if(KeyPress.equals("f9"))
                robot.keyRelease((KeyEvent.VK_F9));
            if(KeyPress.equals("f10"))
                robot.keyRelease((KeyEvent.VK_F10));
            if(KeyPress.equals("f11"))
                robot.keyRelease((KeyEvent.VK_F11));
            if(KeyPress.equals("f12"))
                robot.keyRelease((KeyEvent.VK_F12));
            if(KeyPress.equals("f13"))
                robot.keyRelease((KeyEvent.VK_F13));
            if(KeyPress.equals("f14"))
                robot.keyRelease((KeyEvent.VK_F14));
            if(KeyPress.equals("f15"))
                robot.keyRelease((KeyEvent.VK_F15));
            if(KeyPress.equals("f16"))
                robot.keyRelease((KeyEvent.VK_F16));
            if(KeyPress.equals("f17"))
                robot.keyRelease((KeyEvent.VK_F17));
            if(KeyPress.equals("f18"))
                robot.keyRelease((KeyEvent.VK_F18));
            if(KeyPress.equals("f19"))
                robot.keyRelease((KeyEvent.VK_F19));
            if(KeyPress.equals("f20"))
                robot.keyRelease((KeyEvent.VK_F20));
            if(KeyPress.equals("f21"))
                robot.keyRelease((KeyEvent.VK_F21));
            if(KeyPress.equals("f22"))
                robot.keyRelease((KeyEvent.VK_F22));
            if(KeyPress.equals("f23"))
                robot.keyRelease((KeyEvent.VK_F23));
            if(KeyPress.equals("f24"))
                robot.keyRelease((KeyEvent.VK_F24));
            if(KeyPress.equals("windows"))
                robot.keyRelease((KeyEvent.VK_WINDOWS));
            if(KeyPress.equals("context"))
                robot.keyRelease((KeyEvent.VK_CONTEXT_MENU));
            if(KeyPress.equals("up"))
                robot.keyRelease((KeyEvent.VK_UP));
            if(KeyPress.equals("down"))
                robot.keyRelease((KeyEvent.VK_DOWN));
            if(KeyPress.equals("left"))
                robot.keyRelease((KeyEvent.VK_LEFT));
            if(KeyPress.equals("right"))
                robot.keyRelease((KeyEvent.VK_RIGHT));
            if(KeyPress.equals("esc"))
                robot.keyRelease((KeyEvent.VK_ESCAPE));
            if(KeyPress.equals("enter"))
                robot.keyRelease((KeyEvent.VK_ENTER));
            if(KeyPress.equals("backspace"))
                robot.keyRelease((KeyEvent.VK_BACK_SPACE));
            if(KeyPress.equals("tab"))
                robot.keyRelease((KeyEvent.VK_TAB));
            if(KeyPress.equals("shift"))
                robot.keyRelease((KeyEvent.VK_SHIFT));
            if(KeyPress.equals("ctrl"))
                robot.keyRelease((KeyEvent.VK_CONTROL));
            if(KeyPress.equals("alt"))
                robot.keyRelease((KeyEvent.VK_ALT));
            if(KeyPress.equals("altgr"))
                robot.keyRelease((KeyEvent.VK_ALT_GRAPH));
            if(KeyPress.equals("prtscreen"))
                robot.keyRelease((KeyEvent.VK_PRINTSCREEN));
            if(KeyPress.equals("caps"))
                robot.keyRelease((KeyEvent.VK_CAPS_LOCK));
            if(KeyPress.equals("numlock"))
                robot.keyRelease((KeyEvent.VK_NUM_LOCK));
            if(KeyPress.equals("home"))
                robot.keyRelease((KeyEvent.VK_HOME));
            if(KeyPress.equals("insert"))
                robot.keyRelease((KeyEvent.VK_INSERT));
            if(KeyPress.equals("end"))
                robot.keyRelease((KeyEvent.VK_END));
            if(KeyPress.equals("pgdown"))
                robot.keyRelease((KeyEvent.VK_PAGE_DOWN));
            if(KeyPress.equals("pgup"))
                robot.keyRelease((KeyEvent.VK_PAGE_UP));
            if(KeyPress.equals("del"))
                robot.keyRelease((KeyEvent.VK_DELETE));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void RobotExecApp(String AppExec){
        int commIndex = Arrays.asList(CommanderFunctions.commNamesByApps).indexOf(AppExec);
        String AppPath = CommanderFunctions.commAppsPath[commIndex];

        Runtime rs = Runtime.getRuntime();

        try{
            rs.exec(AppPath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Boolean KeysCheck(String keysString){
        String[] keys;
        keys = keysString.split("\\+");
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            System.out.println(key);
            if(!Arrays.asList(allowedKeys).contains(key)){
                return false;
            }
        }
        return true;
    }
}
