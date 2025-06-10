public class Main {
    public static void main(String[] args) {
        Colokan colokan = new Colokan();
        KipasAngin kipasAngin = new KipasAngin();
        Lampu lampu = new Lampu();
        Televisi televisi = new Televisi();

        System.out.println("=== PERCOBAAN LISTRIK ===");
        colokan.alirkanListrik();
        colokan.cabutListrik();

        System.out.println("");
        System.out.println("=".repeat(50));
        System.out.println("");

        System.out.println("========= PERCOBAAN 1 : KIPAS ANGIN =========");
        colokan = kipasAngin;
        colokan.alirkanListrik();
        kipasAngin.aturKecepatan(20);
        kipasAngin.aturKecepatan("15");
        colokan.cabutListrik();

        System.out.println("");
        System.out.println("=".repeat(50));
        System.out.println("");

        System.out.println("========= PERCOBAAN 2 : LAMPU =========");
        colokan = lampu;
        colokan.alirkanListrik();
        colokan.cabutListrik();

        System.out.println("");
        System.out.println("=".repeat(50));
        System.out.println("");

        System.out.println("========= PERCOBAAN 3 : TELEVISI =========");
        colokan = televisi;
        colokan.alirkanListrik();
        colokan.cabutListrik();
    }
}
