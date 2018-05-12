package commander;

import javafx.application.Platform;

import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Arrays;
import java.util.Properties;
import java.awt.Robot;

public class CommanderFunctions {

    public static String commInit = new String();
    public static String commExit = "exit";
    public static String[] commNamesByKeyPress/* = new String[]{"whome", "taskmgr"}*/;
    public static String[] commKeyPress/* = new String[]{"windows", "ctrl+shift+esc"}*/;
    public static String[] commNamesByApps/* = new String[]{null}*/;
    public static String[] commAppsPath/* = new String[]{null}*/;

    public static void InitCheck() throws IOException {
        CheckComms();
        CheckPropFile();
    }

    public static void CheckComms() throws IOException {

        File txtCommNamesByKeyPress = new File("./CommNamesByKeyPress.txt");
        File txtCommKeyPress = new File("./CommKeyPress.txt");
        File txtCommNamesByApps = new File("./CommNamesByApps.txt");
        File txtCommAppsPath = new File("./CommAppsPath.txt");

        if(txtCommNamesByKeyPress.exists() && txtCommKeyPress.exists()){
            int linesCount1 = 0;
            FileReader fr = new FileReader(txtCommNamesByKeyPress);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount1++;
            }

            int linesCount2 = 0;
            FileReader fr2 = new FileReader(txtCommKeyPress);
            BufferedReader br2 = new BufferedReader(fr2);

            while (br2.readLine() != null) {
                linesCount2++;
            }

            if(linesCount1 == linesCount2){
                System.out.println("Commands by key press files found...");
                ReadCommKeyPress();
                ReadCommNamesByKeyPress();
            }
            else{
                System.out.println("Commands by key press files pair don't match, creating files...");
                CreateCommKeyPress();
                CreateCommNamesByKeyPress();
            }
        }
        else{
            System.out.println("Commands by key press files pair not found, creating files...");
            CreateCommKeyPress();
            CreateCommNamesByKeyPress();
        }


        if(txtCommNamesByApps.exists() && txtCommAppsPath.exists()){
            int linesCount1 = 0;
            FileReader fr = new FileReader(txtCommNamesByApps);
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount1++;
            }

            int linesCount2 = 0;
            FileReader fr2 = new FileReader(txtCommAppsPath);
            BufferedReader br2 = new BufferedReader(fr2);

            while (br2.readLine() != null) {
                linesCount2++;
            }

            if(linesCount1 == linesCount2){
                System.out.println("Commands for apps execution files found...");
                ReadCommAppsPath();
                ReadCommNamesByApps();
            }
            else{
                System.out.println("Commands for apps execution files pair don't match, creating files...");
                CreateCommAppsPath();
                CreateCommNamesByApps();
            }
        }
        else{
            System.out.println("Commands for apps execution files pair not found, creating files...");
            CreateCommAppsPath();
            CreateCommNamesByApps();
        }
    }

    public static void CreateCommNamesByKeyPress() {
        String[] commNames = new String[]{"whome", "taskmgr"};
        File file = new File("CommNamesByKeyPress.txt");
        commNamesByKeyPress = new String[commNames.length];
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; commNames.length > i; i++){
                System.out.println(commNames[i]);
                pw.println(commNames[i]);
                commNamesByKeyPress[i] = commNames[i];
            }
            pw.close();
            System.out.println("CommNamesByKeyPress file generated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadCommNamesByKeyPress(){
        String line;
        String[] commNames;
        int linesCount = 0;

        try {
            FileReader fr = new FileReader("CommNamesByKeyPress.txt");
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount++;
            }

            commNames = new String[linesCount];
            System.out.println(commNames.length);
            commNamesByKeyPress = new String[linesCount];

            fr = new FileReader("CommNamesByKeyPress.txt");
            br = new BufferedReader(fr);

            for(int i = 0; (line = br.readLine()) != null; i++) {
                commNames[i] = line;
                System.out.println(line);
                commNamesByKeyPress[i] = line;
            }

            fr.close();
            br.close();

            System.out.println("File closed.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void CreateCommKeyPress(){
        String[] commKeys = new String[]{"windows", "ctrl+shift+esc"};
        File file = new File("CommKeyPress.txt");
        commKeyPress = new String[commKeys.length];
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; commKeys.length > i; i++){
                System.out.println(commKeys[i]);
                pw.println(commKeys[i]);
                commKeyPress[i] = commKeys[i];
            }
            pw.close();
            System.out.println("CommKeyPress file generated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadCommKeyPress(){
        String line;
        String[] commKeys;
        int linesCount = 0;

        try {
            FileReader fr = new FileReader("CommKeyPress.txt");
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount++;
            }

            commKeys = new String[linesCount];
            System.out.println(commKeys.length);
            commKeyPress = new String[linesCount];

            fr = new FileReader("CommKeyPress.txt");
            br = new BufferedReader(fr);

            for(int i = 0; (line = br.readLine()) != null; i++) {
                commKeys[i] = line;
                System.out.println(line);
                commKeyPress[i] = line;
            }

            fr.close();
            br.close();

            System.out.println("File closed.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void CreateCommNamesByApps() {
        String[] commNames = new String[]{"notepad", "calculator"};
        File file = new File("CommNamesByApps.txt");
        commNamesByApps = new String[commNames.length];
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; commNames.length > i; i++){
                System.out.println(commNames[i]);
                pw.println(commNames[i]);
                commNamesByApps[i] = commNames[i];
            }
            pw.close();
            System.out.println("CommNamesByApps file generated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadCommNamesByApps(){
        String line;
        String[] commNames;
        int linesCount = 0;

        try {
            FileReader fr = new FileReader("CommNamesByApps.txt");
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount++;
            }

            commNames = new String[linesCount];
            System.out.println(commNames.length);
            commNamesByApps = new String[linesCount];

            fr = new FileReader("CommNamesByApps.txt");
            br = new BufferedReader(fr);

            for(int i = 0; (line = br.readLine()) != null; i++) {
                commNames[i] = line;
                System.out.println(line);
                commNamesByApps[i] = line;
            }

            fr.close();
            br.close();

            System.out.println("File closed.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void CreateCommAppsPath(){
        String[] commPaths = new String[]{"notepad", "calc"};
        File file = new File("CommAppsPath.txt");
        commAppsPath = new String[commPaths.length];
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; commPaths.length > i; i++){
                System.out.println(commPaths[i]);
                pw.println(commPaths[i]);
                commAppsPath[i] = commPaths[i];
            }
            pw.close();
            System.out.println("CommAppsPath file generated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadCommAppsPath(){
        String line;
        String[] commKeys;
        int linesCount = 0;

        try {
            FileReader fr = new FileReader("CommAppsPath.txt");
            BufferedReader br = new BufferedReader(fr);

            while (br.readLine() != null) {
                linesCount++;
            }

            commKeys = new String[linesCount];
            System.out.println(commKeys.length);
            commAppsPath = new String[linesCount];

            fr = new FileReader("CommAppsPath.txt");
            br = new BufferedReader(fr);

            for(int i = 0; (line = br.readLine()) != null; i++) {
                commKeys[i] = line;
                System.out.println(line);
                commAppsPath[i] = line;
            }

            fr.close();
            br.close();

            System.out.println("File closed.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void CheckPropFile(){

        File prop = new File("./commander.properties");

        if(prop.exists()){
            System.out.println("Properties file found...");
            PropRead();
        }
        else{
            System.out.println("Properties file not found, creating new one...");
            PropCreate();
        }
    }

    private static void PropRead(){
        Properties prop = new Properties();
        String path = "./commander.properties";

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            if(br.readLine() == null){
                System.out.println("Properties file empty, creating new file...");
                PropCreate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream file;
        try {
            file = new FileInputStream(path);
            prop.load(file);
            file.close();
            if(prop.getProperty("CommInit") == null){
                System.out.println("Properties file corrupted, file deleted.\n\nInitializing new properties file...\n(Expected coming errors)\n");
                File fdelete = new File(path);
                fdelete.delete();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            file = new FileInputStream(path);
            prop.load(file);
            file.close();
            commInit = prop.getProperty("CommInit");
            System.out.println("commInit Symbol = " + commInit);
        }
        catch(IOException e){
            System.out.println("Error reading properties file\nRestoring properties...");
            e.printStackTrace();
            File fdelete = new File(path);
            fdelete.delete();
            PropCreate();
            System.out.println("Properties restored.");
        }
    }

    private static void PropCreate(){
        Properties prop = new Properties();
        OutputStream output = null;
        String filename = "commander.properties";

        try{
            output = new FileOutputStream(filename);
            prop.setProperty("CommInit", "!_");
            prop.store(output, null);
            commInit = prop.getProperty("CommInit");
            System.out.println("commInit Symbol = " + commInit);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static boolean CommandCheck(String commName) {
        if(commExit.equals(commName) || Arrays.asList(commNamesByKeyPress).contains(commName) || Arrays.asList(commNamesByApps).contains(commName))
            return true;
        else {
            System.out.println("Unrecognized command.");
            return false;
        }
    }

    public static void ExecuteCommand(String command) {
        System.out.println("ExecuteCommand method initializing...");
        if(command.equals(commExit)){
            System.out.println("Call to exit program...");
            Platform.exit();
        }

        if(Arrays.asList(commNamesByKeyPress).contains(command)){
            System.out.println("Command found");
            int index = Arrays.asList(commNamesByKeyPress).indexOf(command);
            String[] KeyPresses;
            KeyPresses = commKeyPress[index].split("\\+");
            for(int i = 0; KeyPresses.length > i; i++){
                System.out.println(KeyPresses[i]);
                CommanderRobot.RobotKeyPresses(KeyPresses[i]);
            }
            for(int i = 0; KeyPresses.length > i; i++){
                CommanderRobot.RobotKeyReleases(KeyPresses[i]);
            }
        }
        if(Arrays.asList(commNamesByApps).contains(command)){
            CommanderRobot.RobotExecApp(command);
        }
    }
}