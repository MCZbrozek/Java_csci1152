// Name: Michael Zbrozek
// Class: 1152:101
// Assignment: Week6: FishStore
// Purpose: Take fish information from user, recommend tank size
/* FileNames: "FishTankStore.java"
 * "Fish.java
 * TankHelper.java"
 */
public class Fish {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    boolean aggressive = false;

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(String aggressive) {
        if (aggressive.equalsIgnoreCase("y")) {
            this.aggressive = true;
        }
    }

}
