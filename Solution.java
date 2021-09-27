import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private int age;

    Person(int initialAge) {
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void yearPasses() {
        age++;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int age = sc.nextInt();
            a.add(age);
        }
        for (int i = 0; i < a.size(); i++) {
            Person p = new Person(a.get(i));
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println("");
        }
    }
}