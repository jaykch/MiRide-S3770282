package utilities;

import java.util.regex.Pattern;

public class DateUtilities {

    public static boolean dateIsNotInPast(DateTime date) {
        final int OFFSET_FOR_DAYS_IN_MILLISECONDS = 1;
        boolean notInPast = false;

        DateTime today = new DateTime();

        int daysInPast = DateTime.diffDays(date, today) + OFFSET_FOR_DAYS_IN_MILLISECONDS;
        if (daysInPast >= 0) {
            notInPast = true;
        }

        return notInPast;
    }

    public static boolean datesAreTheSame(DateTime date1, DateTime date2) {
        if (date1.getEightDigitDate().equals(date2.getEightDigitDate())) {
            return true;
        }
        return false;
    }

    public static boolean dateIsNotMoreThan7Days(DateTime date) {

        boolean within7Days = false;
        DateTime today = new DateTime();
        DateTime nextWeek = new DateTime(7);

        int daysInFuture = DateTime.diffDays(nextWeek, date);
        if (daysInFuture > 0 && daysInFuture < 8) {
            within7Days = true;
        }
        return within7Days;
    }

    public static boolean dateIsNotMoreThan3Days(DateTime date) {

        boolean within3Days = false;
        DateTime today = new DateTime();
        DateTime nextDate = new DateTime(3);

        int daysInFuture = DateTime.diffDays(nextDate, date);
        if (daysInFuture > 0 && daysInFuture < 4) {
            within3Days = true;
        }
        return within3Days;
    }

    public static boolean CheckDateFormat(String date) {
        Pattern regexPattern=Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        
        return regexPattern.matcher(date).matches();
    }
}
