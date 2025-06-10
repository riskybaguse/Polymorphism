public class KipasAngin extends Colokan {
    private int kecepatan;
    private boolean isOn;

    @Override
    void alirkanListrik() {
        isOn = true;
        kecepatan = 1;
        System.out.println("BRMMM... Kipas Angin telah bergerak! Dengan kecepatan:" + kecepatan);
    }
    @Override
    void cabutListrik() {
        isOn = false;
        kecepatan = 0;
        System.out.println("Wezzz... Kipas Angin perlahan berhenti! Kecepatan menjadi:" + kecepatan);
    }

    void aturKecepatan(int kecepatanBaru) {
        if (isOn = true) {
            kecepatan = kecepatanBaru;
            System.out.println("Kecepatan Kipas Angin berubah menjadi " + this.kecepatan);
        }else {
            System.out.println("Tidak dapat mengubah kecepatan kipas angin karena kipas angin sedang mati!");
        }
    }

    //Overloading
    void aturKecepatan(String kecepatanBaru) {
        if (this.isOn = true) {
            System.out.println("Kecepatan Kipas Angin berubah menjadi '" + kecepatanBaru + "'");
        }else {
            System.out.println("Tidak dapat mengubah kecepatan kipas angin karena kipas angin sedang mati!");
        }
    }
}
