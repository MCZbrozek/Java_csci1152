// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week9: Address
/* Purpose: Create Address class, instantiate and compare
* objects. 
* --- Files associated with this assignment
* Address.Java & Main.java
 */

public class Main {
    public static void main(String[] args) {

        // Instantiate and test Address constructors
        // Empty
        Address add1 = new Address();
        // With streetNumber and streetName only
        Address add2 = new Address(34, "Waltz Way");
        // With all three data fields
        Address add3 = new Address(45, "Rock Ave", "New Mexico");

        // Prints each Address object as defined above, using the toString Override
        // defined in Address.java
        String address1 = add1.toString();
        String address2 = add2.toString();
        String address3 = add3.toString();

        System.out.println("These are the 3 address objects: ");
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);

        // call the isNeighbor method on the add1 object to see if add2 or add3 is their
        // neighbor
        Boolean add2Result = add1.isNeighbor(add2);
        Boolean add3Result = add1.isNeighbor(add3);
        System.out.printf("\nIs %s the neighbor of %s? %b", address1, address2, add2Result);
        System.out.printf("\nIs %s the neighbor of %s? %b", address1, address3, add3Result);

    }

}
