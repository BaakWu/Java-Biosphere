import java.util.Scanner;


public class UserInterface {
    private int selectBio = 1;
	private Scanner UseInp = new Scanner(System.in); //scanner variable needed for user input
	private int UserIn =0; //user input in int form
	
    public int SelectBio() //prompts user to select biosphere type
    {

    	
    	System.out.println("Pick the starting Biosphere");
    	System.out.println( "\t 1: All empty");
    	System.out.println( "\t 2: One critter");
    	System.out.println( "\t 3: Single birth");
    	System.out.println( "\t 4: Simple Pattern in middle");
    	System.out.println( "\t 5: Pattern near edges");
    	System.out.println( "\t 6: Fertile critter");
    	System.out.println( "\t 7: Complex Pattern 1: no fertile Critters");
    	System.out.println( "\t 8: Complex Pattern 2: Fertile critter");
    	
		System.out.print("Enter your selection: ");
		
		try{
		UserIn = UseInp.nextInt(); // takes user input
		   UseInp.nextLine();  // Consume newline left-over
		}
		catch(Exception e){
			 System.out.printf("This is not an integer%n "); //error checks and resets the prompt for another user input
			 UseInp.next();
			 this.SelectBio();

		}
		if(UserIn>(8) || UserIn<1)
		  {
			  System.out.println("The number entered is not in the range of selections, try again please");
			 this.SelectBio(); //error checks and tells the user what is wrong, and reasks the input
		  }
		  else{
			  selectBio=UserIn;
		  }
		
    	return selectBio;
    }

   public String nextGen() //moves onto the next generation of the simulation
   {
	   String Input = " ";

	   System.out.print("Hit enter to run another generation: ");
		
		try{
			Input = UseInp.nextLine(); // takes user input
			if (Input == null)
					{
				Input = " ";
					}
		}
			catch(Exception e){
				Input = " ";
				UseInp.next();
			}
			System.out.println();
			return Input;
	   }



}