package cliUtils;

import rollingUtils.Rolling;

import java.util.ArrayList;

public class FlagCli {


    /**
     * runs the code for the -d ARG flag for the flag based cli <br>
     * the -d ARG flag returns a string with the values of a given (ARG) amount of D6 dice
     * @param arg the number argument for the -d ARG
     * @return a string representing the dice values
     */
    public static String dFlag(String arg){
            try {
                String returnable;
                int numberOfDice = Integer.parseInt(arg);
                ArrayList<Integer> myDice = Rolling.getDice(numberOfDice);
                returnable = "[";
                for (int i = 0; i < myDice.size() - 1 ; i++) {
                    returnable += myDice.get(i) + ", ";
                }
                returnable += myDice.get(myDice.size() - 1) + "]";
                return returnable;


            } catch (java.lang.Exception e) {
                return "Invalid Input";
            }

    }


    /**
     * starts the flag base cli with the given flags
     * @param args the arguments/flags/options given to the cli
     * @return true if args.length > 0, false if args.length == 0
     */
    public static boolean runFlagCli(String[] args){

        if(args.length == 0){
            return false;
        }

        if(args[0].equals("-d")){
            if(args.length == 2){
                System.out.println(dFlag(args[1]));
            } else{
                System.out.println("Invalid Length, please use the -h flag for details");
            }
        }

        else if (args[0].equals("-h")){
            System.out.println("Availiable Flags\n-h :: print this help message\n-d <ARG> :: rols ARG amount of dice");
        }

        else {
            System.out.println("ERROR: Invalid Argument, please use the -h flag to get the help message");
        }

        return true;
    }


}
