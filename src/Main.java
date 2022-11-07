import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] courses = {"java","english","soft skills"};

        MyClass myClass = new MyClass("Erkinbaev Kurstan", 19, courses,"plov");
        MyClass myClass1 = new MyClass("Altynbek Shakirov","dymdama");



            System.out.printf("""
                    full name: %s
                    age: %d
                    courses: %s
                    favorite food: %s
                    ------------------------
                    
                    """,
                    myClass.getFullName(), myClass.getAge(), Arrays.toString(myClass.getCourses()), myClass.getFavoriteFood());

            System.out.printf("""
                    full name: %s
                    favorite food: %s""",
                    myClass1.getFullName(),myClass1.getFavoriteFood());


    }
}