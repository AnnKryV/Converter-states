package app_states._02_app_start;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter for base converting miles in kms");
        System.out.println("Version 1.0.1.");
        double mil = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(mil);
        System.out.println(kmsRes + " kms in " + mil + " miles.");
        double milesRes = convertKmsToMiles(kms);
        System.out.println(milesRes + " miles in " + kms + " kms.");
    }

    private static double convertMilesToKms(double mil) {
        return mil * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}