package tugas03;

public class MakeupPWajah extends Makeup{
    private String namaMakeup;
    private String Untuk;
    
    void throttle(){
        System.out.println("Ini Adalah Sabun Pembersih Wajah ^_^ ");
    }

    public String getNamaMakeup() {
        return namaMakeup;
    }

    public void setNamaMakeup(String namaMakeup) {
        this.namaMakeup = namaMakeup;
    }

    public String getUntuk() {
        return Untuk;
    }

    public void setUntuk(String Untuk) {
        this.Untuk = Untuk;
    }
    
    
}
