package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank 
{

	 public static void main(String[] args) 
	 {
	     
	        Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt();
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        

	        for (int i = 0; i < n; i++) 
	        {
	            list.add(scanner.nextInt());
	        }

	        int q = scanner.nextInt();
	        
	        for (int i = 0; i < q; i++) 
	        {
	            String operation = scanner.next();
	            if (operation.equals("Insert")) 
	            {
	                int index = scanner.nextInt();
	                int value = scanner.nextInt();
	                if (index >= 0 && index <= list.size()) 
	                {
	                    list.add(index, value);
	                }
	            } 
	            else if (operation.equals("Delete")) 
	            {
	                int index = scanner.nextInt();
	                if (index >= 0 && index < list.size())
	                {
	                    list.remove(index);
	                }
	            }
	        }

	        for (Integer values : list) 
	        {
	            System.out.print(values + " ");
	        }
	    }
	}

