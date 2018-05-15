import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Mahasiswa> myMhs = new ArrayList<Mahasiswa>();
        Mahasiswa mhs1 = new Mahasiswa("A11","Antum","90","80","80");
        Mahasiswa mhs2 = new Mahasiswa("A12","Anta","95","70","81");

        myMhs.add(mhs1);
        myMhs.add(mhs2);

        Iterator iterator = myMhs.iterator();
        System.out.println("Pakai Iterator");
        System.out.println("====================================================");
        while (iterator.hasNext()){
            Mahasiswa m = (Mahasiswa) iterator.next();
            System.out.println("Nim :\t"+m.getNim());
            System.out.println("Nama :\t"+m.getNama());
            System.out.println("Tugas :\t"+m.getTugas());
            System.out.println("UTS :\t"+m.getUts());
            System.out.println("UAS :\t"+m.getUas());
            System.out.println("-------------------------------------------------");
        }
        System.out.println("====================================================");
        System.out.println("Pakai For");
        System.out.println("====================================================");
        for (Mahasiswa m : myMhs){
            System.out.println("Nim :\t"+m.getNim());
            System.out.println("Nama :\t"+m.getNama());
            System.out.println("Tugas :\t"+m.getTugas());
            System.out.println("UTS :\t"+m.getUts());
            System.out.println("UAS :\t"+m.getUas());
            System.out.println("-------------------------------------------------");
        }
    }

    public static class Mahasiswa{
        public String nim,nama,tugas,uts,uas;

        public Mahasiswa(String nim, String nama, String tugas, String uts, String uas) {
            this.nim = nim;
            this.nama = nama;
            this.tugas = tugas;
            this.uts = uts;
            this.uas = uas;
        }

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getTugas() {
            return tugas;
        }

        public void setTugas(String tugas) {
            this.tugas = tugas;
        }

        public String getUts() {
            return uts;
        }

        public void setUts(String uts) {
            this.uts = uts;
        }

        public String getUas() {
            return uas;
        }

        public void setUas(String uas) {
            this.uas = uas;
        }
    }
}
