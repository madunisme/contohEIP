
package EIP;


public class Komik extends Buku {
    private String genre;
    
    public Komik (String jenis, String judul, String genre, int tahunTerbit){
    super(jenis, judul, tahunTerbit); 
    this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public void info(){
      System.out.println("Ini adalah " + getJenis() );
      System.out.println("Yang Berjudul " + getJudul());
      System.out.println("Yang Terbit pada Tahun " + getTahunTerbit());
      System.out.println("Yang ber Genre " + getGenre());
    }
    
    public void info(String keterangan){
      System.out.println("");
      System.out.println("Ini adalah " + getJenis() );
      System.out.println("Yang Berjudul " + getJudul());
      System.out.println("Yang Terbit pada Tahun " + getTahunTerbit());
      System.out.println("Yang ber Genre " + getGenre());
      System.out.println("Penerbit :" + keterangan);
    }
}
