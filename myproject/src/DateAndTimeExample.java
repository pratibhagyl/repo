import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class DateAndTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime time=LocalDateTime.now();
System.out.println(time);
LocalDate date=time.toLocalDate();
System.out.println(date);
Month m=time.getMonth();
int day=time.getDayOfMonth();
int seconds=time.getSecond();
System.out.println(m+" "+day+" "+seconds);
LocalDateTime time1=time.withDayOfMonth(10).withYear(2014);
System.out.println(time1);
LocalDate time2=LocalDate.of(2016, Month.MAY,27);
System.out.println(time2);
LocalTime time3=LocalTime.of(22, 15);
System.out.println(time3);
LocalTime time4=LocalTime.parse("22:15:30");
System.out.println(time4);
ZonedDateTime time5=ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
System.out.println(time5);
ZoneId time6=ZoneId.of("Europe/Paris");
System.out.println(time6);
ZoneId time7=ZoneId.systemDefault();
System.out.println(time7);
LocalDate date1=date.plus(1,ChronoUnit.WEEKS);
System.out.println(date1);
LocalDate date2=date.plus(1,ChronoUnit.MONTHS);
System.out.println(date2);
LocalDate date3=date.plus(1,ChronoUnit.YEARS);
System.out.println(date3);
LocalDate date4=date.plus(1,ChronoUnit.DECADES);
System.out.println(date4);
Period p=Period.between(date2, date1);
System.out.println(p);
LocalTime t1=LocalTime.now();
System.out.println(t1);
Duration twoHours=Duration.ofHours(2);
LocalTime t2=t1.plus(twoHours);
System.out.println(t2);
Duration d=Duration.between(t1,t2);
System.out.println(d);

	}

}
