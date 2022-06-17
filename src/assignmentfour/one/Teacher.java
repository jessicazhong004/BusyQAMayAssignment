public class Teacher {

    public String designation;
    public String collegeName;

    public void does(){
        System.out.println("This is a " + this.designation + "who works at " + this.collegeName + ".");
    }

    public Teacher(String designation, String collegeName) {
        this.designation = designation;
        this.collegeName = collegeName;
    }

    public ComputerTeacher(String designation, String collegeName) {
        super(designation, collegeName);
    }

    public static void main(String[] args) {
        ComputerTeacher computerTeacher = new ComputerTeacher("ComputerTeacher", "NotBusyQA");
        Teacher teacher = new Teacher("Teacher", "BusyQA");

        computerTeacher.does();
        teacher.does();
    }
}
