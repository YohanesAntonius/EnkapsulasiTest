
package EnkapsulasiTest;

/**
 *
 * @author Lenovo
 */
 
class EncapsulationDemo{
    private int Nim;
    private String Nama;
    private int Umur;
    private String Fakultas;

    //Getter and Setter methods
    public int getNim(){
        return Nim;
    }

    public String getNama(){
        return Nama;
    }

    public int getUmur(){
        return Umur;
    }
    
     public String getFakultas(){
        return Fakultas;
    }

    public void setNim(int nim){
        Nim = nim;
    }

    public void setNama(String nama){
        Nama = nama;
    }

    public void setUmur(int umur){
        Umur = umur;
    }
    
     public void setFakultas(String fakultas){
        Fakultas = fakultas;
    }
}
     public class EncapsTest{
     public static void main(String[] args) {    
     EncapsulationDemo obj = new EncapsulationDemo();
         obj.setNama("Yohanes Antonius");
         obj.setNim(1714321010);
         obj.setUmur(24);
         obj.setFakultas("Teknik Informatika");
         System.out.println("Nama    : " + obj.getNama());
         System.out.println("Nim     : " + obj.getNim());
         System.out.println("Umur    : " + obj.getUmur()); 
         System.out.println("Fakultas: " + obj.getFakultas());
    }
    
}
