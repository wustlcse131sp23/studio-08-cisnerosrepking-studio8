package studio8;

import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean am;
/** constructor for time
 * 
 * @param hour
 * @param minute
 * @param am
 */
public Time (int hour, int minute, boolean am) {
	this.hour = hour;
	this.minute = minute;
	this.am= am;
}

public String toString() {
	if (hour < 12) {
		return hour + ":" + minute + " am";
	}
	else {
		int newHour = hour - 12;
		return newHour + ":" + minute + " pm";
	}
}
	public static void main(String[] args) {
		Time t1 = new Time(3, 20, true);
		System.out.println(t1);
		Time t2 = new Time(15, 30, false);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}