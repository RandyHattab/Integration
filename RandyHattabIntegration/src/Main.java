import java.util.Scanner;

// This is a header
// This is
// Randy Hattab
public class Main {

  //public static void main(String[] args) is the Main's method header
  //The top line of a method is called a header
	public static void main(String[] args) {
	  
	  // User's menu Selection
	  int theFirstMenuSelection, theSecondMenuSelection;
	  
	  //Variables
	  //firstNum and secondNum are parameters
	  int firstNum, secondNum;
	  
	  // Scanner object for keyboard input
	  Scanner scan = new Scanner(System.in); 
		
	  // Displays the menu
	  System.out.println("Which is your favorite social network?");
		System.out.println("1. Facebook");
		System.out.println("2. Instagram");
		System.out.println("3. Snapchat");
		System.out.println("4. Twitter");
		System.out.println();
		 
		// Prompt the user for a selection
		System.out.println("Enter your selection: ");
		theFirstMenuSelection = scan.nextInt();
		
		// Validate the menu selection
		while (theFirstMenuSelection < 1 || theFirstMenuSelection > 4) {
		  System.out.println("That is not a valid selecyion. Please try again.");
		  System.out.println("Enter 1, 2, 3, or 4: ");
		  theFirstMenuSelection = scan.nextInt();
		}
		
		// Perform the selected operation
		switch (theFirstMenuSelection) {
		  case 1:
		    System.out.println("Would you like to know more about Facebook?");
		    System.out.println("Hit 1 to learn more or 2 to end the program");
		    //Provide the user with options
		    System.out.println("1. Yes");
		    System.out.println("2. No");
		    System.out.println();
		    // Prompt the user for a selection
		    System.out.println("Enter your selection: ");
		    theFirstMenuSelection = scan.nextInt();
		    System.out.println();
		    
		    // Validate the menu selection
		    while (theFirstMenuSelection < 1 || theFirstMenuSelection > 2) {
          System.out.println("That is not a valid selecyion. Please try again.");
          System.out.println("Enter 1 or 2: ");
          theFirstMenuSelection = scan.nextInt();
        }
		    
		    //Give the user more info or end the program
		    if (theFirstMenuSelection == 1) {
          System.out.println("Here are some fun facts");
          System.out.println("The CEO is Mark Zuckerberg");
          System.out.println("The day this project is due 2/4/17 is Facebook's 13'th birthday");
          System.out.println("Mark's net worth is an astonishing 54.9 Billion");
          System.out.println("Facebook has over 1.5 Billion users");
          System.out.println("Biggest social network in the world");
          System.out.println("As of 2/4/17 Facebook's market cap is a little over 370 Billion");
          System.out.println();
        } else {
          System.out.println("Congratulations you have reached the end of this program!");
          System.out.println();
        }
		    
		    break;
		  case 2:
        System.out.println("Would you like to know more about Instagram?");
        //Provide the user with options
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        // Prompt the user for a selection
        System.out.println("Enter your selection: ");
        theFirstMenuSelection = scan.nextInt();
        
        // Validate the menu selection
        while (theFirstMenuSelection < 1 || theFirstMenuSelection > 2) {
          System.out.println("That is not a valid selecyion. Please try again.");
          System.out.println("Enter 1 or 2: ");
          theFirstMenuSelection = scan.nextInt();
        }
        
      //Give the user more info or end the program
        if (theFirstMenuSelection == 1) {
          System.out.println("Here are some fun facts");
          System.out.println("The CEO is Kevin Systrom");
          System.out.println("Instagram was founded in October of 2010");
          System.out.println("Kevin's net worth is an astonishing 1.1 Billion");
          System.out.println("Instagram has over 400 Million users");
          System.out.println("Instagram is owned by Facebook");
          System.out.println();
        } else {
          System.out.println("Congratulations you have reached the end of this program!");
          System.out.println();
        }
        
        break;
		  case 3:
        System.out.println("Would you like to know more about Snaphat?");
        //Provide the user with options
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        // Prompt the user for a selection
        System.out.println("Enter your selection: ");
        theFirstMenuSelection = scan.nextInt();
        
        // Validate the menu selection
        while (theFirstMenuSelection < 1 || theFirstMenuSelection > 2) {
          System.out.println("That is not a valid selecyion. Please try again.");
          System.out.println("Enter 1 or 2: ");
          theFirstMenuSelection = scan.nextInt();
        }
        
      //Give the user more info or end the program
        if (theFirstMenuSelection == 1) {
          System.out.println("Here are some fun facts");
          System.out.println("The CEO is Evan Spiegel");
          System.out.println("Instagram was founded on October 29, 2012");
          System.out.println("Evan's net worth is an astonishing 2.1 Billion");
          System.out.println("Snapchat has over 160 Million daily users");
          System.out.println("Snapchat's IPO is the biggest since Facebook");
          System.out.println("Snapchat is worth around 10 Billion");
          System.out.println();
        } else {
          System.out.println("Congratulations you have reached the end of this program!");
          System.out.println();
        }
        
        break;
		  case 4:
        System.out.println("Would you like to know more about Twitter?");
        //Provide the user with options
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        // Prompt the user for a selection
        System.out.println("Enter your selection: ");
        theFirstMenuSelection = scan.nextInt();
        
        // Validate the menu selection
        while (theFirstMenuSelection < 1 || theFirstMenuSelection > 2) {
          System.out.println("That is not a valid selecyion. Please try again.");
          System.out.println("Enter 1 or 2: ");
          theFirstMenuSelection = scan.nextInt();
        }
        
      //Give the user more info or end the program
        if (theFirstMenuSelection == 1) {
          System.out.println("Here are some fun facts");
          System.out.println("The CEO is Jack Dorsey");
          System.out.println("Twitter's birthday is March 21st");
          System.out.println("Jack's net worth is an astonishing 1.28 Billion");
          System.out.println("Twitter has over 317 Million monthly users");
          System.out.println("Twitter's market cap is a little over 12.98 Billion");
          System.out.println();
        } else {
          System.out.println("Congratulations you have reached the end of this program!");
          System.out.println();
        }
        
        break;
		}
		
		
		// Displays the menu
    System.out.println("Which calculation would you like?");
    System.out.println("1. Multiplication");
    System.out.println("2. Division");
    System.out.println("3. Addition");
    System.out.println("4. Subtraction");
    System.out.println();
    
    // Prompt the user for a selection
    System.out.println("Enter your selection: ");
    theSecondMenuSelection = scan.nextInt();
    System.out.println();
    
		System.out.println("Type an integer for a calulation.");
		
		// Prompt the user for a Integer
    System.out.println("Enter your Interger: ");
    firstNum = scan.nextInt();
    
    // Prompt the user for another Integer
    System.out.println("Enter another Interger: ");
    secondNum = scan.nextInt(); 
    
    // Perform the selected operation
    switch (theSecondMenuSelection) {
      case 1:
        System.out.println("You have selected Multiplication");
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum*secondNum));
        System.out.println();
        break;
      case 2:
        System.out.println("You have selected Division");
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
        System.out.println();
        break;
      case 3:
        System.out.println("You have selected Addition");
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum+secondNum));
        System.out.println();
        break;
      case 4:
        System.out.println("You have selected Subtraction");
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum-secondNum));
        System.out.println();
        break;
    }
		
    scan.close();
    
    //This is a while loop
    //Initialize the counter
    int TheWhileCounter = 1;
    
    //Nested while loop
    while (TheWhileCounter < 10) {
      
        while (TheWhileCounter <= 10) {
           System.out.println("Count is at " + TheWhileCounter + " of 10!");
           TheWhileCounter++;
        }
        System.out.println("That was a while loop inside a while loop! Nested Loops");
    }
    
    //The words inside of this print statement are an argument
    System.out.println();
    System.out.println("The words inside of this print statement are an argument");
    System.out.println();
    
    //This is a for loop
    //This has relational and conditional operators
    for (int forCount = 0; forCount <=5 || forCount == -1; forCount++) {
      System.out.println("This for loop is at " + forCount + " of 5!");
    }
    
    //This array gives you the sum    
    //int[] sumArray = new int[100];
    //for (int i = 0; i < sumArray.length; i++) sumArray[i] = i;
    //int sum = 0;
    //for (int m : sumArray) sum += m;
    //System.out.println();
    //System.out.println("The sum is: " + sum);
    
    
    
    //array of 20 numbers
    int numbers[] = new int[]{30,25,34,48,75,6,7,84,9,105,116,12,13,14,154,16,175,168,919,260};
   
    //assign first element of an array to largest and smallest
    int smallest = numbers[0];
    int largetst = numbers[0];
    int sum = 0;
    int index = 0;
    int min = numbers[index];
   
    for (int i=1; i< numbers.length; i++)
    {
            if(numbers[i] > largetst)
                    largetst = numbers[i];
            else if (numbers[i] < smallest)
                    smallest = numbers[i];
    }      
    for (int i=1; i< numbers.length; i++) {
            if (numbers[i] < min ){
              min = numbers[i];
              index = i;
          }
    }
    for (int sumOfNumbers : numbers){
      sum += sumOfNumbers;
    }
   
    System.out.println("Largest Number is : " + largetst);
    System.out.println("Smallest Number is : " + smallest);
    System.out.println("Smallest Index Number is : " + index);
    System.out.println("The sum is: " + sum);
    System.out.println();
    
    PersonHeight myPerson = new PersonHeight();
    myPerson.setName("Randy");
    myPerson.setHeight(5.7);
    System.out.println("Hello, my name is " + myPerson.getName() + " and my height is: " + myPerson.getHeight() + "ft.");
    
	}
}