package ss19_case_study.service;

import ss19_case_study.common.Regex;
import ss19_case_study.model.facility.Facility;
import ss19_case_study.model.facility.House;
import ss19_case_study.model.facility.Room;
import ss19_case_study.model.facility.Villa;
import ss19_case_study.respository.FacilityRepository;
import ss19_case_study.respository.implement.IFacilityRepository;
import ss19_case_study.service.implement.IFacilityService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void displayAll() {
        Map<Facility, Integer> data = iFacilityRepository.getAll();
        for (Facility facility : data.keySet()) {
            System.out.println(facility + " Time out use: " + data.get(facility));
        }
    }

    @Override
    public void addFacility() {
        do {
            System.out.println("Do you want to add facility of room, house or villa???? Enter a num to add" +
                    "\n1. Add New Room" +
                    "\n2. Add New House" +
                    "\n3. Add New Villa" +
                    "\n4. Back to menu");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                iFacilityRepository.addFacility(addRoom());
                break;
            } else if (choice == 2) {
                iFacilityRepository.addFacility(addHouse());
                break;
            } else if (choice == 3) {
                iFacilityRepository.addFacility(addVilla());
                break;
            } else if (choice == 4) {
                System.out.println("Back to menu");
                break;
            } else {
                System.err.println("Enter a number 1,2,3 or 4 to choice");
                break;
            }
        } while (true);
    }

    @Override
    public void deleteFacility() {

        String id;
        do {
            System.out.println("Enter service code of facility do you want to delete");
             id = scanner.nextLine();
            if (Regex.checkServiceCodeFacility(id)){
                break;
            }else {
                System.out.println("Enter service code of facility with format: villa( SVVL-YYYY ), house ( SVHO-YYYY ), room (SVRO-YYYY) , Y is number");
            }
        }while (true);

        Facility facility = iFacilityRepository.getByID(id);
        if (facility == null) {
            System.out.println("Id not found");
        } else {
            System.out.println("Are you sure delete");
            System.out.println("1. Sure");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                iFacilityRepository.removeFacility(facility);
                System.out.println("Delete complete");
            }
        }
    }

    @Override
    public void findFacilityNeedMaintenance() {
        Map<Facility,Integer> data = iFacilityRepository.getAll();
        for (Facility facility:data.keySet()) {
            if (data.get(facility) >=5){
                System.out.println(facility);
            }
        }
    }
//    public House(String serviceCode, String serviceName, int areaUse, float rentalCost, int maxNumberOfTenants, String typesOfRent, String roomStandard, int numberOfFloors) {

    public Facility addHouse() {

        System.out.println("Enter a code of service house, with format SVHO-YYYY, Y is number");
        String serviceCode;
        do {
            serviceCode = scanner.nextLine();
            if (Regex.checkServiceFacilityHouse(serviceCode)) {
                break;
            } else {
                System.out.println("Enter a code of service house, with format SVHO-YYYY, Y is number");
            }
        } while (true);


        String serviceName = "House";

        System.out.println("Enter area use of house");
        int areUse;
        do {
            try {
                areUse = Integer.parseInt(scanner.nextLine());
                if (areUse > 30) {
                    break;
                } else {
                    System.out.println("Enter area use of house greater than 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter rental cost of house");
        float rentalCost;
        do {
            try {
                rentalCost = Float.parseFloat(scanner.nextLine());
                if (rentalCost > 0) {
                    break;
                } else {
                    System.out.println("enter rental cost greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter max number of tenants of house");
        int maxNumberOfTenants;
        do {
            try {
                maxNumberOfTenants = Integer.parseInt(scanner.nextLine());
                if (maxNumberOfTenants > 0 && maxNumberOfTenants < 20) {
                    break;
                } else {
                    System.out.println("Enter number of tenants >0 or ternants <20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);

        String typeOfRent = "house";

        String roomStandard = "house";

        System.out.println("Enter number of floors of house");
        int numberOfFloors;
        do {
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors <= 0) {
                    System.out.println("Number of floors must greater than 0, enter again");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);

        return new House(serviceCode, serviceName, areUse, rentalCost, maxNumberOfTenants, typeOfRent, roomStandard, numberOfFloors);
    }


    public Facility addRoom() {

        System.out.println("Enter a code of service room, with format SVRO-YYYY, Y is number");
        String serviceCode;
        do {
            serviceCode = scanner.nextLine();
            if (Regex.checkServiceFacilityRoom(serviceCode)) {
                break;
            } else {
                System.out.println("Enter a code of service room, with format SVRO-YYYY, Y is number");
            }
        } while (true);


        String serviceName = "Room";


        System.out.println("Enter area use of room");
        int areUse;
        do {
            try {
                areUse = Integer.parseInt(scanner.nextLine());
                if (areUse > 30) {
                    break;
                } else {
                    System.out.println("Enter area use of room greater than 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter rental cost of room");


        float rentalCost;
        do {
            try {
                rentalCost = Float.parseFloat(scanner.nextLine());
                if (rentalCost > 0) {
                    break;
                } else {
                    System.out.println("enter rental cost greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter max number of tenants of room");


        int maxNumberOfTenants;
        do {
            try {
                maxNumberOfTenants = Integer.parseInt(scanner.nextLine());
                if (maxNumberOfTenants > 0 && maxNumberOfTenants < 20) {
                    break;
                } else {
                    System.out.println("Enter number of tenants >0 or ternants <20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);

        String typeOfRent = "room";


        System.out.println("Enter service free include");
        String serviceFreeInclude;
        do {
            serviceFreeInclude = scanner.nextLine();
            if (Regex.checkServiceFreeInclude(serviceFreeInclude)) {
                break;
            } else {
                System.out.println("Enter service free include with format: Khăn giấy, Bao cao su, Nước suối, Khăn tắm, Xà phòng");
            }
        } while (true);

        return new Room(serviceCode, serviceName, areUse, rentalCost, maxNumberOfTenants, typeOfRent, serviceFreeInclude);
    }


    public Facility addVilla() {

        System.out.println("Enter a code of service villa, with format SVVL-YYYY, Y is number");
        String serviceCode;
        do {
            serviceCode = scanner.nextLine();
            if (Regex.checkServiceFacilityVilla(serviceCode)) {
                break;
            } else {
                System.out.println("Enter a code of service house, with format SVVL-YYYY, Y is number");
            }
        } while (true);


        String serviceName = "Villa";

        System.out.println("Enter area use of villa");
        int areUse;
        do {
            try {
                areUse = Integer.parseInt(scanner.nextLine());
                if (areUse > 30) {
                    break;
                } else {
                    System.out.println("Enter area use of villa greater than 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter rental cost of villa");
        float rentalCost;
        do {
            try {
                rentalCost = Float.parseFloat(scanner.nextLine());
                if (rentalCost > 0) {
                    break;
                } else {
                    System.out.println("enter rental cost greater than 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter max number of tenants of villa");
        int maxNumberOfTenants;
        do {
            try {
                maxNumberOfTenants = Integer.parseInt(scanner.nextLine());
                if (maxNumberOfTenants > 0 && maxNumberOfTenants < 20) {
                    break;
                } else {
                    System.out.println("Enter number of tenants >0 or ternants <20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        String typeOfRent = "villa";

        String roomStandard = "villa";


        System.out.println("Enter area of swimming pool of villa");
        int areaSwimmingPoolOfVilla;
        do {
            try {
                areaSwimmingPoolOfVilla = Integer.parseInt(scanner.nextLine());
                if (areaSwimmingPoolOfVilla <= 30) {
                    System.out.println("Area of swimming pool of villa must greater than 30, enter again");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);


        System.out.println("Enter number of floors of house");
        int numberOfFloors;
        do {
            try {
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors <= 0) {
                    System.out.println("Number of floors must greater than 0, enter again");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a number ");
            }
        } while (true);

        return new Villa(serviceCode, serviceName, areUse, rentalCost, maxNumberOfTenants, roomStandard, typeOfRent, areaSwimmingPoolOfVilla, numberOfFloors);
    }

}
