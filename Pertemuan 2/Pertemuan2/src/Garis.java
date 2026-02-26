/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 26 Februari 2026
 */

import org.w3c.dom.css.Counter;
public class Garis {
    /*************** ATRIBUT ***************/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/
    Garis(Titik T1, Titik T2){
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }

    Garis(){
        this(new Titik(), new Titik(1,1));
        counterGaris++;
    }
    /*************** METHOD ***************/
    void printGaris(){
        System.out.println("(" + awal.getAbsis() + "," + awal.getOrdinat() + ")" + " - " + "(" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

}
