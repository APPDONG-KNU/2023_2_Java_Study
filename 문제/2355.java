import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    long result;
    if (a <= b) {
      result = (b + a) * (b + 1 - a) / 2;
    } else {
      result = (a + b) * (a + 1 - b) / 2;
    }

    System.out.println(result);
  }
}
