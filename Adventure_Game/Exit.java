
public class Exit {
	// Numerical codes
	public static final int UNDEFINED = 0;
	public static final int NORTH = 1;
	public static final int SOUTH = 2;
	public static final int EAST  = 3;
	public static final int WEST  = 4;
	public static final int IN 	= 5;
	public static final int OUT = 6;

	// String codes	
	public static final String[] dirName = { 
		"UNDEFINED",
		"NORTH",
		"SOUTH",
		"EAST",
		"WEST",,
		"IN",
		"OUT"
	};


	// Member variables
	private Location leadsTo = null;	// name of the room that it leads to
	private int direction;				// directions based on the numerical codes provided above

	// Full name of direction eg SOUTHEAST
	private String directionName;

	// Default constructor
	public Exit()
	{
		direction = Exit.UNDEFINED;
		leadsTo = null;
		directionName = dirName[UNDEFINED];
	}

	// Full constructor
	public Exit( int direction, Location leadsTo )
	{
		direction = this.direction;

		// Assign direction names
		if (direction <= dirName.length )
			directionName = dirName[m_direction];

		// Assign location
		m_leadsTo = leadsTo;
	}

	// toString method
	public String toString()
	{
		return directionName;
	}

	// Assigns direction name
	public void setDirectionName( String dirname )
	{
		directionName = dirname;
	}

	// Returns direction name
	public String getDirectionName()
	{
		return directionName;
	}

	// Assigns short direction name
	public void setShortDirectionName ( String shortName )
	{
		shortDirectionName = shortName;
	}

	// Assigns location
	public void setLeadsTo ( Location leadsTo )
	{
		leadsTo = this.leadsTo;
	}

	// Returns location
	public Location getLeadsTo (  )
	{
		return leadsTo;
	}

}
