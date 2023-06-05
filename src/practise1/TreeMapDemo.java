package practise1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(5, "Adiba");
		map.put(3,"Khalid");
		map.put(4, "Wajid");
		map.put(1,"Hameed");
		map.put(6,"Shahid");
		map.put(2,"Noor Jahan");
		
		System.out.println(map);
		
		System.out.println("********************************");
		
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>(Comparator.reverseOrder());
		
		map1.put(5, "Adiba");
		map1.put(3,"Khalid");
		map1.put(4, "Wajid");
		map1.put(1,"Hameed");
		map1.put(6,"Shahid");
		map1.put(2,"Noor Jahan");
		
		System.out.println(map1);
		
		System.out.println("*******************************");
		
		
		TreeMap<String, String> countryISOCodeMapping = new TreeMap<>();

        countryISOCodeMapping.put("India", "IN");
        countryISOCodeMapping.put("United States of America", "US");
        countryISOCodeMapping.put("China", "CN");
        countryISOCodeMapping.put("United Kingdom", "UK");
        countryISOCodeMapping.put("Russia", "RU");
        countryISOCodeMapping.put("Japan", "JP");

        System.out.println("CountryISOCodeMapping : " + countryISOCodeMapping);

        // Remove the mapping for a given key
        String countryName = "Japan";
        String isoCode = countryISOCodeMapping.remove(countryName);
        if(isoCode != null) {
            System.out.println("Removed (" + countryName + " => " + isoCode + ") from the TreeMap. New TreeMap " + countryISOCodeMapping);
        } else {
            System.out.println(countryName + " does not exist, or it is mapped to a null value");
        }

        // Remove the mapping for the given key only if it is mapped to the given value
        countryName = "India";
        boolean isRemoved = countryISOCodeMapping.remove(countryName, "IA");
        System.out.println("Was the mapping removed for " + countryName + "? : " + isRemoved);

        // Remove the first entry from the TreeMap
        Map.Entry<String, String> firstEntry = countryISOCodeMapping.pollFirstEntry();
        System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + countryISOCodeMapping);

        // Remove the last entry from the TreeMap
        Map.Entry<String, String> lastEntry = countryISOCodeMapping.pollLastEntry();
        System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + countryISOCodeMapping);
		
        
		
		
	}

}
