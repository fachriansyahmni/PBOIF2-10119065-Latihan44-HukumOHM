package pboif2.pkg10119065.latihan44.hukumohm;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program perhitungan hukum ohm 
 *                         dengan objek
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(){
        System.out.println("======Hukum OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat pengatanr tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan\n");
    }
    
    public Baterai(float kuatArus,float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
        System.out.println("Kuat Arus : "+ kuatArus + " ampere");
        System.out.println("Hambatan : "+ hambatan + " ohm");
        System.out.println("Hasil Tegangan : "+ hitungTegangan() + " volt");
    }
    
    public float getKuatArus()
    {
        return kuatArus;
    }
    public float getHambatan()
    {
        return hambatan;
    }
    
    public float hitungTegangan()
    {
        return kuatArus * hambatan;
    }
}
