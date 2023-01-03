package app_states._02_app_start;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0.1.");
        double miles = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(miles);
        System.out.println(kmsRes + " kms in " + miles + " miles.");
        double milesRes = convertKmsToMiles(kms);
        System.out.println(milesRes + " miles in " + kms + " kms.");
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}