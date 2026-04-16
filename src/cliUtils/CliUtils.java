package cliUtils;

import scannerUtils.SuperScanner;

public class CliUtils {

    public static String PROMPTLINE = "40kRoller -->>";
    private static SuperScanner scc = new SuperScanner();

    /**
     * prompts the user for an integer after printing the promptline
     * @return returns the captured integer
     */
    public static int promptInt(){

        System.out.print(PROMPTLINE);

        return scc.nextInt();
    }

    /**
     * Stalls the program untill the enter button is pressed
     */
    public static void enterToCont(){

        System.out.print("Please Press Enter to Continue");
        scc.nextLine();
    }

    /**
     * Exits the program with a given exit status
     * @param status the exit status of the program
     */
    public static void exit(int status){
        scc.close();
        System.exit(status);
    }
}
