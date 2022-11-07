public class MyClass {
    private String fullName;
    private int age;
    private String[] courses;
    private String favoriteFood;

    public MyClass(String fullName, int age, String[] courses, String favoriteFood){
        this.fullName = fullName;
        this.age = age;
        this.courses = courses;
        this.favoriteFood = favoriteFood;

    }
    public MyClass(String fullName, String favoriteFood){
        this.fullName = fullName;
        this.favoriteFood = favoriteFood;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String[] getCourses() {

        return courses;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
