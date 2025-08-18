
package lab_test;

public class Patient {
    private int PatientID;
    private boolean isCorona;
    private int age;
    private double bodyTemperature;
    private double oxygenSaturation;

    public double getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(double oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public static int getNumberOfPatients() {
        return numberOfPatients;
    }

    public static void setNumberOfPatients(int numberOfPatients) {
        Patient.numberOfPatients = numberOfPatients;
    }
    private static int numberOfPatients=0;
    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public boolean isIsCorona() {
        return isCorona;
    }

    public void setIsCorona(boolean isCorona) {
        this.isCorona = isCorona;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public static int  getNumberOfPatient() {
        return numberOfPatients;
    }

    public void setNumberOfPatient(int numberOfPatient) {
        this.numberOfPatients = numberOfPatient;
    }

    public Patient(int PatientID, boolean isCorona, int age, double bodyTemperature, int numberOfPatient,double oxygenSatuation) {
        this.PatientID = PatientID;
        this.isCorona = isCorona;
        this.age = age;
        this.oxygenSaturation=oxygenSatuation;
        this.bodyTemperature = bodyTemperature;
        this.numberOfPatients = numberOfPatient;
    }
    
    public Patient(int PatientID, boolean isCorona, int age, double bodyTemperature) {
        numberOfPatients++;
        this.PatientID = numberOfPatients;
        this.isCorona = isCorona;
        this.age = age;
        this.bodyTemperature = bodyTemperature;
        
    }

    public Patient( boolean isCorona, int age, double oxygenSatuation) {
        numberOfPatients++;
        this.PatientID = numberOfPatients;
        this.isCorona = isCorona;
        this.age = age;
        this.oxygenSaturation=oxygenSatuation;
        this.bodyTemperature = 100;
        this.bodyTemperature = 36.5;
    }

    @Override
    public String toString() {
        return "Patient{" + "PatientID=" + PatientID + ", isCorona=" + isCorona + ", age=" + age + ", bodyTemperature=" + bodyTemperature + ", oxygenSaturation=" + oxygenSaturation + '}';
    }
     
}
