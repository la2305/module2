package ss19_case_study.common.comparator;

import ss19_case_study.model.booking.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.logging.SimpleFormatter;

public class ComparatorBooking implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        Date o1Start = null;
        Date o2Start = null;
        Date o1End = null;
        Date o2End = null;
        try {
            o1Start = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getBookingStartDate());
            o1End = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getBookingEndDate());
            o2Start = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getBookingStartDate());
            o2End = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getBookingEndDate());

        } catch (ParseException e) {
            System.out.println("Runtime exception");
        }
        if (o2Start.equals(o1Start)) {
            {
                if(o2End.equals(o1End))
                   return o2.getBookingCode().compareTo(o1.getBookingCode());
                else
                    return o2End.compareTo(o1End);
            }
        } else {
            return o2Start.compareTo(o1Start);
        }
    }
}
