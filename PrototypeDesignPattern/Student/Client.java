public class Client {
    public static void main(String args[]) {
        StudentDetails std = new StudentDetails(20, 7, "Keyuri");

        StudentDetails stdclone = new StudentDetails();
        stdclone.age = std.age;
        stdclone.rollNo = std.rollNo;
        stdclone.name = std.name;
    }
}
