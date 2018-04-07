package tugas03;
public class MakeupBedak extends Makeup{
     private String namaMakeup;
    private String tekstureMakeup;
    
    void throttle(){
        System.out.println("Ini Adalah Pupur :) ");
    }

    public String getNamaMakeup() {
        return namaMakeup;
    }

    public void setNamaMakeup(String namaMakeup) {
        this.namaMakeup = namaMakeup;
    }

    public String getTekstureMakeup() {
        return tekstureMakeup;
    }

    public void setTekstureMakeup(String tekstureMakeup) {
        this.tekstureMakeup = tekstureMakeup;
    }
    
    
}
