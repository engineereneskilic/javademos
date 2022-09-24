public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        int toplanan = topla(5,12);
        int coklutoplam = topla(5,6,7,8,10,6,9);
        System.out.println("İki sayının toplamı: "+toplanan);
        System.out.println("Çoklu sayıların toplamı: "+coklutoplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){

        return sayi1 + sayi2;
    }

    public static  int topla(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar)
               toplam+= sayi;
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
