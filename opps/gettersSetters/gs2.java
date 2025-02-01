package gettersSetters;

public class gs2 {
    String name ;
    private int roll;

    public int getRoll() { // getter -> the value of privet
        return roll;
    }

    public void setRoll(int x) { //setter -> to set the value of privet
        //this.roll = roll;
         // if we write "public void setRoll(int roll)"
        // compiler thught both "roll" are same . using "this" => this.roll is return roll
        roll = x;
    }
}
