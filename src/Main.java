import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void println(String message) {
        System.out.println(message);
    }

    public static void print(String message) {
        System.out.print(message);
    }

    public static void cmdhanlder(String cmd) {
        Spoofer spoof = new Spoofer();

        if (cmd == "help") {
            println("\n== Commands ==");
            println("get hwid\nspoof hwid\n");
        } else if (cmd == "get hwid") {
            println(Spoofer.hwid.GetHwid());
        } else if (cmd == "spoof hwid") {
            String newhwid = Spoofer.hwid.GenerateHwid();
            Spoofer.hwid.SpoofHwid(newhwid);
        } else {
            println(cmd + " is not a valid command.");
        }
    }

    public static void main(String[] args) {
        Spoofer spoof = new Spoofer();
        Scanner input = new Scanner(System.in);

        while (true) {
            println("Type 'help' for commands.");
            print("\nCommand: ");
            String cmd = input.nextLine();

            cmdhanlder(cmd);
        }
    }
}