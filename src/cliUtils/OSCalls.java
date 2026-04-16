package cliUtils;

public class OSCalls {

    /**
     * runs a call to the operating system in bash, verified to work for linux, prints error message if failure
     * @param call - the command being thrown at the OS
     * @return - returns true if successful, false if not
     */
    private static boolean osc(String call){
        try{
            //I will forget how I did this, so if i need to remember, look at the ProcessBuilder Javadoc
            new ProcessBuilder(call).inheritIO().start().waitFor();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    /**
     * sends the clear bashscript command to the terminal
     * @return true if success, false if failure
     */
    public static boolean clear(){
        return osc("clear");
    }


}
