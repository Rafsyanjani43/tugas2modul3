
public class PersegiPanjang {


    /*
    @params
    memanggil_method
     */

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        double panjang = 5.0;
        double lebar = 3.0;

        double luas = hitungLuas(panjang, lebar);

        System.out.println("Luas dari persegi panjang dengan panjang " + panjang +
                " dan lebar " + lebar + " adalah " + luas);
    }
}