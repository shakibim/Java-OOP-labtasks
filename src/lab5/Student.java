
package lab5;

class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    public Student() {}

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public double getStudentCGPA() { return studentCGPA; }

    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setStudentCGPA(double studentCGPA) { this.studentCGPA = studentCGPA; }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}



