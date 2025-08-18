package lab5;

import java.util.Calendar;

class DateDemo {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println("The date is " + date.getTime() + " "
                + date.getTimeInMillis()+ " Type: "+date.getCalendarType());
        
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.MONTH, 0); //January starts from 0
        date.set(Calendar.DAY_OF_MONTH, 1);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 1);
        System.out.println("The changed date is "
                + date.getTime() + " "
                + date.getTimeInMillis());
        System.out.println(date.toString());
        System.out.println(System.currentTimeMillis());

    }
}
