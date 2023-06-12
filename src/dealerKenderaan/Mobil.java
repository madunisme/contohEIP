
package dealerKenderaan;


public class Mobil extends Kenderaan {
    private String jenis;
    public Mobil (String merek, String warna, int tahun, String jenis){
        super (merek,warna,tahun);
        this.jenis = jenis;  
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    @Override
    public void info (){
        System.out.println("Brand Mobil ini adalah " + getMerek());
        System.out.println("Mobil ini berwarna " + getWarna());
        System.out.println("yang keluar pada tahun " + getTahun());
        System.out.println("dengan Jenis Mobil" + getJenis());
    }
    
    
}
