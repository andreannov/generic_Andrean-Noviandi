package kelasPengganti;

public class cobaGeneric {
    public static void main(String[] args) {
        //Membuat Instance dan Mendefinisikan Tipe Data String
            generic<String> nama = new generic()();
            nama.setOrang("Wildan");
            System.out.println("Nama Saya: "+nama.getOrang());

        //Membuat Instance dan Mendefinisikan Tipe Data Integer
            generic<Integer> umur = new generic()();
            umur.setOrang(19);
            System.out.println("Usia Saya: "+umur.getOrang()+" Tahun");

        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
            generic<Boolean> kondisi = new generic()();
            kondisi.setOrang(true);
            System.out.println("Saya Sedang Belajar Java: "+kondisi.getOrang());

        //Membuat Instance dan Mendefinisikan Tipe Data Float
            generic<Float> IPK = new generic();
            IPK.setOrang(3.5f);
            System.out.println("Nilai IPK Saya: "+IPK.getOrang());
            
        //Membuat Instance dan Mendefinisikan Tipe Data Character
            generic<Character> Karakter = new generic()();
            Karakter.setOrang('W');
            System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getOrang());
    }
}
