/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Mhs {
    //property............................
    private String nama;
    private float ipk;
    private String nim;
    private String jurusan;
     
    //behavior............................
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIpk(int ipk) {
        this.ipk = ipk;
    }
    public String getNama() {
        return this.nama;
    }
    public float getIpk() {
        return this.ipk;
    }
    public String getNim() {
        return nim;
    }
    public void SetNim(String nim) {
        this.nim = nim;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public class CobaMhs {
    public static void main(String[] args)
    {
        Mhs mhsAdi = new Mhs();
        
        mhsAdi.setNama("Adi Sanjaya");
        System.out.print("Nama Mhs : " + mhsAdi.getNama());
        mhsAdi.setIpk(4);
        System.out.print("Ipk : " + mhsAdi.getIpk());
        mhsAdi.SetNim("a12.2021.06705");
        System.out.print("Nim : " + mhsAdi.getNim());
        mhsAdi.setJurusan("sistem informasi");
        System.out.print(mhsAdi + "Jurusan : " + mhsAdi.getJurusan());
    }
}
}
