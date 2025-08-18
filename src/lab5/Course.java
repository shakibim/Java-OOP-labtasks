
package lab5;

import java.util.ArrayList;

class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<>();
    private Faculty faculty;

    public Course() {}

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() { return courseId; }
    public String getCourseTitle() { return courseTitle; }
    public double getCredit() { return credit; }
    public Faculty getFaculty() { return faculty; }

    public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }
    public void setCredit(double credit) { this.credit = credit; }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void dropStudent(int studentId) {
        studentList.removeIf(s -> s.getStudentId() == studentId);
    }

    public void addFaculty(Faculty f) {
        this.faculty = f;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        if(studentList.isEmpty()) {
            System.out.println("No students enrolled in this course.");
        } else {
            for(Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit;
    }
}
