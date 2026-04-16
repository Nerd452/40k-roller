package cliUtils;

import rollingUtils.Rolling;

import java.util.ArrayList;

public class FlagCli {


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
