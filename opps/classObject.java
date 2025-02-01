public class classObject {
    // create the new class
    public static class Student{
        // initilaze the data type
        int roll;
        double percentage;
        String name;
    }
    public static void main(String[]args){
        Student x = new Student(); // object
        x.name="akash";
        x.roll=001;
        x.percentage=99.9;

        System.out.println(x.name);
    }
}
