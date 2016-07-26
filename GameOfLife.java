//Name: Alan Wong
//Class: CPSC 219
//Tutorial Section: T01
//Assignment: Assignment 3 Version 1
// Readme:  this assignment the biosphere is simulated with a 10  x 10 array of 'Critters' (Figure 1). Empty elements will be set to null, 
//while elements containing a 'Critter' will either appear as a '*' (Regular Critter) or a '!' 
//(Fertile Critter). Any of the 100 squares can contain a Critter. The simulation will begin with the 
//Critters in some starting pattern as selected by the user (Figure 1: Top). I suggest that you start by using the simpler biospheres first
//and work your way up to the more complex ones.   The more biospheres that your program can properly handle, the higher your grade will be. 
//After initializing the starting positions, the program will simulate the births and deaths of the critters over time on a turn-by-turn basis.
//The user can either hit <enter> to run another turn, 'q' or 'Q' to end the simulation. To help you test/debug your program you should 
//make use of the 'Mode' class (described below). Debug mode can be toggled by entering 'd' or 'D' when prompted to proceed to another turn. 

public class GameOfLife
{
    public static void main(String [] args)
    {
    	String nextGenS = null; //need these in order for the inputs to work properly
   
    	UserInterface newgame = new UserInterface();
        Biosphere aSphere = new Biosphere();
        aSphere.initialize(newgame.SelectBio());
        aSphere.runTurn();
        nextGenS = newgame.nextGen();
        while (!nextGenS.equalsIgnoreCase("q")) //if user puts q it quits the program
        {
        	if (nextGenS.equalsIgnoreCase("d"))//if user inputs d it changes the debug type to true
        	{
        		System.out.println("Debug Mode Enabled");
        		Mode.debug=true;
        	}
        	aSphere.runTurn();
        	nextGenS = newgame.nextGen();
        }
       
      //  Boolean nextTurn = true;
     //   while (nextTurn = true)
      //  {
      //  }
        

    }
}
