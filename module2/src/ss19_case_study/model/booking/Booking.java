package ss19_case_study.model.booking;

import ss19_case_study.model.customer.Customer;
import ss19_case_study.model.facility.Facility;

import java.util.Objects;

public class Booking {
    private String bookingCode;
    private String bookingDate;
    private String bookingStartDate;
    private String bookingEndDate;
    private Customer customerCode;
    private Facility serviceCode;

    public Booking(String bookingCode, String bookingDate, String bookingStartDate, String bookingEndDate, Customer customerCode, Facility idFacility) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.bookingStartDate = bookingStartDate;
        this.bookingEndDate = bookingEndDate;
        this.customerCode = customerCode;
        this.serviceCode = idFacility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingCode, booking.bookingCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode);
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(String bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public String getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(String bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public Customer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Customer customerCode) {
        this.customerCode = customerCode;
    }

    public Facility getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Facility serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", bookingStartDate='" + bookingStartDate + '\'' +
                ", bookingEndDate='" + bookingEndDate + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
