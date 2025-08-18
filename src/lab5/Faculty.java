
package lab5;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {}

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public int getFacultyId() { return facultyId; }
    public String getFacultyName() { return facultyName; }
    public String getFacultyPosition() { return facultyPosition; }

    public void setFacultyName(String facultyName) { this.facultyName = facultyName; }
    public void setFacultyPosition(String facultyPosition) { this.facultyPosition = facultyPosition; }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition;
    }
}
