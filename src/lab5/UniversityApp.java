
package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversityApp {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Faculty> faculties = new ArrayList<>();

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n===== University Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Print");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1: addMenu(); break;
                case 2: deleteMenu(); break;
                case 3: updateMenu(); break;
                case 4: printMenu(); break;
                case 5: searchMenu(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }

    static void addMenu() {
        System.out.println("a. Add a Student\nb. Add a Course\nc. Add a Faculty");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a': addStudent(); break;
            case 'b': addCourse(); break;
            case 'c': addFaculty(); break;
        }
    }

    static void addStudent() {
        System.out.print("Enter Student ID: "); int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: "); String name = sc.nextLine();
        System.out.print("Enter CGPA: "); double cgpa = sc.nextDouble();
        students.add(new Student(id, name, cgpa));
    }

    static void addCourse() {
        sc.nextLine();
        System.out.print("Enter Course ID: "); String cid = sc.nextLine();
        System.out.print("Enter Course Title: "); String title = sc.nextLine();
        System.out.print("Enter Credit: "); double credit = sc.nextDouble();
        courses.add(new Course(cid, title, credit));
    }

    static void addFaculty() {
        System.out.print("Enter Faculty ID: "); int fid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Faculty Name: "); String fname = sc.nextLine();
        System.out.print("Enter Faculty Position: "); String fpos = sc.nextLine();
        faculties.add(new Faculty(fid, fname, fpos));
    }

    static void deleteMenu() {
        System.out.println("a. Delete a Student\nb. Delete a Course\nc. Delete a Faculty");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
                System.out.print("Enter Student ID: "); int sid = sc.nextInt();
                students.removeIf(s -> s.getStudentId() == sid);
                break;
            case 'b':
                sc.nextLine();
                System.out.print("Enter Course ID: "); String cid = sc.nextLine();
                courses.removeIf(c -> c.getCourseId().equals(cid));
                break;
            case 'c':
                System.out.print("Enter Faculty ID: "); int fid = sc.nextInt();
                faculties.removeIf(f -> f.getFacultyId() == fid);
                break;
        }
    }

    static void updateMenu() {
        System.out.println("a. Update a Student\nb. Update a Course\nc. Update a Faculty");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
                System.out.print("Enter Student ID: "); int sid = sc.nextInt();
                for(Student s : students) {
                    if(s.getStudentId() == sid) {
                        sc.nextLine();
                        System.out.print("Enter New Name: "); s.setStudentName(sc.nextLine());
                        System.out.print("Enter New CGPA: "); s.setStudentCGPA(sc.nextDouble());
                    }
                }
                break;
            case 'b':
                sc.nextLine();
                System.out.print("Enter Course ID: "); String cid = sc.nextLine();
                for(Course c : courses) {
                    if(c.getCourseId().equals(cid)) {
                        System.out.print("Enter New Title: "); c.setCourseTitle(sc.nextLine());
                        System.out.print("Enter New Credit: "); c.setCredit(sc.nextDouble());
                    }
                }
                break;
            case 'c':
                System.out.print("Enter Faculty ID: "); int fid = sc.nextInt();
                for(Faculty f : faculties) {
                    if(f.getFacultyId() == fid) {
                        sc.nextLine();
                        System.out.print("Enter New Name: "); f.setFacultyName(sc.nextLine());
                        System.out.print("Enter New Position: "); f.setFacultyPosition(sc.nextLine());
                    }
                }
                break;
        }
    }

    static void printMenu() {
        System.out.println("a. Print all students\nb. Print all courses\nc. Print all faculties\nd. Print student info\ne. Print course info\nf. Print faculty info\ng. Print student list & faculty of a course\nh. Print courses taken by a student");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a': students.forEach(System.out::println); break;
            case 'b': courses.forEach(System.out::println); break;
            case 'c': faculties.forEach(System.out::println); break;
            case 'd':
                System.out.print("Enter Student ID: "); int sid = sc.nextInt();
                students.stream().filter(s -> s.getStudentId()==sid).forEach(System.out::println);
                break;
            case 'e':
                sc.nextLine();
                System.out.print("Enter Course ID: "); String cid = sc.nextLine();
                courses.stream().filter(c -> c.getCourseId().equals(cid)).forEach(System.out::println);
                break;
            case 'f':
                System.out.print("Enter Faculty ID: "); int fid = sc.nextInt();
                faculties.stream().filter(f -> f.getFacultyId()==fid).forEach(System.out::println);
                break;
            case 'g':
                sc.nextLine();
                System.out.print("Enter Course ID: "); String ccid = sc.nextLine();
                for(Course c : courses) {
                    if(c.getCourseId().equals(ccid)) {
                        c.printStudentList();
                        System.out.println("Faculty: " + (c.getFaculty()!=null?c.getFaculty():"None"));
                    }
                }
                break;
            case 'h':
                System.out.print("Enter Student ID: "); int stid = sc.nextInt();
                for(Course c : courses) {
                    for(Student s : c.getStudentList()) {
                        if(s.getStudentId() == stid) System.out.println(c);
                    }
                }
                break;
        }
    }

    static void searchMenu() {
        System.out.println("a. Search Student\nb. Search Course\nc. Search Faculty\nd. Check if student takes a course\ne. Check if faculty teaches a course\nf. Search courses taken by student\ng. Search courses taught by faculty");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'a':
                System.out.print("Enter Student ID: "); int sid = sc.nextInt();
                students.stream().filter(s -> s.getStudentId()==sid).forEach(System.out::println);
                break;
            case 'b':
                sc.nextLine();
                System.out.print("Enter Course ID: "); String cid = sc.nextLine();
                courses.stream().filter(c -> c.getCourseId().equals(cid)).forEach(System.out::println);
                break;
            case 'c':
                System.out.print("Enter Faculty ID: "); int fid = sc.nextInt();
                faculties.stream().filter(f -> f.getFacultyId()==fid).forEach(System.out::println);
                break;
            case 'd':
                System.out.print("Enter Student ID: "); int stid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Course ID: "); String ccid = sc.nextLine();
                for(Course c : courses) {
                    if(c.getCourseId().equals(ccid)) {
                        boolean found = c.getStudentList().stream().anyMatch(s -> s.getStudentId()==stid);
                        System.out.println(found?"Yes":"No");
                    }
                }
                break;
            case 'e':
                System.out.print("Enter Faculty ID: "); int fid2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Course ID: "); String ccid2 = sc.nextLine();
                for(Course c : courses) {
                    if(c.getCourseId().equals(ccid2)) {
                        if(c.getFaculty()!=null && c.getFaculty().getFacultyId()==fid2) System.out.println("Yes");
                        else System.out.println("No");
                    }
                }
                break;
            case 'f':
                System.out.print("Enter Student ID: "); int stid2 = sc.nextInt();
                for(Course c : courses) {
                    for(Student s : c.getStudentList()) {
                        if(s.getStudentId() == stid2) System.out.println(c);
                    }
                }
                break;
            case 'g':
                System.out.print("Enter Faculty ID: "); int fid3 = sc.nextInt();
                for(Course c : courses) {
                    if(c.getFaculty()!=null && c.getFaculty().getFacultyId()==fid3) System.out.println(c);
                }
                break;
        }
    }
}

