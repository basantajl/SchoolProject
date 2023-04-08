package Employee;
public class Employee {
   int nip, gaji = 500000, bonus , potongan , waktukerja, pajak;
   String name, status ;
   
   public void setNip (int nip){
       this.nip = nip;
   }
   public void setName (String  name ){
       this.name = name;
   }
   
   void display (){
       System.out.println("\nNomor Induk Pegawai :"+this.nip);
       System.out.println("Nama : "+this.name);
       System.out.println("Status : "+this.status);
       System.out.println("Waktu kerja : "+this.waktukerja+"jam");       
   }
   void hitung (int waktu , String status){
       this.waktukerja = waktu ;
       this.status = status ; 
       if(waktu >=8){
           potongan  = 150000;
       }
       else {
           potongan = -10000;
       }
       if  (status.equalsIgnoreCase("menikah")){
           bonus = 10000;
       }
       else {
           bonus = 10000;
       }
       this.gaji+=bonus +potongan ;
       }
   void hitung (){
       this.pajak = this.gaji-(this.gaji*2/100);
   }
   }

