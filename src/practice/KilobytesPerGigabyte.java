package practice;

public class KilobytesPerGigabyte {
    public static void main(String[] args) {
        double kilobytes = 324534272;
//Вычисляем, сколько килобайт в одном гигабайте
        double kilobytesPerGigabyte = 1024 * 1024;
        double gigabytes = kilobytes / kilobytesPerGigabyte;

        System.out.println("Вот столько килобайт (в экспоненциальной форме):");
        System.out.println(kilobytes);
        System.out.println("Это столько гигабайт:");
        System.out.println(gigabytes);
    }
}
