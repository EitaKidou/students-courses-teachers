import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Courses course1 = new Courses("Java", 10);
        Courses course2 = new Courses("Python", 20);
        Courses course3 = new Courses("C++", 30);
        Courses course4 = new Courses("C#", 40);
        Courses course5 = new Courses("JavaScript", 50);
        Courses courses7 = new Courses("PHP", 60);
        Courses courses8 = new Courses("HTML", 70);
        Courses courses9 = new Courses("CSS", 80);
        Courses courses10 = new Courses("SQL", 90);
        Courses courses11 = new Courses("Ruby", 100);



        Teacher teacher1 = new Teacher("John", "Java", 10);
        Teacher teacher2 = new Teacher("Jack", "Python", 20);
        Teacher teacher3 = new Teacher("Jim", "C++", 30);
        Teacher teacher4 = new Teacher("James", "C#", 40);
        Teacher teacher5 = new Teacher("Jill", "JavaScript", 50);
        Teacher teacher6 = new Teacher("Jenny", "PHP", 60);
        Teacher teacher7 = new Teacher("Jade", "HTML", 70);
        Teacher teacher8 = new Teacher("Jasmine", "CSS", 80);
        Teacher teacher9 = new Teacher("Jocelyn", "SQL", 90);
        Teacher teacher10 = new Teacher("Abdy", "Ruby", 100);

        teacher1.setCourses(course1);
        teacher2.setCourses(course2);
        teacher3.setCourses(course3);
        teacher4.setCourses(course4);
        teacher5.setCourses(course5);
        teacher6.setCourses(courses7);
        teacher7.setCourses(courses8);
        teacher8.setCourses(courses9);
        teacher9.setCourses(courses10);
        teacher10.setCourses(courses11);

        course1.setTeacher(teacher1);
        course2.setTeacher(teacher2);
        course3.setTeacher(teacher3);
        course4.setTeacher(teacher4);
        course5.setTeacher(teacher5);
        courses7.setTeacher(teacher6);
        courses8.setTeacher(teacher7);
        courses9.setTeacher(teacher8);
        courses10.setTeacher(teacher9);
        courses11.setTeacher(teacher10);


        Student student1 = new Student("John", 16, "address1");
        Student student2 = new Student("Jack", 20, "address2");
        Student student3 = new Student("Jim", 30, "address3");
        Student student4 = new Student("James", 40, "address4");
        Student student5 = new Student("Jill", 50, "address5");
        Student student6 = new Student("Jenny", 60, "address6");
        Student student7 = new Student("Jade", 70, "address7");

        student1.setCourses(new Courses[]{course1, course2});
        student2.setCourses(new Courses[]{course2, course3});
        student3.setCourses(new Courses[]{course3, course4});
        student4.setCourses(new Courses[]{course4, course5});
        student5.setCourses(new Courses[]{course5, courses7});
        student6.setCourses(new Courses[]{courses7, courses8});
        student7.setCourses(new Courses[]{courses8, courses9});


        Database database = new Database();
        database.setCourses(new Courses[]{course1, course2, course3, course4, course5, courses7, courses8, courses9, courses10, courses11});
        database.setTeachers(new Teacher[]{teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7, teacher8, teacher9, teacher10});
        database.setStudents(new Student[]{student1, student2, student3, student4, student5, student6, student7});
//        System.out.println(database.addNewTeacher(new Teacher("Jolene", "Ruby", 100)));


         while (true) {
             System.out.println("""
                        | 1. Add new teacher
                        | 2. Add new student
                        | 3. Add new course
                        | 4. Remove teacher
                        | 5. Remove student
                        | 6. Remove course
                        | 7. Update teacher
                        | 8. Update student
                        | 9. Update course
                        |10. Find Teacher by name
                        |11. Find Student by name
                        |12. Find Course by name
                        |13. Find Teacher by specialization
                        |14. List Teachers
                        |15. List Students
                        |16. List Courses
                        |17. Search Courses by index
                        |18. List Students By Course
                        |19. List Courses By Teacher
                        |20. List Courses By Student
                        |21. List Teachers By Course
                        |22. List Students By Teacher
                        |23. List Teachers By Student
                     """);

             System.out.println("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
           switch (choice)
           {
               case 1:
                   System.out.println("Enter teacher name: ");
                   String name = scanner.next();
                   System.out.println("Enter teacher specialization: ");
                   String specialization = scanner.next();
                   System.out.println("Enter teacher stage: ");
                   int stage = scanner.nextInt();
                   Teacher teacher = new Teacher(name, specialization, stage);
                   System.out.println(database.addNewTeacher(teacher));
                   break;
                case 2:
                    System.out.println("Enter student name: ");
                    String name1 = scanner.next();
                    System.out.println("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter student address: ");
                    String address = scanner.next();
                    Student student = new Student(name1, age, address);
                    System.out.println(database.addNewStudent(student));
                    break;
               case 3:
                   System.out.println("Enter course name: ");
                   String name2 = scanner.next();
                   System.out.println("Enter number of students: ");
                   int numberOfStudents = scanner.nextInt();
                   Courses courses = new Courses(name2, numberOfStudents);
                   System.out.println(database.addNewCourse(courses));
                   break;
               case 4:
                   System.out.println("Enter teacher name: ");
                   String name3 = scanner.next();
                   System.out.println(database.removeTeacher(name3));
                   break;
               case 5:
                   System.out.println("Enter student name: ");
                   String name4 = scanner.next();
                   System.out.println(database.removeStudent(name4));
               case 6:
                   System.out.println("Enter course name: ");
                   String name5 = scanner.next();
                   System.out.println(database.removeCourse(name5));
                   break;
               case 7:
                   String nameTeacher = scanner.next();
                   String spec = scanner.next();
                   int stage11 = scanner.nextInt();
                   Teacher teahcer = new Teacher(nameTeacher,spec,stage11);
                   database.updateTeacher("John", teahcer);
                   break;
               case 8:
                   String nameStudent = scanner.next();
                   int age221 = scanner.nextInt();
                   String adress = scanner.next();
                   Student student8 = new Student(nameStudent,age221,adress);
                   database.updateStudent("John", student8);
                   break;
               case 9:
                   String nameCourse = scanner.next();
                   int numberOfStudents11 = scanner.nextInt();
                   Courses courses1 = new Courses(nameCourse,numberOfStudents11);
                   database.updateCourse("Java", courses1);
                   break;
               case 10:
                   System.out.println("Enter teacher name:");
                   String namee = scanner.next();
                   database.findTeacherByName(namee);
                   break;
               case 11:
                   System.out.println("Enter student name:");
                   String nameee = scanner.next();
                   database.findStudentByName(nameee);
                   break;
               case 12:
                   System.out.println("Enter course name:");
                   String nameeee = scanner.next();
                   database.findCourseByName(nameeee);
                   break;
               case 13:
                   System.out.println("Enter spec name::");
                   String specc = scanner.next();
                   database.findTeacherBySpec(specc);
                   break;
               case 14:
                   database.listTeachers();
                   break;
               case 15:
                   database.listStudents();
                   break;
               case 16:
                   database.listCourses();
                   break;
               case 17:
                   database.searchCourseByIndex(2);
                   break;
               case 18:
                   System.out.println(Arrays.toString(database.listStudentsByCourse("Java")));
                   break;
               case 19:
                   System.out.println(Arrays.toString(database.listCoursesByTeacher("Jack")));
                   break;
               case 20:
                   System.out.println(Arrays.toString(database.listCoursesByStudent("John")));
                   break;
               case 21:
                   System.out.println(Arrays.toString(database.listTeachersByCourse("Java")));
               case 22:
                   System.out.println(Arrays.toString(database.listStudentsByTeacher("Jack")));
               case 23:
                   System.out.println(Arrays.toString(database.listTeachersByStudent("John")));


           }
         }




//        Programmer programmer = new Programmer("Abu","young","Google" );
//        System.out.println(programmer);
//        programmer.coding();
//        programmer.eat();
//        programmer.walk();
//        programmer.learn();
//
//
//        Dancer dancer = new Dancer("Adyl","old","CS2");
//        System.out.println(dancer);
//        dancer.dencing();
//        dancer.eat();
//        dancer.walk();
//        dancer.learn();
//
//
//
//
//        Singer singer = new Singer("Ainazik","young","BlackPink");
//        System.out.println(singer);
//        singer.singing();
//        singer.playGitar();
//        singer.eat();
//        singer.walk();
//        singer.learn();
//
//


    }
}