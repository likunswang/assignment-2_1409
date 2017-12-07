
/**
 * Write a description of class TestDate here.
 *
 * @author Luke
 * @version 16.Nov.2017
 */
public class TestDate
{
    // instance variables - replace the example below with your own
    private Date[] sampleDates;
    public static final int ALLDATES = 15;
    int d1 = 0;
    int d2 = 1;
    int d3 = 2;
    int d4 = 3;
    int d5 = 4;
    int d6 = 5;
    int d7 = 6;
    int d8 = 7;
    int d9 = 8;
    int d10 = 9;
    int d11 = 10;
    int d12 = 11;
    int d13 = 12;
    int d14 = 13;
    int d15 = 14;
    
    /**
     * Constructor for TestDate(), initializes the array sampleDates that stores the specified dates for testing
     */
    public TestDate()
    {
        sampleDates = new Date[ALLDATES];
        
        sampleDates[d1] = new Date(1970, 11, 15);
        sampleDates[d2] = new Date(1887, 7, 31);
        sampleDates[d3] = new Date(1966, 5, 2);
        sampleDates[d4] = new Date(1980, 8, 19);
        sampleDates[d5] = new Date(2001, 9 ,11);
        sampleDates[d6] = new Date(1900, 6 ,26);
        sampleDates[d7] = new Date(1940, 2, 28);
        sampleDates[d8] = new Date(1974, 10, 30);
        sampleDates[d9] = new Date(1914, 1, 15);
        sampleDates[d10] = new Date(1840, 10, 1);
        sampleDates[d11] = new Date(1999, 12, 31);
        sampleDates[d12] = new Date(1988, 5, 20);
        sampleDates[d13] = new Date(2012, 3, 10);
        sampleDates[d14] = new Date(2006, 4, 1);
        sampleDates[d15] = new Date(1992, 2, 29);
        
        getSampleDates();

    }
/**
 * display the day of the week for the dates by calling each Date’s getDayOfTheWeek() method
 */

    public void getSampleDates()
    {
        int index = 0;
        while(index < sampleDates.length)
        {
            System.out.println(sampleDates[index].getDayOfTheWeek());
            index++;
            
        }
    }


}
