public class DemoPolimorfisme {
    public static void main(String[] args) {
        BangunRuang kubus = new Kubus(5);
        BangunRuang balok = new Balok(10, 5, 3);
        
        System.out.println("--- Perhitungan Kubus ---");
        System.out.println("Sisi: 5");
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
        
        System.out.println("\n--- Perhitungan Balok ---");
        System.out.println("Panjang: 10, Lebar: 5, Tinggi: 3");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());
    }
}