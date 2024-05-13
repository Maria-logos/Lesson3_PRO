package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting. ");
        System.out.println("Version 1.0.");
        double fTmp = 15;
        double cTmp = convFrgToCls(fTmp);
        System.out.println("Result is " + cTmp + " cails. ");
    }
    private static double convFrgToCls(double fTmp) {
        return (fTmp - 32)/1.8 ;
    }
}
