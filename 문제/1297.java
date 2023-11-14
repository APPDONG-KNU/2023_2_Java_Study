import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int d = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();

    double x = Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2));
    x = Math.pow(x, 0.5);

    h = (int) Math.floor(h * x);
    w = (int) Math.floor(w * x);

    System.out.println(h + " " + w);
  }
}
