public class Main {
    public static void main(String[] args) {
        //For
        for (int i=1;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti..");

        int i=0;
        while (i<10){
            i++;
            System.out.println(i);
        }
        System.out.println("While döngüsü bitti.");


        i=0;
        do{
            i+=2;
            System.out.println(i);
        }while (i<10);

        System.out.println("do While döngüsü bitti.");
    }
}
