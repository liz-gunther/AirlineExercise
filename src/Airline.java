public class Airline {

    PersonClass[] seats;

    public Airline() {
        this.seats = new PersonClass[11];
    }

    public PersonClass getPerson(int index) {
        return new PersonClass(this.seats[index]);
    }

    public void setPerson(PersonClass person) {
        this.seats[person.getSeatNumber() - 1] = new PersonClass(person);
    }

    public void createReservation(PersonClass person) {
        while (seats[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }

        int index = person.getSeatNumber() - 1;
        seats[index] = new PersonClass(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java Airlines. Your seat number is: "
        + person.getSeatNumber() + ".\n");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.seats.length; i++) {
            if (seats[i] != null) {
                temp += seats[i].toString();
                temp += "\n\n";
            } else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }

        }
        return temp;
    }
}
