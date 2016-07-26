
   
public class Biosphere //basically the map class that determines the state of the sim
{
    public static final int ROWS = 10; //declared variables
    public static final int COLUMNS = 10;
    public static final int MIN_ROW = 0;
    public static final int MAX_ROW = 9;
    public static final int MIN_COLUMN = 0;
    public static final int MAX_COLUMN = 9;
    public static final String HORIZONTAL_LINE = "  - - - - - - - - - -";
    public static final String HORIZONTAL_COUNT = "  0 1 2 3 4 5 6 7 8 9 ";
    private Critter [][] previous;
    private Critter [][] current; 
    private int generation;

	
	
    public Biosphere () //initializes default state of bio sphere
    {
        int r;
        int c;
        generation = 0;
        previous = new Critter [ROWS][COLUMNS];
        current = new Critter [ROWS][COLUMNS]; 
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY); //puts all spaces as empty critters
            }
        }
      }
    


    public void initialize(int sphereType) //deterimines which type of sphere to be used
    {

        switch (sphereType)
        {
            case 1:
                initializeCase1 ();
                break;

            case 2:
                initializeCase2 ();
                break;

            case 3:
                initializeCase3();
                break;
    
            case 4:
                initializeCase4 ();
                break;
	    
            case 5:
              initializeCase5();
              break;

            case 6:
                initializeCase6 ();
                break;
           
            case 7:
                initializeCase7 ();
                break;

            case 8:
                initializeCase8 ();
                break;
        }
    }
    
    // Completely empty
    private void initializeCase1 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
        }
    }

    // Single critter
    private void initializeCase2 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
        for (c = 0; c < COLUMNS; c++)
        {
            previous[r][c] = new Critter(Critter.EMPTY);
            current[r][c] = new Critter(Critter.EMPTY);
        }
    }
    previous[MIN_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);
    current[MIN_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);	
    }

    // Single birth (3 critters)
    private void initializeCase3 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
        for (c = 0; c < COLUMNS; c++)
        {
            previous[r][c] = new Critter(' ');
            current[r][c] = new Critter (' ');
        }
        }
        current[1][1] = new Critter('*');
        previous[1][1] = new Critter('*');
        current[2][3] = new Critter('*');
        previous[2][3] = new Critter('*');
        current[3][1] = new Critter('*');
        previous[3][1] = new Critter('*');
    }
    
    // Simple pattern in middle
    private void initializeCase4 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
        }
    previous[1][1] = new Critter(Critter.REGULAR);
    current[1][1] = new Critter(Critter.REGULAR);	
    previous[2][3] = new Critter(Critter.REGULAR);
    current[2][3] = new Critter(Critter.REGULAR);
    previous[2][2] = new Critter(Critter.REGULAR);
    current[2][2] = new Critter(Critter.REGULAR);			
    previous[3][1] = new Critter(Critter.REGULAR);
    current[3][1] = new Critter(Critter.REGULAR);	
    previous[3][3] = new Critter(Critter.REGULAR);
    current[3][3] = new Critter(Critter.REGULAR);
    }

    // Pattern near edges
    private void initializeCase5 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
        }
        previous[MIN_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);
        current[MIN_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);
        previous[MIN_ROW][MAX_COLUMN] = new Critter(Critter.REGULAR);
        current[MIN_ROW][MAX_COLUMN] = new Critter(Critter.REGULAR);	
        previous[MAX_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);
        current[MAX_ROW][MIN_COLUMN] = new Critter(Critter.REGULAR);	
        previous[MAX_ROW][MAX_COLUMN] = new Critter(Critter.REGULAR);
        current[MAX_ROW][MAX_COLUMN] = new Critter(Critter.REGULAR);	
        previous[0][2] = new Critter(Critter.REGULAR);
        current[0][2] = new Critter(Critter.REGULAR);	
        previous[2][1] = new Critter(Critter.REGULAR);
        current[2][1] = new Critter(Critter.REGULAR);	
    }

    private void initializeCase6 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
            previous[2][MIN_COLUMN] = new Critter(Critter.FERTILE);
            current[2][MIN_COLUMN] = new Critter(Critter.FERTILE);	    
            previous[1][1] = new Critter(Critter.REGULAR);
            current[1][1] = new Critter(Critter.REGULAR);	    
            previous[4][1] = new Critter(Critter.FERTILE);
            current[4][1] = new Critter(Critter.FERTILE);	    
        }
    }

    // Complex pattern, no fertile critters
    private void initializeCase7 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
        }
        current[1][4] = new Critter ('*');
        previous[1][4] = new Critter ('*');
        current[2][5] = new Critter ('*');
        previous[2][5] = new Critter ('*');
        current[3][3] = new Critter ('*');
        previous[3][3] = new Critter ('*');
        current[3][4] = new Critter ('*');
        previous[3][4] = new Critter ('*');
        current[3][5] = new Critter ('*');
        previous[3][5] = new Critter ('*');
    }

    // Complex pattern, with fertile critters
    private void initializeCase8 ()
    {
        int r;
        int c;
        for (r = 0; r < ROWS; r++)
        {
            for (c = 0; c < COLUMNS; c++)
            {
                previous[r][c] = new Critter(Critter.EMPTY);
                current[r][c] = new Critter(Critter.EMPTY);
            }
        }
        current[2][2]= new Critter (Critter.FERTILE);
        previous[2][2] = new Critter (Critter.FERTILE);
        current[2][3] = new Critter (Critter.REGULAR);
        previous[2][3] = new Critter (Critter.REGULAR);
        current[2][4] = new Critter (Critter.FERTILE);
        previous[2][4] = new Critter (Critter.FERTILE);
        current[4][1] = new Critter (Critter.REGULAR);
        previous[4][1] = new Critter (Critter.REGULAR);
    }

    private void display ()
    {
        int r;
        int c;
        System.out.println("\t\tGeneration: " + generation);
        System.out.println("  PREVIOUS GENERATION" + "\t   CURRENT GENERATION");
        System.out.println(HORIZONTAL_COUNT + " \t " + HORIZONTAL_COUNT);
        for (r = 0; r < ROWS; r++)
        {
        System.out.println(HORIZONTAL_LINE + " \t " + HORIZONTAL_LINE);
        System.out.print(r + "|");
        for (c = 0; c < COLUMNS; c++)
        {
            previous[r][c].display();
            System.out.print('|');
        }
        System.out.print("\t" + r);
        System.out.print(" |");
        for (c = 0; c < COLUMNS; c++)
        {
            current[r][c].display();
            System.out.print('|');
        }
        System.out.println();
    }
    System.out.println(HORIZONTAL_LINE + " \t " + HORIZONTAL_LINE);
    }
    private void updateField() //updates field so that it moves the current version to the previous
    {
        int r;
        int c;
    	 for (r = 0; r < ROWS; r++)
         {
             for (c = 0; c < COLUMNS; c++)
             {
            	 previous[r][c].setAppearance(current[r][c].getAppearance());
             }
         }
    	 
    }
    
    private void scanField() //scans field for critters and returns lives or dies or births depending on critter
    {

        int r; //initialize variables
        int c;

       for (r = 0; r < ROWS; r++) //runs for as many rows there are
        {

        	for (c = 0; c < COLUMNS; c++) //run s for as many columns there are
            {

                    int critDeathCount =0 ;//counts the amount contributing to the death of critter
                    int critBirthCount =0 ;//counts the amount contributing to birth of critter

                    critDeathCount = scanVicinityDeath(r, c); //calls on to scan for near creatures that could cause death
                    critBirthCount =scanVicinityBirth(r, c); // calls on scan for near creatures that could case birth
                    liveOrDie(r, c, critBirthCount, critDeathCount ); //determines if the square lives or dies or births based on above


            	if (Mode.debug== true){ //debug mode outputting useful data with coordinates and counts on each grid
            		
                	System.out.println(r + " " +  c + " " +  critBirthCount + " " +"Birth Count in these coordinates");
                	System.out.println(r + " " +  c + " " +  critDeathCount+ " " +"Death Count in these coordinates");
            	}

            	//System.out.println(r + " " +  c + " " +  previous[r][c].checkBirth(critBirthCount));
        }
            }
        }
        
    private int scanVicinityDeath(int x, int y) //counts the amount contributing to the death of critter based on coordinates
    {
    	int critDeathCount = 0; //initializes variables
        int n; 
        int m;
    	
        for (n = -1; n < 2; n ++) //runs for 3 rows around the initial coordinates
        {
            for (m = -1; m < 2; m++) //runs for 3 columns around the initial coordinates
            {
            	if (x+n < 0 || y+m < 0 || x+n > 9 || y+m > 9) //skips if the coordinates are out of bounds
            	{
            		continue;
            	}
            	if (x+n == x && y+m == y){ //skips if coordinates are right on the point of origin
            		continue;
            	}
            	 if (previous[x+n][y+m].getAppearance() == '!' || previous[x+n][y+m].getAppearance() == '*') //if there is a creature contribute to the deathcounter
            	 {

                 	critDeathCount = critDeathCount +1;


            	 }
            }
        }
    	return critDeathCount;
    	
    }
    
    private int scanVicinityBirth(int x, int y)//counts the amount contributing to the birth of critter based on coordinates
    
    {
    	int critBirthCount = 0; //initializes variables
        int n;
        int m;
    	
        for (n = -1; n < 2; n ++)
        {
            for (m = -1; m < 2; m++)
            {
            	if (x+n < 0 || y+m < 0 || x+n > 9 || y+m > 9)//skips if the coordinates are out of bounds
            	{
            		continue;
            	}
            	if (x+n == x && y+m == y){//skips if coordinates are right on the point of origin
            		continue;
            	}
            	 if (previous[x+n][y+m].getAppearance() == '!' )//if there is a fertile contribute to the birth counter by 2
                     
            	 {

            		 critBirthCount = critBirthCount +2;
                 	
            	 }
              	 if (previous[x+n][y+m].getAppearance() == '*') //if there is a regular creature contribute to the birth counter by 1
            	 {

            		 critBirthCount = critBirthCount +1;
                 	
            	 }
            }
        }
    	return critBirthCount;
    	
    }
    private void liveOrDie(int x, int y, int critBirthCount,int critDeathCount) //spawn creature based on priority (latest one overriding the first one)
    {
        if (previous[x][y].checkBirth(critBirthCount) == 's') //if the area is not born a creature then the apperance of next stage is the same as the last one (lowest priority)
    	{
        	current[x][y].setAppearance(previous[x][y].getAppearance());
    	}
        if (previous[x][y].checkDeath(critDeathCount)== 'l') //if the creature lives then it appears on the next stage at the same coordinates
    	{
    	current[x][y].setAppearance(previous[x][y].getAppearance()) ;
    	}
    if (previous[x][y].checkDeath(critDeathCount)== 'd') //if the creature dies then it is not on the next stage
    {
    	current[x][y].setAppearance(' ') ;
    }
    if (previous[x][y].checkBirth(critBirthCount) == 'b') //if a creature is born it is on the next stage
	{
    	current[x][y].setAppearance('*') ;
	}
    }
    
    
    
    public void runTurn () //basic run turn function, scans, displays, then updates the field, and increases the generation by 1 
    {
        // You could make display and call it outside the class methods.
        // But all the actions needed during a turn e.g., copy from one array
        // to another etc should not be done outside of this class.
    	
    	scanField();
        display();
        updateField();
        generation = generation +1;
    }
}










