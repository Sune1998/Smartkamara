import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kamera v1.0");

        Smartkamera suneskamera = new Smartkamera();


        suneskamera.retning = "N";
        suneskamera.dato = 10.09;
        suneskamera.tid = 13.33;
        suneskamera.pivot = 30;
        suneskamera.latandlong = 300;

        System.out.println("welcome");
        System.out.println("Enter login info");
        Scanner login = new Scanner(System.in);
        double logininfo = login.nextDouble();




        suneskamera.start();
        suneskamera.stopoptag();


    }
}
