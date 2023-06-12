
package EIP;


public class Buku {
    private String jenis, judul;
    private int tahunTerbit;
    
    public Buku(String jenis, String judul, int tahunTerbit){
        this.jenis = jenis;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJenis() {
        return jenis;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    
    
    public void info(){
        System.out.println("Ini adalah " + jenis);
        System.out.println("Yang Berjudul " + judul);
        System.out.println("Yang Terbit pada Tahun " + tahunTerbit);
    }
    
    
    
    
}
