package ss19_case_study.respository;

import ss19_case_study.common.comparator.ComparatorBooking;
import ss19_case_study.model.booking.Booking;
import ss19_case_study.model.customer.Customer;
import ss19_case_study.model.facility.Facility;
import ss19_case_study.respository.implement.IBookingRepository;
import ss19_case_study.respository.implement.ICustomerRepository;
import ss19_case_study.respository.implement.IFacilityRepository;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    private static Set<Booking> data = new TreeSet<>(new ComparatorBooking());
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    static {
        List<Customer> dataCustomer = customerRepository.getAll();
        Customer customer1 = dataCustomer.get(0);
        Map<Facility, Integer> dataFacility = facilityRepository.getAll();
        List<Facility> facilityList = new ArrayList<>();
        for (Facility facility : dataFacility.keySet()) {
            facilityList.add(facility);
        }
        Booking booking1 = new Booking("BK-1111", "24-12-2023", "25-12-2022", "26-12-2022", customer1, facilityList.get(0));
        Booking booking2 = new Booking("BK-2222", "24-12-2023", "25-12-2022", "28-12-2022", customer1, facilityList.get(0));
        Booking booking3 = new Booking("BK-3333", "24-12-2023", "25-12-2023", "30-12-2023", customer1, facilityList.get(0));
        Booking booking4 = new Booking("BK-3333", "24-12-2023", "25-12-2023", "30-12-2023", customer1, facilityList.get(0));

        data.add(booking1);
        data.add(booking2);
        data.add(booking3);
        data.add(booking4);
    }

    @Override
    public Set<Booking> getData() {
        return data;
    }

    @Override
    public void add(Booking booking) {
        data.add(booking);
        System.out.println("Add booking success");
        facilityRepository.maintenance(booking.getServiceCode());
    }

}
