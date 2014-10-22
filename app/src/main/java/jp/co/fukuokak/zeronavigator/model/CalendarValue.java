package jp.co.fukuokak.zeronavigator.model;

import java.util.Calendar;

/**
 * Created by fukuokak on 2014/10/20.
 */
public class CalendarValue {

    private Integer year;
    private Integer month;
    private Integer day;
    private int dayName;
    private String listText;
    private String dayNameFlag;
    private String[] week_name = {"", "Sun", "Mon", "Tue", "Wed",
            "Thu", "Fri", "Sat"};
    public static String ARG_EXTRA_KEY_CALENDAR = "calendar";

    public CalendarValue(Calendar calendar) {
        this.year = calendar.get(Calendar.YEAR) + 1;
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DATE);
        this.dayName = calendar.get(Calendar.DAY_OF_WEEK);
        this.dayNameFlag = week_name[dayName];
        this.listText = month.toString() + "/"
                + day.toString() + "(" + week_name[dayName] + ")";
        this.dayNameFlag = dayNameFlag;

    }


    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public int getDayName() {
        return dayName;
    }

    public String getListText() {
        return listText;
    }

    public String getDayNameFlag() {
        return dayNameFlag;
    }

    public String[] getWeek_name() {
        return week_name;
    }


}
