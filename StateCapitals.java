import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;


public class StateCapitals {
    public static void main(String[] args)
    {

        //States & their cpaitals you want the program to print out (pick 10 for now)
        // New York, Albany
        // "California", "Sacramento"
        // "Florida", "Tallahasse"
        // "Georgia", "Atlanta"
        // "Massachusetts", "Boston"
        // "North Carolina", "Raleigh"

        HashMap<String, String> stateCaps = new HashMap<>();

        stateCaps.put("New York", "Albany");
        stateCaps.put("California", "Sacramento");
        stateCaps.put("Florida", "Tallahasse");
        stateCaps.put("Georgia", "Atlanta");
        stateCaps.put("Massachusetts", "Boston");
        stateCaps.put("North Carolina", "Raleigh");


        //print states
        System.out.println("STATES:");
        System.out.println("---------------------");
        Map<String, String> map = new TreeMap<>(stateCapitals);
        Set keys = map.entrySet();
        Iterator iterator = keys.iterator();
        while(iterator.hasNext()) {
            Map.Entry state = (Map.Entry)iterator.next();
            System.out.println(state.getKey());
        }
        
        //print capitals
        System.out.println();
        System.out.println("CAPITALS:");
        System.out.println("---------------------");
        Iterator iterator1 = keys.iterator();
        while(iterator1.hasNext()) {
            Map.Entry value = (Map.Entry)iterator1.next();
            System.out.println(value.getValue());
        }

         //print both state/capital names
         System.out.println();
         System.out.println("STATES & THEIR CAPITAL NAMES");
         System.out.println("---------------------");
         Iterator iterator2 = keys.iterator();

         while(iterator2.hasNext()) {
             Map.Entry keyValue = (Map.Entry)iterator2.next();
             System.out.print(keyValue.getKey() + " - ");
             System.out.println(keyValue.getValue());
         }
    }
    
}
