public class Main {
    public static void main(String[] args){
        String ogrenci1="Kutay";
        String ogrenci2="Abdullah";
        String ogrenci3="Yunus";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Kutay";
        ogrenciler[1]="Abdullah";
        ogrenciler[2]="Yunus";
        System.out.println("-----------------------------");

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);

        }
        System.out.println("-----------------------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}