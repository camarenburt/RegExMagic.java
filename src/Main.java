import java.util.Scanner;
public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your SSN is: " + InputHelper.getRegExString(scan, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}"));
        System.out.println("Your Student M Number is: " + InputHelper.getRegExString(scan, "Enter your Student M Number", "(M|m)\\d{5}"));
        System.out.println("You choose: " + InputHelper.getRegExString(scan, "Menu:  O - Open  S - Save  V - View  Q - Quit", "[OoSsVvQq]"));
    }
}