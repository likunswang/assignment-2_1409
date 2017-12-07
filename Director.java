
/**
 * Write a description of class Name here.
 *
 * @author Luke
 * @version 16.Nov.2017
 */
public class Director
{
    // instance variables - replace the example below with your own
    private Name name;
    private Date born;
    private Date died;
    private Name pseudonym;

    /**
     * @return name
     */
    public Name getName()
    {
        return name;
    }

    /**
     * @return date born
     */
    public Date getDateBorn()
    {
        return born;
    }

    /**
     * @return date died
     */
    public Date getDateDied()
    {
        return died;
    }

    /**
     * @return pseudonym
     */
    public Name getPseudonym()
    {
        return pseudonym;
    }

    /**
     * @param name an Name class object
     */
    public void setName(Name name)
    {
        this.name = name;
    }

    /**
     * @param born, Date object for date born
     */
    public void setBorn(Date born)
    {
        this.born = born;
    }

    /**
     * @param died, Date object for date died
     */
    public void setDied(Date died)
    {
        this.died = died;
    }

    /**
     * @param pseudonym, Name object for pseudonym
     */
    public void setPseudonym(Name pseudonym)
    {
        this.pseudonym = pseudonym;
    }

    /**
     * default constructor
     */
    public Director()
    {
        name = new Name();
        born = new Date();
        died = new Date();
        pseudonym = new Name();
    }

    /**
     * @param firstName, first name of director
     * @param lastName, last name of director
     * @param middleName, middle name of director
     * @param yearBorn, year born  of director
     * @param monthBorn, month born of director
     * @param dayBorn, day born of director
     * @param yearDied, year died of director
     * @param monthDied, month died of director
     * @param dayDied, day died of director
     * @param pseudonymFirstName, pseudonym first name  of director
     * @param pseudonymLastName, last name  of director
     * @param pseudonymMiddleName, middle name of director
     */
    public Director(String firstName,         
    String lastName, 
    String middleName, 
    int yearBorn, int monthBorn, int dayBorn,              
    int yearDied, int monthDied, int dayDied,  
    String pseudonymFirstName,
    String pseudonymLastName, 
    String pseudonymMiddleName)
    {
        name = new Name(firstName, lastName, middleName);
        born = new Date(yearBorn, monthBorn, dayBorn);
        died = new Date(yearDied, monthDied, dayDied);
        if(pseudonymFirstName != null || 
        pseudonymLastName != null ||
        pseudonymMiddleName != null)
        {
            pseudonym = new Name(pseudonymFirstName, pseudonymLastName, pseudonymMiddleName);
        }

    }

    /**
     * @param name, Name class obj, director name
     * @param born, Date class obj, director date born.
     * @param died, Date class obj, director date died.
     * @param pseudonym, Name class obj, director pseudonym
     * 
     * call default constructor if name or born is null
     */
    public Director(Name name, Date born, Date died, Name pseudonym)
    {
        this();
        if(name != null && born != null)
        {
            this.name = name;
            this.born = born;
            this.died = died;
            this.pseudonym = pseudonym;
        }
    }

    /**
     * @param name, Name class obj, director name
     * @param born, Date class obj, director date born.
     * @param died, Date class obj, director date died.
     * set pseudonym to null
     */
    public Director(Name name, Date born, Date died)
    {
        this();
        if(name != null && born != null)
        {
            this.name = name;
            this.born = born;
            this.died = died;
            this.pseudonym = null;
        }
    }

    /**
     * @return true if died is null; ortherwise return false
     */
    public boolean isDirectorAlive()
    {
        if(died == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @return how old the director is (or would be if they are dead)
     */
    public int getAgeYearsOfDirector()
    {
        return born.CURRENT_YEAR - born.getYear();
    }
}
