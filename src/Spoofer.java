import java.util.Random;

public class Spoofer {
    public class hwid {
        public static void SpoofHwid(String hwid) {
            // Change the hwid to the one specified
            System.out.println("Spoofing hwid to " + hwid + ".");

        }

        public static String GetHwid() {
            String hwid = System.getenv("COMPUTERNAME") + System.getProperty("user.name") + System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("PROCESSOR_LEVEL");
            return hwid;
        }

        public static String GenerateHwid() {
            int[] hwid = new int[34];

            int i = 0;
            Random rand = new Random();

            System.out.println("Generating hwid...");

            while (i < 34) {
                hwid[i] = rand.nextInt(16);
                i++;
            }

            // turn the array into a string
            String newhwid = "";
            for (int j = 0; j < hwid.length; j++) {
                newhwid += hwid[j];
            }

            System.out.println("Generated hwid: " + newhwid);
            return newhwid;
        }
    }
}