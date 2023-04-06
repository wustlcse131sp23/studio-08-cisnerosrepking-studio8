package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	public Appointment (Date date, Time time) {
		this.date=date;
		this.time=time;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date (3, 23, 2019, false);
		Time t1 = new Time (11, 23);
		Appointment a1 = new Appointment (d1, t1);
		System.out.print(a1);
		HashSet<Date> set = new HashSet<Date>();
		set.add(a1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
