
/**
 * Warning! code extremely messy
 *
 * @author Luke
 * @version Nov.15.2017
 */
public class Date
{
    // instance variables - replace the example below with your own
    private int Year;
    private int Month;
    private int Day;

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static final int SATURDAY = 0;
    public static final int SUNDAY = 1;
    public static final int MONDAY = 2;
    public static final int TUESDAY = 3;
    public static final int WEDSNEDAY = 4;
    public static final int THURSDAY = 5;
    public static final int FRIDAY = 6;

    public static final String JANUARY_STRING = "January";
    public static final String FEBRUARY_STRING = "February";
    public static final String MARCH_STRING = "March";
    public static final String APRIL_STRING = "April";
    public static final String MAY_STRING = "May";
    public static final String JUNE_STRING = "June";
    public static final String JULY_STRING = "July";
    public static final String AUGUST_STRING = "August";
    public static final String SEPTEMBER_STRING = "September";
    public static final String OCTOBER_STRING = "October";
    public static final String NOVEMBER_STRING = "November";
    public static final String DECEMBER_STRING = "December";

    public static final int CURRENT_YEAR = 2017;

    public static final int FIRST_DAY_OF_MONTH = 1;
    public static final int LAST_DAY_OF_LEAP_FEB = 29;
    public static final int LAST_DAY_OF_NORM_FEB = 28;
    public static final int LAST_DAY_OF_LONG_MONTH = 31;
    public static final int LAST_DAY_OF_NORM_MONTH = 30;

    private static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    /**
     * @param index, number for month, 1-12, eg, 1 will return January
     * @return the name of the month according to the number
     */
    public static String getMonthNames(int index)
    {
        return monthNames[index];
    }

    /**
     *  default constructor, sets date to January 1 2017
     */
    public Date()
    {
        // initialise instance variables
        Year = CURRENT_YEAR;
        Month = JANUARY;
        Day = FIRST_DAY_OF_MONTH;
    }

    /**
     *  set Date to default dates, this method only exists cuz my 2nd constructor does not take the default contrusctor
     */
    public void setDateToDefault()
    {
        Year = CURRENT_YEAR;
        Month = JANUARY;
        Day = FIRST_DAY_OF_MONTH;
    }

    /**
     * This method is just for shorten up the params in the 2nd constructor
     * @param year ,test if the year is a leap year for constructor
     * @return true for leap year
     */
    public static final boolean isLeapYearForConstructor(int year) //constructor use only
    {
        if( year % 400 == 0 )
        {
            return true;
        }
        else if ( year % 4 == 0 )
        {
            if( year % 100 == 0 &&
            year % 400 != 0)
            {
                return false;
            }
            else{
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * This method is just for shorten up the params in the 2nd constructor
     * @param month number from 1 to 12
     * @return true if the input month has 31 days
     */
    public static final boolean isLongMonth(int month) // constructor use only
    {
        if( month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER || month == DECEMBER )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @param year
     * @param month
     * @param day
     */
    public Date(int year, int month, int day)
    {
        if( year >= 0 &&
        year <= CURRENT_YEAR &&
        month >= 0 &&
        month <= DECEMBER)
        {
            if( isLeapYearForConstructor(year) == true ) // leap year
            {
                if(
                month == FEBRUARY &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_LEAP_FEB) // is a leap year and month is feb
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else if (
                isLongMonth(month) == true &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_LONG_MONTH) // is a leap year and month is a long month
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else if (
                isLongMonth(month) == false &&
                month != FEBRUARY &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_NORM_MONTH) // is a leap year and month is a normal month
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else // sets to default date
                {
                    setDateToDefault();
                }
            }
            else if ( isLeapYearForConstructor(year) == false ) // not a leap year
            {
                if(
                month == FEBRUARY &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_NORM_FEB) // is not a leap year and month is feb
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else if (
                isLongMonth(month) == true &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_LONG_MONTH) // is not a leap year and month is a long month
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else if (
                isLongMonth(month) == false &&
                month != FEBRUARY &&
                day >= FIRST_DAY_OF_MONTH &&
                day <= LAST_DAY_OF_NORM_MONTH) // is not a leap year and month is a normal month
                {
                    Year = year;
                    Month = month;
                    Day = day;
                }
                else // sets to default date
                {
                    setDateToDefault();
                }

            }

            else // sets to default date
            {
                setDateToDefault();
            }
        }
        else // sets to default date
        {
            setDateToDefault();
        }
    }

    /**
     * @return the day of the week
     */
    public String getDayOfTheWeek()
    {
        int temp;
        int monthCode[] = {0, 1, 4, 4, 0, 2 ,5 ,0, 3, 6, 1, 4, 6};
        int getMonthCode = Month;
        int tempZero;
        int tempOne;
        int tempTwo;
        int tempThree;
        int tempFour;
        int tempFive;
        int tempSix;
        String dayCode[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

        int stepZeroNum = 100;
        int stepOneNum = 12;
        int stepThreeNum = 4;
        int stepSixNum = 7;

        int offSetsZero = 1;
        int offSetsOne = 6;
        int offSetsTwo = 4;
        int offSetsThree = 2;
        int offSetsFour = 6;
        int offSetsFive = 4;

        int offSetYearsOne = 1600;
        int offSetYearsTwo = 1700;
        int offSetYearsThree = 1800;
        int offSetYearsThreeEnd = 1900;
        int offSetsYearfour = 2000;
        int offSetsYearFive = 2100;
        int offSetsYearEnd = 2200;

        tempZero = Year%stepZeroNum; //eg. 89
        tempOne = tempZero/stepOneNum; //eg.7
        tempTwo = tempZero - tempOne*stepOneNum; //eg.5
        tempThree = (int)Math.floor(tempTwo / stepThreeNum); //eg.1
        tempFour = Day; //eg. 16
        tempFive = monthCode[getMonthCode]; //eg.3
        if(isLeapYear() == true &&
        (Month == JANUARY || Month == FEBRUARY))
        {
            tempFive -= offSetsZero;

            if(Year >= offSetYearsOne && Year < offSetYearsTwo)
            {
                tempFive += offSetsOne;
            }
            else if(Year >= offSetYearsTwo && Year < offSetYearsThree)
            {
                tempFive += offSetsTwo;
            }
            else if(Year >= offSetYearsThree && Year < offSetYearsThreeEnd)
            {
                tempFive += offSetsThree;
            }
            else if(Year >= offSetsYearfour && Year < offSetsYearFive)
            {
                tempFive += offSetsFour;
            }
            else if(Year >= offSetsYearFive && Year < offSetsYearEnd)
            {
                tempFive += offSetsFive;
            }
        }
        else if(Year >= offSetYearsOne && Year < offSetYearsTwo)
        {
            tempFive += offSetsOne;
        }
        else if(Year >= offSetYearsTwo && Year < offSetYearsThree)
        {
            tempFive += offSetsTwo;
        }
        else if(Year >= offSetYearsThree && Year < offSetYearsThreeEnd)
        {
            tempFive += offSetsThree;
        }
        else if(Year >= offSetsYearfour && Year < offSetsYearFive)
        {
            tempFive += offSetsFour;
        }
        else if(Year >= offSetsYearFive && Year < offSetsYearEnd)
        {
            tempFive += offSetsFive;
        }

        tempSix = (tempOne + tempTwo + tempThree + tempFour + tempFive) % stepSixNum ; //eg.4
        return dayCode[tempSix];
    }

    /**
     * @return true for leap year
     */
    private boolean isLeapYear()
    {
        if( Year % 4 == 0 &&
        (Year % 100 != 0 || Year % 400 == 0 ))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @return the number of days in the instance-variable month
     */
    public int getNumberOfDaysInThisMonth()
    {
        if ( isLeapYear() == true )
        {
            if( isLongMonth(this.Month) == true )
            {
                return LAST_DAY_OF_LONG_MONTH;
            }
            else if ( isLongMonth(this.Month) == false && this.Month != FEBRUARY )
            {
                return LAST_DAY_OF_NORM_MONTH;
            }
            else
            {
                return LAST_DAY_OF_LEAP_FEB;
            }
        }
        else
        {
            if( isLongMonth(this.Month) == true )
            {
                return LAST_DAY_OF_LONG_MONTH;
            }
            else if ( isLongMonth(this.Month) == false && this.Month != FEBRUARY )
            {
                return LAST_DAY_OF_NORM_MONTH;
            }
            else
            {
                return LAST_DAY_OF_NORM_FEB;
            }
        }
    }

    /**
     * @return formatted date e.g. February 29, 2004: 	2004-02-29
     */
    public String getFormattedDate()
    {
        return this.Year + "-" + getPaddedMonth() + "-" + getPaddedDay();
    }

    /**
     * @return formatted month number,
     * 
     */
    private String getPaddedMonth()
    {
        if(this.Month < 10)
        {
            return "0" + this.Month;
        }
        else
        {
            return "" + this.Month;
        }
    }

    /**
     * @return formatted day number,
     */
    private String getPaddedDay()
    {
        if(this.Day < 10)
        {
            return "0" + this.Day;
        }
        else
        {
            return "" + this.Day;
        }
    }

    /**
     * @param monthNumber, takes 1-12 for month numbers
     * @return the name of the month, eg, March if input is 3, will return null if input is not between 1-12
     */
    public static String getMonthName(int monthNumber)
    {
        switch(monthNumber)
        {
            case JANUARY:
            return JANUARY_STRING;

            case FEBRUARY:
            return FEBRUARY_STRING;

            case MARCH:
            return MARCH_STRING;

            case APRIL:
            return APRIL_STRING;

            case MAY:
            return MAY_STRING;

            case JUNE:
            return JUNE_STRING;

            case JULY:
            return JULY_STRING;

            case AUGUST:
            return AUGUST_STRING;

            case SEPTEMBER:
            return SEPTEMBER_STRING;

            case OCTOBER:
            return OCTOBER_STRING;

            case NOVEMBER:
            return NOVEMBER_STRING;

            case DECEMBER:
            return DECEMBER_STRING;

            default:
            return null;
        }
    }

    /**
     * @param monthName, the month name eg. April,JaNuAry,MAY
     * @return the number corresponding to the month name, eg, JANUARY = 1
     */
    public static int getMonthNumber(String monthName)
    {
        int firstLetter = 1;
        int MatchingNum = 1;
        if(monthName.length() > JANUARY)
        {
            monthName = monthName.substring(0,firstLetter).toUpperCase() + monthName.substring(firstLetter).toLowerCase();
            int i = 0;
            while( i < monthNames.length )
            {
                if(monthName.equals(getMonthNames(i)))
                {
                    i = i+MatchingNum;
                    return i;
                }
                else
                {
                    i++;
                }
            }
            return 0;
        }
        else{
            return 0;
        }
    }

    /**
     * @return Year number
     */
    public int getYear()
    {
        return Year;
    }

    /**
     * @return Month Number
     */
    public int getMonth()
    {
        return Month;
    }

    /**
     * @return Day Number
     */
    public int getDay()
    {
        return Day;
    }

    /**
     * @param year number
     */
    public void setYear(int year)
    {
        if(year > 0 && year <= CURRENT_YEAR)
        {
            Year = year;
        }
        else
        {
            Year = CURRENT_YEAR;
        }
    }

    /**
     * @param month Number from 1-12, 1 = Jan, 12 = Dec.
     */
    public void setMonth(int month)
    {
        if(month >= JANUARY && month <= DECEMBER)
        {
            Month = month;
        }
        else
        {
            Month = JANUARY;
        }
    }

    /**
     * @param day Number of the month,
     */
    public void setDay(int day)
    {
        if( isLeapYearForConstructor(Year) == true ) // leap year
        {
            if(
            Month == FEBRUARY &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_LEAP_FEB) // is a leap year and month is feb
            {

                Day = day;
            }
            else if (
            isLongMonth(Month) == true &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_LONG_MONTH) // is a leap year and month is a long month
            {

                Day = day;
            }
            else if (
            isLongMonth(Month) == false &&
            Month != FEBRUARY &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_NORM_MONTH) // is a leap year and month is a normal month
            {

                Day = day;
            }
            else // sets to default date
            {
                setDateToDefault();
            }
        }
        else if ( isLeapYearForConstructor(Year) == false ) // not a leap year
        {
            if(
            Month == FEBRUARY &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_NORM_FEB) // is not a leap year and month is feb
            {

                Day = day;
            }
            else if (
            isLongMonth(Month) == true &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_LONG_MONTH) // is not a leap year and month is a long month
            {

                Day = day;
            }
            else if (
            isLongMonth(Month) == false &&
            Month != FEBRUARY &&
            day >= FIRST_DAY_OF_MONTH &&
            day <= LAST_DAY_OF_NORM_MONTH) // is not a leap year and month is a normal month
            {

                Day = day;
            }
            else // sets to default date
            {
                Day = FIRST_DAY_OF_MONTH;
            }

        }
        else
        {
            Day = FIRST_DAY_OF_MONTH;
        }
    }

    /**
     * @return detail formatted dates for Movie class eg. "Friday, July 3, 1985"
     */
    public String detailDate()
    {
        return getDayOfTheWeek() + ", " + getMonthName(getMonth()) + " " + getDay() + ", " + getYear();
    }
}

