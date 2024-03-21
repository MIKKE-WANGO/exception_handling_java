import java.util.ArrayList;
import java.util.List;

public class GradesManager {
    private List<Student> students;
    private List<Integer> grades;

    public GradesManager() {
        students = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrade(String studentName, int grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Invalid grade: " + grade);
            }
            grades.add(grade);
            System.out.println("Grade assigned successfully to student: " + studentName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for student: " + studentName);
        }
    }
    public void printStudentGrades() {
        if (students.size() != grades.size()) {
            System.out.println("Error: Number of students and grades don't match.");
            return;
        }
        System.out.println("Student Grades:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + ": " + grades.get(i));
        }
    }
}
