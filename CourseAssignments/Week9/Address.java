// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week9: Address
/* Purpose: Create Address class, instantiate and compare
* objects. 
* --- Files associated with this assignment
* Address.Java & Main.java
 */

public class Address {
    private int streetNumber;
    private String streetName, state;

    /* an empty constructor to initialize 3 instance variables of my choosing */
    public Address() {
        streetNumber = 44;
        streetName = "Rock Ave";
        state = "New Mexico";
    }
    /*
     * a constructor that takes the name and number as input but defaults the state
     * to New Mexico
     */

    public Address(int streetNumber, String streetName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        state = "New Mexico";
    }

    /* a constructor that takes all three pieces of information as input */
    public Address(int streetNumber, String streetName, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.state = state;
    }

    // Set Methods
    // Set a new StreetNumber value, validate.
    public void setStreetNumber(int streetNumber) {
        if (streetNumber <= 0) {
            this.streetNumber = 1;
        } else {
            this.streetNumber = streetNumber;
        }
    }

    // Set a new StreetName value, validate.
    public void setStreetName(String streetName) {
        if (streetName.equals("")) {
            System.out.println("Please enter a Street Name: ");
        } else {
            this.streetName = streetName;
        }
    }

    // Set a new State value, validate.
    public void setState(String state) {
        if (state.equals("")) {
            System.out.println("Please enter a State: ");
        } else {
            this.state = state;
        }
    }

    // Get Methods
    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getState() {
        return state;
    }

    // Override equals method to return true if .this = input
    @Override
    public boolean equals(Object obj) {
        Address a = (Address) obj;

        if (this.streetNumber != a.streetNumber) {
            return false;
        }

        if (this.streetName != a.streetName) {
            return false;
        }

        if (this.state != a.state) {
            return false;
        }

        if (!(a instanceof Address)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return streetNumber + " " + streetName + ", " + state;
    }

    /*
     * isNeighbor method, takes another address as input and returns * true if
     * streetName and state are equal and the streetNumber
     * is off by one
     */
    public Boolean isNeighbor(Address obj) {
        Address a = (Address) obj;
        if (a.streetName.equals(this.streetName) && a.state.equals(this.state)) {
            if (a.streetNumber == this.streetNumber + 1) {
                return true;
            } else if (a.streetNumber == this.streetNumber - 1) {
                return true;
            }
        }

        return false;
    }

}
