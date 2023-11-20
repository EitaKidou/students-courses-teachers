public class Courses {
    public static int idd ;
    public int id;
    private String name;
    private int numberOfStudents;
    private Teacher teacher;

    public Courses( String name, int numberOfStudents) {
        this.id = ++idd;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Courses.idd = idd;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", teacher=" + teacher +
                '}';
    }
}


