package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting. ");
        System.out.println("Version 2.0.");
        double fTmp = 15;
        double cTmp = 100;
        System.out.println("Result is " + convFrgToCls(fTmp) + " Cails. ");
        System.out.println("Result is " + convClsToFrg(cTmp)+ " Farengeits. ");
    }
    private static double convFrgToCls(double fTmp) {
        return (fTmp - 32)/1.8 ;
    }

    private static double convClsToFrg(double fCls) {
        return fCls*1.8 + 32 ;
    }
}
