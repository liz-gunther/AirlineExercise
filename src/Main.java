import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        PersonClass[] people = new PersonClass[]{
                new PersonClass("Cleopatra", "Egypt", "69 BC", 1),
                new PersonClass("Alexander the Great", "Macedon", "356 BC", 2),
                new PersonClass("Julius Caesar", "Rome", "100 BC", 3),
                new PersonClass("Hannibal", "Carthage", "247 BC", 4),
                new PersonClass("Confucius", "China", "551 BC", 5),
                new PersonClass("Pericles", "Greece", "429 BC", 6),
                new PersonClass("Spartacus", "Thrace", "111 BC", 7),
                new PersonClass("Marcus Aurelius", "Rome", "121 AD", 8),
                new PersonClass("Leonidas", "Greece", "540 BC", 9),
                new PersonClass("Sun Tzu", "China", "544 BC", 10),
                new PersonClass("Hammurabi", "Babylon", "1750 BC", 10),
        };

        Airline airline = new Airline();
        for (int i = 0; i < people.length; i++) {
            if (people[i].applyPassport() == true) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            }
        }

        System.out.println("****************** RESERVATIONS COMPLETE! ******************" + "\n" + airline);
    }
}