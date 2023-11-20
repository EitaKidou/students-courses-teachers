import java.util.Arrays;

public class Database {
    private Courses [] courses;
    private Student [] students;
    private Teacher [] teachers;

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    public String addNewTeacher(Teacher teacher){
        Teacher [] teachers1 ;
        teachers1= Arrays.copyOf(teachers, teachers.length + 1);
        teachers1[teachers1.length - 1] = teacher;
        teachers = teachers1;
        return "Teacher added successfully";
    }

    public String addNewStudent(Student student){
        Student students1 [] ;
        students1= Arrays.copyOf(students, students.length + 1);
        students1[students1.length - 1] = student;
        students = students1;
        return "Student added successfully";
    }

    public String addNewCourse(Courses course){
        Courses [] courses1 ;
        courses1= Arrays.copyOf(courses, courses.length + 1);
        courses1[courses1.length - 1] = course;
        courses = courses1;
        return "Course added successfully";
    }


    public Teacher [] getAllTeachers() {
            return teachers;
    }
    public  void findTeacherBySpec(String spec) {
        Teacher [] teacher = new Teacher[teachers.length];
        int counter =0;
        for (int i = 0; i < teachers.length ; i++) {
            if (teachers[i].getSpecialization().equals(spec)) {
                teacher[i]=teachers[i];
                counter++;
            }
        }
        Teacher[] teachers1 = Arrays.copyOf(teacher,counter);
        System.out.println(Arrays.toString(teachers1));
    }
    public void findTeacherByName(String name){
        Teacher []teacher = new Teacher[teachers.length];
        int counter = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getName().equals(name)){
                teacher[i]=teachers[i];
                counter++;
            }
        }
        Teacher[] teachers1 = Arrays.copyOf(teacher,counter);
        System.out.println(Arrays.toString(teachers1));
    }


    public String removeTeacher( String name){
        Teacher [] newTeachers = new Teacher[teachers.length-1];
        int counter =0;
        for (int i = 0; i < teachers.length ; i++) {
            if (!teachers[i].getName().equals(name)){
                newTeachers[counter] = teachers[i];
                counter++;
            }
        }
        teachers=newTeachers;
        System.out.println(Arrays.toString(getAllTeachers()));
        return "Teacher removed successfully";
    }
    public String removeStudent(String name){
        Student [] students1 = new Student[students.length];
        int counter=0;
        for (int i = 0; i < students.length; i++) {
            if (!students[i].getName().equals(name)){
                students1[counter]=students[i];
                counter++;
            }
        }
        students=students1;
        System.out.println(Arrays.toString(getAllStudent()));
        return "Student removed successfully";
    }
     public Student [] getAllStudent(){
        return students;
    }

    public String removeCourse(String name){
        Courses[] courses1 = new Courses[courses.length];
        int counter=0;
        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].getName().equals(name)){
                courses1[counter]=courses[i];
                counter++;
            }
        }
        courses=courses1;
        System.out.println(Arrays.toString(getAllCourses()));
        return "Course removed successfully";
    }
    public Courses[] getAllCourses (){
        return courses;
    }

    public String updateTeacher(String name,Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i].getName().equals(name))
            {
                teachers[i].setName(teacher.getName());
                teachers[i].setSpecialization(teacher.getSpecialization());
                teachers[i].setStage(teacher.getStage());
                System.out.println(teachers[i]);

            }
        }
        return "Teacher updated successfully";
    }

    public String updateStudent(String name, Student student){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getName().equals(name)) {
                students[i].setName(student.getName());
                students[i].setAge(student.getAge());
                students[i].setAddress(student.getAddress());
                System.out.println(students[i]);
            }
        }
        return "Student updated successfully";
    }

    public String updateCourse(String name ,Courses course){
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getName().equals(name)){
                courses[i].setName(course.getName());
                courses[i].setNumberOfStudents(course.getNumberOfStudents());
                System.out.println(courses[i]);
            }
        }

        return "Course updated successfully";
    }


    public void searchCourseByIndex(int index){
        Courses [] courses1 = new Courses[courses.length];
        int counter =0;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getId()==index){
                courses1[i]=courses[i];
                counter++;
            }
        }
        courses=courses1;
        Courses [] courses2 = Arrays.copyOf(courses1,counter);
        System.out.println(Arrays.toString(courses2));
    }

    public String listTeachers(){
        System.out.println(Arrays.toString(getAllTeachers()));
        return "Teachers listed successfully";
    }

    public String listStudents(){
        System.out.println(Arrays.toString(getAllStudent()));
        return "Students listed successfully";
    }

    public String listCourses(){
        System.out.println(Arrays.toString(getAllCourses()));
        return "Courses listed successfully";
    }

    public void findStudentByName(String name){
        Student [] student = new Student[students.length];
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)){
                student[i]=students[i];
                counter++;
            }
        }
        Student [] students1 = Arrays.copyOf(student,counter);
        System.out.println(Arrays.toString(students1));



    }
    public void findCourseByName (String name){
        Courses [] courses1 = new Courses[courses.length];
        int counter =0;
        for (int i = 0; i < courses.length  ; i++) {
            if (courses[i].getName().equals(name)){
                courses1[i]=courses[i];
                counter++;
            }
        }
        Courses [] courses2 = Arrays.copyOf(courses1,counter);
        System.out.println(Arrays.toString(courses2));

    }






    public Courses[] listCoursesByTeacher(String name){
        Courses [] courses1 = new Courses[courses.length];
        int counter =0;
        for (Courses courses11: courses) {
            if (courses11.getTeacher().getName().equals(name)) {
                courses1[counter] = courses11;
                counter++;
            }
        }

        Courses [] courses11 = Arrays.copyOf(courses1,counter);
        return courses11;
    }
    public Student[] listStudentsByCourse (String name){
        Student[] students1 = new Student[students.length];
        int counter=0;
        for (Student student :students) {
            for (Courses courses1 :student.getCourses()) {
                if (courses1.getName().equals(name)) {
                    students1[counter]=student;
                    counter++;
                }
            }
        }
        students=students1;
        Student[] students11 = Arrays.copyOf(students1,counter);
        return students11;
    }
    public Courses[] listCoursesByStudent(String name){
       Courses[] courses1 = new Courses[courses.length];
        int counter =0;
        for (Student student :students) {
            for (Courses courses2 : student.getCourses()) {
                if (student.getName().equals(name)){
                    courses1[counter]=courses2;
                    counter++;
                }
            }
        }
        courses=courses1;
        Courses [] courses11= Arrays.copyOf(courses1,counter);
        return courses11;
    }

    public Teacher[] listTeachersByCourse(String name){
        Teacher [] teachers1 = new Teacher[teachers.length];
        int counter=0;
        for (Teacher teacher: teachers) {
            if (teacher.getCourses().getName().equals(name)){
                teachers1[counter]=teacher;
                counter++;
            }
        }

        Teacher [] teachers2 = Arrays.copyOf(teachers1,counter);
        return teachers2;
    }

    public Student[] listStudentsByTeacher(String name){
        Student [] students1 = new Student[students.length];
        int counter=0;
        for (Student student: students) {
            for (Courses courses1:student.getCourses()) {
                if (courses1.getTeacher().getName().equals(name)){
                    students1[counter]=student;
                    counter++;
                }
            }
        }
        students=students1;
        Student [] students11 = Arrays.copyOf(students1,counter);
        return students11;
    }

    public Teacher[] listTeachersByStudent(String name){
        Teacher[] teachers1 = new Teacher[teachers.length];
        int counter=0;
        for (Student student: students) {
            for (Courses courses1: student.getCourses()){
                    if (student.getName().equals(name)) {
                        teachers1[counter]=courses1.getTeacher();
                        counter++;
                    }
                }
            }
        teachers=teachers1;
        Teacher[] teachers2 = Arrays.copyOf(teachers1,counter);
        return teachers2;
    }

    public Courses [] listCoursesByStudentName(String studentName){

        return null;
    }

    public Teacher [] listTeachersByStudentName(String studentName){
        return null;
    }

    public Student [] listStudentsByTeacherName(String teacherName){
        return null;
    }

    public Courses [] listCoursesByTeacherName(String teacherName){
        return null;
    }

    public Student [] listStudentsByCourseName(String courseName){
        return null;
    }





    @Override
    public String toString(){
        return "Database{" +
                "courses=" + Arrays.toString(courses) +
                ", students=" + Arrays.toString(students) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }


}
