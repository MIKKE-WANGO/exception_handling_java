public class Patient {
    private String name;
    private int age;

    public Patient(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Invalid age provided: " + age + ". Age must be between 0 and 130.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
