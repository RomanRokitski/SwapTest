package swap;

import java.util.Scanner;

public class FlowersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new FlowersSwapping().swap(scanner.nextInt()));
        scanner.close();
    }
}