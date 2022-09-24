public class main {
    public static void main(String[] args) {

        findnNumberinArray();


    }

    //camelCase
    public static void  findnNumberinArray(){
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varmi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varmi=true;
                break;
            }
        }


        if(varmi) {
            MesajVer("Sayı mevcuttur: "+aranacak);
        } else {
            MesajVer("Sayı mevcut değildir: "+aranacak);
        }


    }

    public  static void MesajVer(String mesaj){
        System.out.println(mesaj);
    }


}
