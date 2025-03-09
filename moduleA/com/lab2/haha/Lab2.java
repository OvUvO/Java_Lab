package com.lab2.haha;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {	
				Scanner inputC = new Scanner(System.in);
				Lab2 obj = new Lab2();
				System.out.println("Welcome to Lab 2 Exercise!!!");
				
				System.out.println("Please choose the question number (1-11), exit enter (q):");
				String ans = inputC.nextLine();
					
				if (ans.equals("q")) {
					System.exit(0);
				}
					
				int queN = Integer.parseInt(ans);
					
				String methodName = "que" + queN;
				Method method = Lab2.class.getMethod(methodName);
				method.invoke(obj);
				
				inputC.close();
				System.exit(0);
				}
				
			catch (Exception e) {
					System.out.println("Error: "+e);
			}		
	}	
	
	public void que1() {
		Scanner inputC = new Scanner(System.in);
		
		try {
		System.out.println("Please key in the Fahrenheit degree:");
		int fahrenheitD = inputC.nextInt();
		
		int celsius = (fahrenheitD-32)*5/9;
		System.out.println("Celcius: "+celsius);
		
		inputC.close();
		}
		
		catch (Exception e) {
			System.out.println("Error :" + e);
		}
	}
	
	public void que2() {
		Scanner inputC = new Scanner(System.in);
		try {
		System.out.println("Please key in the radius:");
		int r = inputC.nextInt();
		
		System.out.println("Please key in the length:");
		int d = inputC.nextInt();
		
		double area = (r*r)*Math.PI;
		double volume = area*d;
		
		System.out.println("Area :"+ area);
		System.out.println("Volume :"+ volume);
		
		inputC.close();
		}
		
		catch(Exception e) {
			System.out.println("Error :" + e);
		}
		
	}
	
	public void que3() {
		Scanner inputC = new Scanner(System.in);
		
		try {
		System.out.println("Please enter an integer between 0 and 1000: ");
		int num = inputC.nextInt();
		
		if ( num>=1 && num<=1000 ) {
			 int total = 0;
			 int temp = num;
			 
			 while (temp>0) {
				 total += temp % 10;
				 temp /= 10;
			 }
			 
			 System.out.println("The total of the digits is: " + total);
		} else {
			System.out.println("Very good you dk how to read english");
		}
		
		inputC.close();
		
		}
		
		catch (Exception e){
			System.out.println("Wrong input bro");
		}
	}
	
	public void que4() {
		  Scanner inputC = new Scanner(System.in);
		  
		  try {
		  System.out.print("Enter a uppercase letter: ");
		  char upperL =inputC.next().charAt(0);
		  
		  if (Character.isUpperCase(upperL)) {
			  char lowercase = Character.toLowerCase(upperL);
			  System.out.println("Lowercase letter: "+lowercase);
		  } else {
			  System.out.println("Spm english failed");
		  }
		  
		  inputC.close();
		  }
		  
		  catch (Exception e) {
			  System.out.println("Error: "+e);
		  }
	}

	public void que5() {
		//Receive 
		 Scanner inputC = new Scanner(System.in);
		 
		 try {
		 System.out.print("Enter an ASCII code (0-128): ");
	        int asciiCode = inputC.nextInt();

	        if (asciiCode >= 0 && asciiCode <= 128) {
	            char character = (char) asciiCode;  
	            System.out.println("The corresponding character is: " + character);
	        } else {
	            System.out.println("Invalid input! Please enter a number between 0 and 128.");
	        }

		 inputC.close();
		 }
		 
		 catch (Exception e) {
			 System.out.println("Error :"+e);
		 }
		 
	}
	
	public void que6() {
		Scanner inputC = new Scanner(System.in);
		
		ArrayList<Integer> list31 = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12)); 
		
		try {
			System.out.print("Enter the year(1000-2500):");
			int year = inputC.nextInt();
			System.out.print("Enter the month(1-12):");
			int month = inputC.nextInt();
			
			if ((year >= 1000 && year <= 2500) && (month >=1 && month <=12)) {
				for (Integer item : list31) {
				           if (item == month) {
				               System.out.println("This month has 31 days");
				               break;
				               
				           } else if (year%4==0 && month ==2){
				        	   System.out.println("This month has 29 days");
				        	   break;
				        	   
				           } else if (year%4!=0 && month ==2) {
				        	   System.out.println("This month has 28 days");
				        	   break;
				        	   
				           } else {
				               System.out.println("This month has 30 days");
				               break;
				           }
					}
					
				} else {
					System.out.println("Do you know how to read english");
				}
			
			inputC.close();
		}
		
		catch (Exception e) {
			System.out.println("Error :"+e);
		}
	}
	
	public void que7() {
		Scanner inputC = new Scanner(System.in);
		
		try {
			System.out.println("Enter your assignment marks: ");
	        int marks = inputC.nextInt();

	        LinkedHashMap<String, Integer> content = new LinkedHashMap<>();
	        content.put("F", 40);
	        content.put("F+", 49);
	        content.put("D", 54);
	        content.put("C", 64);
	        content.put("B", 69);
	        content.put("B+", 74);
	        content.put("A", 79);
	        content.put("A+", 100);

	        int lowerBound = 0;

	        for (Map.Entry<String, Integer> entry : content.entrySet()) {
	            String grade = entry.getKey();
	            int upperBound = entry.getValue();

	            if (marks > lowerBound && marks <= upperBound) {
	                System.out.println("Your grade is: " + grade);

	                switch (grade) {
	                    case "F" -> System.out.println("Description: Fail");
	                    case "F+" -> System.out.println("Description: Marginal Fail");
	                    case "D", "C" -> System.out.println("Description: Pass");
	                    case "B", "B+" -> System.out.println("Description: Credit");
	                    default -> System.out.println("Description: Distinction");
	                }
	                break; 
	            }

	            lowerBound = upperBound; 
	        }

	        inputC.close();
		}
		
		catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void que8() {
		double[] numbers = new double[100];
		numbers[0]=1.23;
		numbers[1]=1.22;
		numbers[2]=1.21;
		
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        System.out.printf("Total sum of array: %.2f\n", sum);
	}
	
	public void que9() {
		int t_fee = 10000;
		
		for (int i =0; i <10; i++) {
			t_fee = (int) (t_fee*1.05);
		}
		
		System.out.println("Ten years tuition fees: "+t_fee);
	}
	
	public void que10() {
		Scanner inputC = new Scanner(System.in);
        String userC;

        do {
            System.out.println("Loading");
            
            System.out.print("Do you want to continue? (Yes/No): ");
            userC = inputC.nextLine().trim(); 

        } while (userC.equals("Yes")); 

        System.out.println("Program terminated.");
        inputC.close(); 
	}
	
	public void que11() {
		Scanner inputC = new Scanner(System.in);
		
		try {
			int futureIV;
			
			System.out.println("Investment Amount: ");
			int invAmount = inputC.nextInt();
			
			System.out.println("Annual Interest Rate: ");
			int annualrate= inputC.nextInt();
			
			System.out.println("Number Of Years: ");
			int duration = inputC.nextInt();
			
			futureIV = (int) Math.pow((invAmount*(1+annualrate/100)), duration);
			
			System.out.println("Future Investment Value: "+ futureIV);
			
			inputC.close();
		}
		
		catch (Exception e) {
			System.out.println("Error: "+e);
			
		}
	}
}
