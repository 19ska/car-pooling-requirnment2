import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCarPoolingReq2 {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        List<MemberCar> memberCars = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: \n\t 1) Add a Member \n\t 2) Add a Car  \n\t"
            		+ " 3) Assign Car to Member (Assume valid data is supplied) \n\t"
            		+ " 4) Cars Owned \n\t 5) Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMember(members, scanner);
                    break;
                case 2:
                    addCar(cars, scanner);
                    break;
                case 3:
                    assignCar(members, cars, memberCars, scanner);
                    break;
                case 4:
                    CarsOwnedByMember(memberCars, scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void addMember(List<Member> members, Scanner scanner) {
        // Read member information from the user
        System.out.println("id:");
        Long memberId = scanner.nextLong();
        System.out.println("first name:");
        String firstName = scanner.next();
        System.out.println("last name:");
        String lastName = scanner.next();
        System.out.println("email:");
        String email = scanner.next();
        System.out.println("contact number:");
        String contactNumber = scanner.next();
        System.out.println("license number:");
        String licenseNumber = scanner.next();
        System.out.println("license start date:");
        String licenseStartDate = scanner.next();
        System.out.println("license expiry date:");
        String licenseExpiryDate = scanner.next();

        // Create a new member object and add it to the list of members
        Member member = new Member(memberId, firstName, lastName, email, contactNumber, licenseNumber,
                licenseStartDate, licenseExpiryDate);
        members.add(member);

        System.out.println("Member added successfully.");
    }

    private static void addCar(List<Car> cars, Scanner scanner) {
        // Read car information from the user
        System.out.println("id:");
        Long carId = scanner.nextLong();
        System.out.println("name:");
        String name = scanner.next();
        System.out.println("model:");
        String model = scanner.next();
        System.out.println("makeYear:");
        Integer makeYear = scanner.nextInt();
        System.out.println("company:");
        String company = scanner.next();
        System.out.println("comfort level:");
        Integer comfortLevel = scanner.nextInt();

        // Create a new car object and add it to the list of cars
        Car car = new Car(carId, name, model, makeYear, company, comfortLevel);
        cars.add(car);

        System.out.println("Car added successfully.");
    }

    private static void assignCar(List<Member> members, List<Car> cars, List<MemberCar> memberCars, Scanner scanner) {
        System.out.println("member car id:");
        Long memberCarId = scanner.nextLong();
        System.out.println("member id:");
        Long memberId = scanner.nextLong();
        System.out.println("car id:");
        Long carId = scanner.nextLong();
        System.out.println("car registration:");
        String carRegistrationNumber = scanner.next();
        System.out.println("color:");
        String carColor = scanner.next();

        // Find the member and car objects by their IDs
        Member member = Member.findMember(memberId, members);
        Car car = Car.findCar(carId, cars);

        if (member != null && car != null) {
            // Create a new MemberCar object and add it to the list of member cars
            MemberCar memberCar = new MemberCar(memberCarId, member, car, carRegistrationNumber, carColor);
            memberCars.add(memberCar);
            System.out.println("Car assigned to member successfully.");
        } else {
            System.out.println("MEMBER OR CAR NOT FOUND");
        }
    }

    private static void CarsOwnedByMember(List<MemberCar> memberCars, Scanner scanner) {
        System.out.println("member id:");
        Long memberId = scanner.nextLong();

        // Find the member cars associated with the given member ID
        List<String> ownedCarRegistrations = new ArrayList<>();
        for (MemberCar memberCar : memberCars) {
            if (memberCar.getMember().getId().equals(memberId)) {
                ownedCarRegistrations.add(memberCar.getCarRegistrationNumber());
            }
        }

        if (ownedCarRegistrations.isEmpty()) {
            System.out.println("No cars owned by the member.");
        } else {
            System.out.println("Number of cars: " + ownedCarRegistrations.size());
            System.out.println("Registration Numbers:");
            for (String carRegistration : ownedCarRegistrations) {
                System.out.println(carRegistration);
            }
        }
    }
}

