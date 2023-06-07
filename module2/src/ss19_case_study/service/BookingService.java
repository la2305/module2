package ss19_case_study.service;

import ss19_case_study.model.booking.Booking;
import ss19_case_study.model.customer.Customer;
import ss19_case_study.model.facility.Facility;
import ss19_case_study.respository.BookingRepository;
import ss19_case_study.respository.CustomerRepository;
import ss19_case_study.respository.FacilityRepository;
import ss19_case_study.respository.implement.IBookingRepository;
import ss19_case_study.respository.implement.ICustomerRepository;
import ss19_case_study.respository.implement.IFacilityRepository;
import ss19_case_study.service.implement.IBookingService;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

public class BookingService implements IBookingService {
    private static Scanner scanner = new Scanner(System.in);
    private final IBookingRepository bookingRepository = new BookingRepository();
    private final ICustomerRepository customerRepository = new CustomerRepository();
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Set<Booking> data = bookingRepository.getData();
        for (Booking b : data) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.println("Customer list: ");
        for (Customer customer : customerRepository.getAll()) {
            System.out.println(customer);
        }
        System.out.println("Facility list: ");
        for (Facility facility : facilityRepository.getAll().keySet()) {
            if (facilityRepository.getAll().get(facility) < 5)
                System.out.println(facility);
        }


        System.out.println("Enter id booking ");
        String idBooking = scanner.nextLine();


        System.out.println("Enter date booking ");
        String dateBooking = scanner.nextLine();
        int length = dateBooking.length();
        int year = Integer.parseInt("" + dateBooking.charAt(length - 4) + dateBooking.charAt(length - 3) + dateBooking.charAt(length - 2) + dateBooking.charAt(length - 1));
        int month = Integer.parseInt("" + dateBooking.charAt(3) + dateBooking.charAt(4));
        int day = Integer.parseInt("" + dateBooking.charAt(0) + dateBooking.charAt(1));
        LocalDate booking = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();


        System.out.println("Enter date start ");
        String dateStart = scanner.nextLine();
        int length1 = dateStart.length();
        int year1 = Integer.parseInt("" + dateStart.charAt(length1 - 4) + dateStart.charAt(length1 - 3) + dateStart.charAt(length1 - 2) + dateStart.charAt(length1 - 1));
        int month1 = Integer.parseInt("" + dateStart.charAt(3) + dateStart.charAt(4));
        int day1 = Integer.parseInt("" + dateStart.charAt(0) + dateStart.charAt(1));
        LocalDate booking1 = LocalDate.of(year1, month1, day1);
        LocalDate now1 = LocalDate.now();


        System.out.println("Enter date end ");
        String dateEnd = scanner.nextLine();
        int length2 = dateEnd.length();
        int year2 = Integer.parseInt("" + dateEnd.charAt(length2 - 4) + dateEnd.charAt(length2 - 3) + dateEnd.charAt(length2 - 2) + dateEnd.charAt(length2 - 1));
        int month2 = Integer.parseInt("" + dateEnd.charAt(3) + dateEnd.charAt(4));
        int day2 = Integer.parseInt("" + dateEnd.charAt(0) + dateEnd.charAt(1));
        LocalDate booking2 = LocalDate.of(year2, month2, day2);
        LocalDate now2 = LocalDate.now();


        String idCustomer;
        Customer objectCustomer;
        DO_WHILE1:
        do {
            System.out.println("Enter id customer");
            idCustomer = scanner.nextLine();
            for (Customer customer : customerRepository.getAll()) {
                if (customer.getId().equals(idCustomer)) {
                    objectCustomer =  customer;
                    break DO_WHILE1;
                }
            }
            System.out.println("Can't find id");
        } while (true);


        String idFacility;
        Facility objectFacility;
        DO_WHILE2:
        do {
            System.out.println("Enter id facility");
            idFacility = scanner.nextLine();
            for (Facility facility : facilityRepository.getAll().keySet()) {
                if (facility.getFacilityCode().equals(idFacility) && facilityRepository.getAll().get(facility) < 5) {
                    objectFacility = facility;
                    break DO_WHILE2;
                }
            }
            System.out.println("Can't find id");
        } while (true);
        bookingRepository.add(new Booking(idBooking, dateBooking, dateStart, dateEnd, objectCustomer, objectFacility));

    }
}
