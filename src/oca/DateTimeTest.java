package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by khaitq
 * Date: 25/11/2018
 * Github:  https://github.com/quangkhai88
 */

public class DateTimeTest {

    public static void main(String ...args) {

        String s = LocalDate.parse("2015-05-04").format(DateTimeFormatter.ISO_DATE);

        System.out.println(s);


    }


}
