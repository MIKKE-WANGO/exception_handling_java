public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        GradesManager gradesManager = new GradesManager();
        gradesManager.addStudent(student1);
        gradesManager.addStudent(student2);

        // Attempt to assign valid and invalid grades
        gradesManager.assignGrade(student1.getName(), 85); // Valid grade
        gradesManager.assignGrade(student2.getName(), 110); // Invalid grade
        gradesManager.assignGrade(student2.getName(), 70); // Valid grade

        // Print student grades
        gradesManager.printStudentGrades();


        //Hospital Management   
        Patient patient = new Patient("John");

        try {
            patient.setAge(30); // Valid age
            System.out.println("Patient's age set successfully: " + patient.getAge());
            
            patient.setAge(-5); // Invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
