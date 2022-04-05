import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;

/*
    -Create a HashMap to hold the bames of all the states and their corresponding capital names.
    -Load the HashMap with each state/cpaital pair using the file given

*/

public class StateCapitals2 {
    
    public static void main(String[] args){

        //Creating a HashMap to hold the names of all the states and their corresponding capital names. 
        HashMap<String, String> stateCaps = new HashMap<>();

        try {
        //Program can read StateCapitals.txt file
        File myFile = new File("StateCapitals.txt");
        Scanner scan = new Scanner(myFile);

        // You need a while loop so it can read everything in the text to convert to string
        while(scan.hasNextLine())
        {

            String data = scan.nextLine();
            //System.out.println(data); <- Not sure if printing file is needed on this line but going to leave it for now as a comment
            String[] textSplit = data.split("::");
            //State name is the key, & the capital name is the value.
            stateCaps.put(textSplit[0], textSplit[1]);

        }
        scan.close();
        } 
        catch (FileNotFoundException error) {
        System.out.println("An error occurred");
        error.printStackTrace();
        }

        //Print how many state/capital pairs are inside your map
        System.out.println(stateCaps.size() + " STATES & CAPITALS ARE LOADED");
        System.out.println("----------");
        System.out.println("Here are the states: ");

        //Print out all the state names to the screen
        Set<String> keys = stateCaps.keySet();
     

        for(String currentKey : keys)
        {
            System.out.print(currentKey + ", ");
        }
        

        

    }

    


    
}
