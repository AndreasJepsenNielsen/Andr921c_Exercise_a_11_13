import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class opgave13 {



    public static void main(String[] args) {
        Map<String,String> tm = new TreeMap();
        tm.put("Jamie", "Lannister");
        tm.put("Eddard", "Stark");
        tm.put("Joffrey", "Baratheon");
       // tm.put("Cersei", "Lannister");  // fjern forreste kommentar for at se at den afgiver false ved 2 lannisters
        isUnique(tm);
    }
    public static boolean isUnique(Map<String,String> a)
    {
        HashSet<String> hash = new HashSet<>(); // laver et nyt hashset og tilføjer værdierne fra mappen til hashsettet

        for(String key : a.keySet()){
            String name = a.get(key);

            if(hash.contains(name)) // hvis vores nye hastset container navnet i forvejen returnerer den false.
            {
                System.out.println("false");
                return false;
            }

            hash.add(name); // tilføjer navnet til hashsettet
        }
        System.out.println(hash);
        System.out.println("True");
        return true;
    }
}
