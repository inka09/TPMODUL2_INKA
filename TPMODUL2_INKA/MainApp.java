public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat perangkat1 = new Perangkat("Adata", 2, 1.80f);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Seagate", 8, 2.48f, true);
        laptop1.informasi();
        laptop1.bukaGame("Dota");
        laptop1.kirimEmail("inkasharatu9@gmail.com");
        laptop1. kirimEmail("inkasharatu@student.telkomuniversity.ac.id", "japiri@student.telkomuniversity.ac.id");
        System.out.println("");

        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(62821158);
        handphone1.kirimSMS(6281123);
        handphone1.kirimSMS(628543, 628214);
    }
}