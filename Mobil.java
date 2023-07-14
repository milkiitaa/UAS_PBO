public class Mobil {
  // Variabel instance
  String merk;
  String warna;
  int tahun;
  int harga;

  // Constructor
  public Mobil(String merk, String warna, int tahun, int harga) {
    this.merk = merk;
    this.warna = warna;
    this.tahun = tahun;
    this.harga = harga;
  }

  // Metode
  public void promosiMobil() {
    System.out
        .println("Dijual Mobil " + merk + " Warna " + warna + " Keluaran Tahun " + tahun + " dengan harga Rp." + harga);
  }

  // Metode
  public void diskonMobil() {
    this.harga = harga - 10000000;
    System.out
        .println("Pembeli tercepat mendapat harga diskon Rp. " + harga);
  }

  // Metode
  public void lainMobil() {
    System.out
        .println("Tersedia juga Mobil " + merk + " Warna " + warna + " Keluaran Tahun " + tahun
            + " dengan harga Rp." + harga);
  }
}