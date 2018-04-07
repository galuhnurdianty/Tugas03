package tugas03;
public class MakeupAksii {
    public static void main(String[] args) {
        Makeup m = new Makeup();
       m.setMerk("Wardah");
       m.setJenis("Matte");
       m.setNomor("07");
       m.setHarga(55000);
       m.cetakInfo();
       
    System.out.println("====================================");
    System.out.print("Merknya \t: ");
    System.out.println(m.getMerk());
    System.out.print("Jenisnya \t: ");
    System.out.println(m.getJenis());
    System.out.print("Nomornya \t: ");
    System.out.println(m.getNomor());
    System.out.print("Harganya \t: ");
    System.out.println(m.getHarga());
    
    System.out.println("***********************************");
    MakeupGiincu mg = new MakeupGiincu();
    mg.setMerk("Viva");
    mg.setJenis("Gel");
    mg.setNomor("09");
    mg.setHarga(25000);
    mg.setNamaMakeup("Lip Tint");
    mg.cetakInfo();
    System.out.println("Nama Makeupnya \t:"+mg.getNamaMakeup());
    mg.throttle();
    }
}
