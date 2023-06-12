
package dealerKenderaan;

public class Kenderaan {
   private String merek,warna;
   private int tahun;
   
   public Kenderaan(String merek, String warna, int tahun){
       this.merek = merek;
       this.warna = warna;
       this.tahun = tahun;
   }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    public int getTahun() {
        return tahun;
    }
   
    public void info(){
        System.out.println("Brand Kenderaan ini adalah " + merek);
        System.out.println("yang Berwana " + warna);
        System.out.println("yang keluar pada Tahun " + tahun);
    }
   
}
