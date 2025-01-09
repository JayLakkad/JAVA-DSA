package Hashing;

import java.util.*;

public class FIndItineraryFromTickets {
    public static String getStart(HashMap<String,String>tickets){
        HashMap<String,String>revMap = new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String>tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String st = getStart(tickets);
        System.out.print(st);
        while (tickets.containsKey(st)) {
            System.out.print(" -> " + tickets.get(st));
            st = tickets.get(st);
        }
        System.out.println();

    }
}
