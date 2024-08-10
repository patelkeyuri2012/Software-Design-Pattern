public class Main {
    public static void main(String args[]) {
        Student std = new Student(20, 7, "Keyuri");
        Student stdclone = (Student) std.clone();
    }
}
