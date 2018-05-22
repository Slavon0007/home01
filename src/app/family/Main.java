package app.family;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();


        Parents parents = new Parents();
        parents.toString();
        Family family = new Family();
    }
    public static void print(Child object){System.out.print(object.toString());}

}
