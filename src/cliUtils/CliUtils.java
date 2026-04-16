package cliUtils;

import scannerUtils.SuperScanner;

public class CliUtils {

    static String PROMPTLINE = "40kRoller -->>";
    static SuperScanner scc = new SuperScanner();

    public static int promptInt(){

        System.out.print(PROMPTLINE);

        return scc.nextInt();
    }

    public static void enterToCont(){

        System.out.print("Please Press Enter to Continue");
        scc.nextLine();
    }

    public static void exit(int status){
        scc.close();
        System.exit(status);
    }
}
