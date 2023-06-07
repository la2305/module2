package ss19_case_study.respository.implement;

import ss19_case_study.model.booking.Booking;

import java.util.Set;

public interface IBookingRepository {
    Set<Booking> getData();
    void add (Booking booking);
}
