package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
private int month;
private int day;
private int year;
private boolean holiday;
/**constructor for date
 * 
 * @param month
 * @param day
 * @param year
 * @param holiday
 */

public Date (int month, int day, int year, boolean holiday) {
	this.month = month;
	this.day = day;
	this.year = year;
	this.holiday = holiday;
	
}
public String toString() {
	return month + "/" + day + "/" + year;
}

    public static void main(String[] args) {
    	Date d1 = new Date(4, 6, 2023, false);
    	System.out.println(d1);
    	Date d2 = new Date(5, 30, 2004, false);
    	Date d3 = new Date(8, 24, 2019, false);
    	Date d4 = new Date(12, 25, 2013, true);
    	Date d5 = new Date(3, 13, 2020, true);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1); 
    	list.add(d1);
    	list.add(d3); 
    	list.add(d4); 
    	list.add(d5); 
    	System.out.println(list);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1); 
    	set.add(d1);
    	set.add(d3); 
    	System.out.println(set);
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
