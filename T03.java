// 12S24055 Theresia Oktaviani Samosir
// 12S24016 Boy Harendy Simamora

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, formatbuku, kat, tub, diskon;
        int stok, tahunterbit;
        double margin, rating, hargabeli, katdiskon;

        do {
            isbn = input.nextLine();
            if (isbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                hargabeli = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kat = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kat = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kat = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kat = "Average";
                            } else {
                                kat = "Low";
                            }
                        }
                    }
                }
                katdiskon = margin / hargabeli * -1;
                if (katdiskon >= 0.4) {
                    diskon = "Once in a lifetime";
                } else {
                    if (katdiskon >= 0.2) {
                        diskon = "Never come twice";
                    } else {
                        if (katdiskon > 0) {
                            diskon = "No regret";
                        }
                    }
                }
                if (kat.equals("Best pick ") && diskon.equals("once in lifetime")) {
                    tub = "The ultimate best";
                } else {
                    tub = "---";
                }
                System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + toFixed(hargabeli,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + rating + "|" + kat + "|" + diskon + "|" + tub);
            }
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
