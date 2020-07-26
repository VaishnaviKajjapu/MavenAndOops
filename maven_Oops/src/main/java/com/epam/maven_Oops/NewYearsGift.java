package com.epam.maven_Oops;



import java.util.Scanner;
import java.util.*;

public class NewYearsGift {

	public static void main(String[] args) {
		Sweets collect;
		int quantity = 0;
		int total_candies = 0;
        int y;
        Boolean next = true;
        float cost;
        float weight = 0;
        float totalbox_wt = 0;
        float total_weight = 0;
        Scanner sc=new Scanner(System.in);
        Map< String, Float> hm =  new HashMap< String, Float>();
        while(next) {
        	System.out.println("AVAILABLE Candies ans Sweets are:");
        	System.out.println("1. Mango Candy");
        	System.out.println("2. Orange Candy");
        	System.out.println("3. Gulab Jamun");
        	System.out.println("4. Jilebi");
        	System.out.println("Choose an option 1-4");
        		int choice = sc.nextInt();
        		if(choice == 1){
        			System.out.println("enter the quantity of Mango Candy");
        			quantity = sc.nextInt();
        			System.out.println(" enter the weight in grams of Mango Candy");
        			weight = sc.nextInt();
        			System.out.println("Enter price of Mango Candy");
        			cost = sc.nextInt();
        			collect = new MangoCandy(quantity, weight, cost);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			System.out.println("The total weight of MangoCandy is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			total_candies += quantity;
        			hm.put("Mango Candy", cost);
        			System.out.println("Do you want any other item (1- yes/0 - no)");
        			y =  sc.nextInt();
        			if(y == 1) { 
        	    	  next = true;
        	        }
        			else
        		    	{
        				next = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        		    	}
        		}
        		else if(choice == 2){
        			System.out.println("enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println(" enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Enter price");
        			cost = sc.nextInt();
        			collect = new OrangeCandy(quantity, weight, cost);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies += quantity;
        			hm.put("Orange Candy", cost);
        			System.out.println("The total weight of Orange Candy is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("Do you want any other item (1- yes/0 - no)");
        			y =  sc.nextInt();
        			if(y == 1) { 
        	    	  next = true;
        	        }
        			else {
        				next = false;
        				System.out.println("The total gift box weight is:" +totalbox_wt+ "grams");
        				System.out.println("The total number of candies in the giftbox is:" +total_candies);
        				break;
        	        }
        		}else if(choice == 3){
        			System.out.println("Please enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("Please enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Please enter the price");
        			cost = sc.nextInt();
        			collect = new GulabJamun(quantity, weight, cost);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies += quantity;
        			hm.put("Gulab Jamun", cost);

        			System.out.println("total weight of gulab jamun is:" +total_weight+ "grams");
        			System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("do you want any other item (1- yes/0 - no)");
        			y =  sc.nextInt();
        			if(y == 1) { 
        	    	  next = true;
        	        }
        			else {
        				next = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        			}
        		}else if(choice == 4){
        			System.out.println("enter the quantity");
        			quantity = sc.nextInt();
        			System.out.println("enter the weight in grams");
        			weight = sc.nextInt();
        			System.out.println("Enter price");
        			cost = sc.nextInt();
        			collect = new Jilebi(quantity, weight, cost);
        			total_weight = collect.calculateWeight(weight, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			total_candies = total_candies + quantity;
        			hm.put("Jilebi", cost);

        			System.out.println("The total weight of Jilebi is:" +total_weight+ "grams");
        			System.out.println("The total weight of gift box is:" +totalbox_wt+ "grams");
        			System.out.println("Do you want any other item (1- yes/0 - no)");
        			y =  sc.nextInt();
        			if(y == 1) { 
        	    	  next = true;
        	        }else { 
        				next = false;
        				System.out.println("Total weight of gift box is:" +totalbox_wt+ "grams");
        				System.out.println("Total number of candies in the giftbox is:" +total_candies);
        				break;
        			}
        		}else{
        			System.out.println("select from 1-4 options");
        		}
        	   
        }
        
        System.out.println("Your gift box contains : ");
        Set< Map.Entry< String, Float> > st = hm.entrySet(); 
        for (Map.Entry< String, Float> me: st) 
        { 
            System.out.print("Name of Chocolate : " +me.getKey()+"\n "); 
            System.out.println(" Cost of Chocolate : " +me.getValue()+"\n "); 
        }
        sc.close();
 
	}
	

}
