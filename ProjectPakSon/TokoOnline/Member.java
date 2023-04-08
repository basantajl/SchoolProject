package TokoOnline;
import java.util.ArrayList;
public class Member implements User{
  
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();


public Member()  {
    this.namaMember.add("adi");
    this.alamat.add("sawojajar");
    this.telepon.add("92929292");
    this.saldo.add(100000000);
    
    this.namaMember.add("Rusdi");
    this.alamat.add("ngawi jateng");
    this.telepon.add("92992929");
    this.saldo.add(111111111);
}  
public void setSaldo(int saldo){
    this.saldo.add(saldo);
}
public int getSaldo(int idMember){
    return this.saldo.get(idMember);
}
public void edtisaldo(int idMember, int saldo ){
    this.saldo.set(saldo, idMember);
}
public int getJumlMember(){
   return this.saldo.size();
}

    
    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
       this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
      this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
       return this.telepon.get(idMember);
    }

    void editSaldo(int idMember, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getJmlMember() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
