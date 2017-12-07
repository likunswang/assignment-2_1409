/**
 * Write a description of class Name here.
 *
 * @author Luke
 * @version 16.Nov.2017
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private Director director;
    private Date released;
    private String title;

    /**
     * default constructor
     */
    public Movie()
    {
        director = new Director();
        released = new Date();
        title = "Untitled";
    }

    /**
     * @param director, Director class obj,director of the movie
     * @param released, Date class obj,  released date of movie
     * @param title, name of the movie
     */
    public Movie(Director director, Date released, String title)
    {
        this.director = director;
        this.released = released;
        this.title = title;

        if(director == null)
        {
            this.director = new Director();
        }
        if(released == null)
        {
            this.released = new Date();
        }
        if(title == null || title.equals(""))
        {
            this.title = "Untitled";
        }
    }

    /**
     * @return the director name
     */
    public String getDirectorName()
    {
        return director.getName().getFullName();
    }

    /**
     * @return the day of week eg.Monday
     */
    public String getDayOfTheWeekMovieWasReleased()
    {
        return released.getDayOfTheWeek();
    }

    /**
     * prints the detail information of the Movie
     */
    public void printDetails()
    {
        if(director.getPseudonym() == null)
        {
            System.out.println( getDirectorName() + "(" + director.getName().getInitials() + ") released " + title + " on " + 
                released.detailDate());
        }

        else
        {
            System.out.println( getDirectorName() + "(" + director.getName().getInitials() + ") released " + title + " on " + 
                released.detailDate() + ", under the pseudonym " + director.getPseudonym().getFullName());
        }

    }
    //accessors
    /**
     * @return obj director of the movie
     */
    public Director getDirector()
    {
        return director;
    }
    /**
     * @return obj date released of the movie
     */
    
    public Date getDateReleased()
    {
        return released;
    }
    /**
     * @return the title of the movie
     */
    
    public String getTitle()
    {
        return title;
    }
    //mutators
    /**
     * @param director, Director class obj,
     */
    public void setDirector(Director director)
    {
        this.director = director;
    }
    /**
     * @param released, Date class obj,  released date of movie
     */
    public void setReleased(Date released)
    {
        this.released = released;
    }
    /**
     * @param title of the movie
     */
    public void setTitle(String title)
    {
        this.title = title;
        if(title == null || title.equals(""))
        {
            this.title = "Untitled";
        }
    }
    
}
