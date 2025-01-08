
import java.util.*;

public class hashmap{
    public static void main(String[] args) 
    {
        Map<String,Integer> runs=new HashMap<>();
        runs.put("dhoni",183);
        runs.put("dhawan",183);
        runs.put("kholi",200);
        runs.put("rohit",264);
        System.out.println("After putting mp1: "+runs);
        Map<String,Integer> wickets=new HashMap<>();
        wickets.put("hardik",5);
        wickets.put("bumrah",3);
        wickets.put("shami",2);
        runs.put("hardik",74);
        System.out.println("After putting mp2: "+wickets);
        runs.putAll(wickets); 
        System.out.println("After merging: "+runs); 
        wickets.putIfAbsent("jadeja",1);
        wickets.putIfAbsent("shami",6);
        System.out.println("After putifabsent fn, mp2: "+runs);
        System.out.println("After putifabsent fn, mp2: "+wickets);
        runs.putAll(wickets); 
        System.out.println("After merging: "+runs); 
        System.out.println("After getting key value: "+runs.get("dhoni"));
        System.out.println("After getting key value: "+runs.get("gayle"));
        System.out.println("After getting default key value(returns player runs): "+runs.getOrDefault("dhoni",264));
        System.out.println("After getting default key value(returns default value): "+runs.getOrDefault("gayle",264));
        System.out.println("After checking contains key : "+runs.containsKey("dhawan"));
        System.out.println("After checking contains value : "+runs.containsValue(28));
        runs.replace("dhawan",300);
        System.out.println("After replacing key with new value: "+runs.get("dhawan"));
        runs.replace("dhawan",300,400);
        System.out.println("After replacing key of old value with new value: "+runs.get("dhawan"));
        runs.remove("bumrah");
        System.out.println("print players: "+runs);
        runs.remove("dhawan",400);
        System.out.println("print players: "+runs);
        Set<String> players = runs.keySet();//set for getting  key 
        System.out.println("Players: " + players);
        Collection<Integer> scores = runs.values();//set for getting value
        System.out.println("Scores: " + scores);
        System.out.println("============set============");
        Set<Map.Entry<String,Integer>> entries = runs.entrySet();//set for getting both key and value
        System.out.println(entries);
        for(Map.Entry<String,Integer> entry : entries){//new name
            System.out.println(entry.getKey()+" : "+entry.getValue() );
        }
        System.out.println("============list============");
        List<Map.Entry<String,Integer>> l1=new ArrayList<>(entries);
        System.out.println(l1);
          for(Map.Entry<String,Integer>l:l1)
          {
            System.out.println(l.getKey() +":"+l.getValue());
          }
        

}
   }
