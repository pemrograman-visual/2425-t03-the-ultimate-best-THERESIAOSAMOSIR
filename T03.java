// 12S24055 Theresia Oktaviani Samosir
// 12S24016 Boy Harendy Simamora
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, kET, kET2, kET3;
        String jUDUL;
        String pENULIS;
        int tAHUNTERBIT;
        String pENERBIT;
        String fORMATBUKU;
        double hARGABELI;
        double mINIMUMMARGIN;
        int sTOK;
        double rATING;
        double dISKON;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                jUDUL = input.nextLine();
                pENULIS = input.nextLine();
                tAHUNTERBIT = Integer.parseInt(input.nextLine());
                pENERBIT = input.nextLine();
                fORMATBUKU = input.nextLine();
                hARGABELI = Double.parseDouble(input.nextLine());
                mINIMUMMARGIN = Double.parseDouble(input.nextLine());
                sTOK = Integer.parseInt(input.nextLine());
                rATING = Double.parseDouble(input.nextLine());
                if (rATING >= 4.7) {
                    kET = "Best pick";
                } else {
                    if (rATING >= 4.5) {
                        kET = "Must Pick";
                    } else {
                        if (rATING >= 4.0) {
                            kET = "Recommended";
                        } else {
                            if (rATING >= 3.0) {
                                kET = "Average";
                            } else {
                                kET = "Low";
                            }
                        }
                    }
                }
                dISKON = mINIMUMMARGIN / hARGABELI * -1;
                if (dISKON >= (double) 40 / 100) {
                    kET2 = "Once in a livetime";
                } else {
                    if (dISKON >= (double) 20 / 100) {
                        kET2 = "Never come twice";
                    } else {
                        if (dISKON > 0) {
                            kET2 = "No regret";
                        }
                    }
                }
                if (rATING >= 4.7 && dISKON >= (double) 40 / 100) {
                    kET3 = "The ultimate best";
                } else {
                    kET3 = "---";
                }
                System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGABELI + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING + "|" + kET + "|" + kET2 + "|" + kET3);
            }
        } while (!iSBN.equals("---"));
    }
}
