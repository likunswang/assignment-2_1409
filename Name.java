
/**
 * Write a description of class Name here.
 *
 * @author Luke
 * @version 16.Nov.2017
 */
public class Name
{
    // instance variables - replace the example below with your own
    private String first;
    private String last;
    private String middle;

    private String defaultFirst = "A.";
    private String defaultLast = "Ymous";
    private String defaultMiddle ="Non";

    public static final int MINIMUM_NAME_LENGTH = 1;
    public static final int MAXIMUM_NAME_LENGTH = 40;

    private int firstLetter = 1;

    /**
     * @return first name
     */
    public String getFirstName()
    {
        return this.first.substring(0,firstLetter).toUpperCase() 
        + this.first.substring(firstLetter).toLowerCase();
    }

    /**
     * @return last name
     */
    public String getLastName()
    {
        return this.last.substring(0,firstLetter).toUpperCase() 
        + this.last.substring(firstLetter).toLowerCase();
    }

    /**
     * @return middle name
     */
    public String getMiddleName()
    {
        if(this.middle != null)
        {
            return this.middle.substring(0,firstLetter).toUpperCase() 
            + this.middle.substring(firstLetter).toLowerCase();
        }
        return middle;
    }

    /**
     * @param first, set first name
     */
    public void setFirst(String first)
    {
        if(first != null &&
        first.length() >= MINIMUM_NAME_LENGTH &&
        first.length() <= MAXIMUM_NAME_LENGTH)
        {
            this.first = first;
        }
        else
        {
            this.first = defaultFirst;
        }
    }

    /**
     * @param last, set last name
     */
    public void setLast(String last)
    {
        if(last != null &&
        last.length() >= MINIMUM_NAME_LENGTH &&
        last.length() <= MAXIMUM_NAME_LENGTH)
        {
            this.last = last;
        }
        else
        {
            this.last = defaultLast;
        }
    }

    /**
     * @param middle, set middle name
     */
    public void setMiddle(String middle)
    {
        if(middle != null)
        {
            if(
            middle.length() >= MINIMUM_NAME_LENGTH &&
            middle.length() <= MAXIMUM_NAME_LENGTH)
            {
                this.middle = middle;
            }
            else
            {
                this.middle = null;
            }
        }
        else
        {
            this.middle = null;
        }
    }

    /**
     * default Constructor, set all name to defaultName
     */
    public Name()
    {
        // initialise instance variables
        first = defaultFirst;
        last = defaultLast;
        middle = defaultMiddle;
    }

    /**
     * @param first name
     * @param last name
     * @param middle name
     */
    public Name(String first, String last, String middle)
    {
        if(middle == null || middle.length() < MINIMUM_NAME_LENGTH)
        {
            if(first != null &&
            first.length() >= MINIMUM_NAME_LENGTH &&
            first.length() <= MAXIMUM_NAME_LENGTH &&
            last != null &&
            last.length() >= MINIMUM_NAME_LENGTH &&
            last.length() <= MAXIMUM_NAME_LENGTH)

            {
                this.first = first;
                this.last = last;
                this.middle = null;
            }
            else
            {
                this.first = defaultFirst;
                this.last = defaultLast;
                this.middle = defaultMiddle;
            }
        }
        else if(middle.length() >= MINIMUM_NAME_LENGTH &&
        middle.length() <= MAXIMUM_NAME_LENGTH)
        {
            if(first != null &&
            first.length() >= MINIMUM_NAME_LENGTH &&
            first.length() <= MAXIMUM_NAME_LENGTH &&
            last != null &&
            last.length() >= MINIMUM_NAME_LENGTH &&
            last.length() <= MAXIMUM_NAME_LENGTH)

            {
                this.first = first;
                this.last = last;
                this.middle = middle;
            }
            else
            {
                this.first = defaultFirst;
                this.last = defaultLast;
                this.middle = defaultMiddle;
            }
        }
        else
        {
            this.first = defaultFirst;
            this.last = defaultLast;
            this.middle = defaultMiddle;
        }

    }

    /**
     * @return the name in the format of eg. Tiger Woods (no middle), or Tiger Tont Woods (with middle name)
     */
    private String makePrettyName()
    {
        if(this.middle == null)
        {
            return this.first.substring(0,firstLetter).toUpperCase() + this.first.substring(firstLetter).toLowerCase() + " " 
            + last.substring(0,firstLetter).toUpperCase() + last.substring(firstLetter).toLowerCase();
        }

        else
        {
            return first.substring(0,firstLetter).toUpperCase() + first.substring(firstLetter).toLowerCase() + " " 
            + middle.substring(0,firstLetter).toUpperCase() + middle.substring(firstLetter).toLowerCase() + " "
            + last.substring(0,firstLetter).toUpperCase() + last.substring(firstLetter).toLowerCase();
        }

    }

    /**
     * @return the intials of the names eg. T.W. (Tiger Woods, no middle) or T.T.W. (Tiger Tont Woods, with middle)
     */
    public String getInitials()
    {
        if(middle == null)
        {
            return first.substring(0,firstLetter).toUpperCase() + "." + last.substring(0,firstLetter).toUpperCase() + ".";
        }
        else
        {
            return first.substring(0,firstLetter).toUpperCase() + "." 
            + middle.substring(0,firstLetter).toUpperCase() + "." 
            + last.substring(0,firstLetter).toUpperCase() + ".";
        }
    }

    /**
     * @return accessor for makePrettyName method, returns the name after formatted
     */
    public String getFullName()
    {
        return makePrettyName();
    }

}
