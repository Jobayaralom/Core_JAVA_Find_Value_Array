package Exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Find_a_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int [] myArray = new int[10];
        myArray[0]= 10;
        myArray[1]= 20;
        myArray[2]= 30;
        myArray[3]= 40;
        myArray[4]= 50;
        myArray[5]= 60;
        myArray[6]= 70;
        myArray[7]= 80;
        myArray[8]= 90;
        myArray[9]= 100;
        
        System.out.println(Arrays.toString(myArray));
        
      
        boolean isPresent=false;
      
      
        int index = 0 ;
        
    System.out.println("Enter your Integer Number for Search..");
    Scanner input = new Scanner(System.in);
    int User = input.nextInt();
    input.close();
    
    for (int i = 0; i < myArray.length; i++){
         if (myArray[i] == User){
         isPresent = true;
         index = i;
         }
     }
     
     if (isPresent == true){
         System.out.println("Your Element " +User+" is Present and index is "+index);
     }
     else{
         System.out.println("Sorry, Your Element is Not Present");
     }

		
		
		
	}

}
