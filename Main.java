public class Main {
  public static void main(String[] args) {
    // Membuat objek dari kelas Mobil
    Mobil mobilSaya = new Mobil("Toyota", "Merah", 2020, 150000000);
    Mobil mobilLain = new Mobil("Honda", "Hitam", 2023, 250000000);

    // Mengakses properti objek
    System.out.println("Merk: " + mobilSaya.merk);
    System.out.println("Warna: " + mobilSaya.warna);
    System.out.println("Tahun: " + mobilSaya.tahun);
    System.out.println("Harga: " + mobilSaya.harga);

    // Memanggil metode objek
    mobilSaya.promosiMobil();

    mobilSaya.diskonMobil();

    mobilLain.lainMobil();
  }
}