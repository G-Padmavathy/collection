package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> h=new TreeMap<String,String>();
		h.put("A", "Apple,Aeroplane,Ant");
		h.put("B", "Ball ,Banana,Bowl");
		h.put("C", "Cat,Cow,Camel");
		
		System.out.println(h);
		
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a key (A, B, C): ");
//        String keyToRetrieve = scanner.nextLine();
//
//        if (h.containsKey(keyToRetrieve)) {
//            String wordsString = h.get(keyToRetrieve);
//            String[] wordsArray = wordsString.split(",");
//
//            System.out.println(keyToRetrieve + ":");
//            for (String word : wordsArray) {
//                System.out.println(word);
//            }
//        } else {
//            System.out.println("Key not found: " + keyToRetrieve);
//        }
		

	
				Scanner sc=new Scanner(System.in);
				//char alphabet=sc.next().charAt(0);
				HashMap<Character,List<String>>map=new HashMap<Character,List<String>>();
				ArrayList<String> list1=new ArrayList<String>();
				list1.add("Apple");
				list1.add("ant");
				list1.add("aeroplane");
				ArrayList<String> list2=new ArrayList<String>();
				list2.add("Banana");
				list2.add("Balloon");
				list2.add("Bag");
				ArrayList<String> list3=new ArrayList<String>();
				list3.add("Car");
				list3.add("Cap");
				list3.add("cow");
				map.put('A', list1);
				map.put('B', list2);
				map.put('C', list3);
				for(Map.Entry<Character, List<String>> m:map.entrySet())
				{
					System.out.println(m.getKey());
					System.out.println(m.getValue());
				}
				
			



	}

}
