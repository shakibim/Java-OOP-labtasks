package lab_test;

import java.util.Scanner;

public class HealthDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Patient[] patientArray = new Patient[20];

        for (int i = 0; i < patientArray.length; i++) {
            if (Patient.getNumberOfPatient() <= 2) { // allows only 3 patients
                System.out.println("Is patient no " + i + " Corona positive (true/false)?");
                boolean isCorona = in.nextBoolean();

                System.out.println("Enter the age of patient no " + i + " (0 - 100):");
                int age = in.nextInt();

                System.out.println("Enter the oxygen saturation level of patient no " + i + " (0 - 100):");
                double oxSat = in.nextDouble();

                patientArray[i] = new Patient(isCorona, age, oxSat);

            } else {
                System.out.println("Seat is full");
                break;
            }
        }
        System.out.println("\nNumber of Corona positive patients: " + getTotalCorornaPositiveCount(patientArray));
        System.out.println("\nAll patients affected with oxygen saturation level lower than 70%:");
        printOxSatmt70(patientArray);
        System.out.println("\nAll the patients:");
        printAllPatients(patientArray);
    }

    public static int getTotalCorornaPositiveCount(Patient[] patients) {
        int count = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null && patients[i].isIsCorona()) {
                count++;
            }
        }
        return count;
    }

    public static void printOxSatmt70(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null && patients[i].getOxygenSaturation() < 70) {
                System.out.println(patients[i].toString());
            }

        }
    }

    public static void printAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                System.out.println(patients[i].toString());
            }
        }

    }

}
