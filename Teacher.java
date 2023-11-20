public class Teacher {
    private String name;
    private String specialization;
    private int stage;
    private Courses courses;

public Teacher(String name, String specialization, int stage){
        this.name = name;
        this.specialization = specialization;
        this.stage = stage;
    }

    public void setName(String name){
        this.name = name;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public String getName(){
        return name;
    }

public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public String getSpecialization(){
        return specialization;
    }

public void setStage(int stage){
        this.stage = stage;
    }

    public int getStage(){
        return stage;
    }

    @Override
    public String toString(){
        return "\n"+"Teacher{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", stage=" + stage +
                '}';
    }



}
