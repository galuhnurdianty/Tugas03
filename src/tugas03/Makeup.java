package tugas03;
public class Makeup {
   private String merk;
   private String jenis;
   private String nomor;
   private double harga;
  
    void cetakInfo(){
  System.out.println("Merk \t: "+merk+"\n"+
                "Jenis \t: "+jenis+"\n"+
                "Nomor \t:"+nomor+"\n"+
                "Harga \t:"+harga);
  }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
