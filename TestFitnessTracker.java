import java.util.Scanner;
import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter activity >> ");
        String activity = input.nextLine();

        System.out.print("Enter minutes spent " + activity + " >> ");
        int minutes = input.nextInt();

        System.out.print("Enter month >> ");
        int month = input.nextInt();

        System.out.print("Enter day >> ");
        int day = input.nextInt();

        System.out.print("Enter year >> ");
        int year = input.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        FitnessTracker tracker1 = new FitnessTracker(activity, minutes, date);
        FitnessTracker tracker2 = new FitnessTracker(); 

        System.out.println("\nActivity log:");
        System.out.println(tracker1.getActivity() + " " + tracker1.getMinutes() +
                " minutes on " + tracker1.getDate());
        System.out.println(tracker2.getActivity() + " " + tracker2.getMinutes() +
                " minutes on " + tracker2.getDate());
    }
}