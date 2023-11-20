public class Student {
    private String name;
    private int age;
    private String address;
    private Courses[] courses;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }



    public Student(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
