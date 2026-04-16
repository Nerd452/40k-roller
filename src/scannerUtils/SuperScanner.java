package scannerUtils;

//Java Library Imports
import java.util.Scanner;

/**
 *This class holds a scanner, and allows for easy management of a System.in scanner
 */
public class SuperScanner implements Closeable{

    private Scanner sc;
    
    /**
     *Constructor for the Super Scanner class
     */
    public SuperScanner(){
        sc = new Scanner(System.in);
    }

    


    //METHODS START

    /**
     * runs the following code <br>
     * int returnable sc.nextInt(); <br>
     * sc.nextLine(); <br>
     * return returnable; <br>
     * @return returns the captured integer
     */
    public int nextInt(){
        int returnable = sc.nextInt();
        sc.nextLine();
        return returnable;
    }

    /**
     * replicates the nextLine() Scanner Function
     * @return returns the caputred line
     */
    public String nextLine(){
        return sc.nextLine();
    }



    
    @Override
    public void close(){
        sc.close();
    }



}
