package cliUtils;

public class OSCalls {


    private static boolean osc(String call){

        try{
            //I will forget how I did this, so if i need to remember, look at the ProcessBuilder Javadoc
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            return true;
        } catch (Exception e){
            return false;
        }
    }


    public static boolean clear(){
        try{
            osc("clear");
            return true;
        } catch(Exception e){
            System.out.println(e);
            return false;
        }

    }


}
