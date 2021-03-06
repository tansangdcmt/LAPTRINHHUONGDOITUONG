package kiemtraLTHDT;

public class Album {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private float giaThanh;

    public Album(){

    }
    public Album(int maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh){
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTuaCD() {
        return tuaCD;
    }
 
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBaiHat() {
        return soBaiHat;
    }
 
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    @Override
    public String toString(){
        return "Album{" +"cD=" + maCD +", tenCD='" + tuaCD + ", caSy='" + caSy +", soBaiHat=" + soBaiHat +", giaThanh=" + giaThanh +"}";
    }
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tuaCD,caSy,soBaiHat,giaThanh);
    }


}
