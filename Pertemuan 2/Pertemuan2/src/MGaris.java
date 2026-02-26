public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis(new Titik(), new Titik());
        G1.printGaris();
        G1.awal.setAbsis(10);
        G1.awal.setOrdinat(12);
        G1.akhir.setAbsis(1);
        G1.akhir.setOrdinat(1);
        G1.printGaris();
    }
}
