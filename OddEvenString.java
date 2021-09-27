import java.util.Scanner;

public class OddEvenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] sArr = new String[t + 1];
        for (int i = 0; i <= t; i++) {
            String sTemp = sc.nextLine();
            sArr[i] = sTemp;
        }
        String oddStr = "", evenStr = "";
        for (int i = 1; i <= t; i++) {
            String tempS = sArr[i];
            oddStr = "";
            evenStr = "";
            for (int j = 0; j < tempS.length(); j++) {
                if (j % 2 == 0) {
                    evenStr += tempS.charAt(j);
                } else {
                    oddStr += tempS.charAt(j);
                }
            }
            System.out.println(oddStr + " " + evenStr);
        }
        sc.close();

    }
}
