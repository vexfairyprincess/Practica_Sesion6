package University;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating Coordination objects
        Coordination coordination1 = new Coordination(101, "Mathematics Coordination");

        // Creating Faculty object and adding Coordination objects
        Faculty faculty = new Faculty("Engineering Building", 1, "Engineering Faculty", coordination1);
        faculty.addCoordination(102, "Science Coordination");

        // Creating Professor object and associating with a Coordination
        Professor professor = new Professor("José", "434sp", "Duran", "BS.", coordination1);

        // Displaying the details using toString methods
        System.out.println("Faculty Details:");
        System.out.println(faculty);

        System.out.println("\nCoordination List in Faculty:");
        ArrayList<Coordination> coordinationList = faculty.showCoordinationList();
        for (Coordination coord : coordinationList) {
            System.out.println(coord);
        }

        System.out.println("\nProfessor Details:");
        System.out.println(professor);
    }
}