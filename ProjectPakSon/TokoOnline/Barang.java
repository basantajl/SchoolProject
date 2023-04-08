package TokoOnline;

import java.util.ArrayList;
public class Barang {
    
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    
    public Barang() {
        this.namaBarang.add("Susu UHT");
        this.stok.add(15);
        this.harga.add(10000);

        this.namaBarang.add("Roti O ");
        this.stok.add(30);
        this.harga.add(5000);

        this.namaBarang.add("Rujak heroic");
        this.stok.add(20);
        this.harga.add(15000);
    }

    
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public void setStok(int stok ){
        this.stok.add(stok);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);;
    }

    
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
}

