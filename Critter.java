public class Critter
{
    public static final char REGULAR = '*';
    public static final char FERTILE = '!';
    public static final char EMPTY = ' ';

    private char appearance;

    public Critter(char newAppearance)
    { 
        setAppearance(newAppearance);
    }

    /*
       Displays the current appearance of the Critter in the form of 
       a single character. The character will be displayed to the screen
       (console) and the cursor remains on the same line.
    */
    public void display()
    {
        System.out.print(appearance);
    }


    public char getAppearance()
    {
        return(appearance);
    }

    public void setAppearance(char newAppearance)
    {
        appearance = newAppearance;
    }
    public char checkDeath(int crittersNear) //checks if critter is dead based on given parameter
    {
    	char status = 'l';
		
    	if (crittersNear <= 1 ||crittersNear >= 4)
    			{
    		status = 'd'; //critter is dead
    			}
    	else 
    		{
       		status = 'l'; //critter lives
    		}
    	return(status);
    }
    public char checkBirth(int crittersNear) //checks if critter is born based on given parameter
    {
    	char status = 's'; //default critter is not born
		
    	if (crittersNear ==3)
    			{
    		status = 'b'; //critter is born
    			}

    	return(status);
    }
}
