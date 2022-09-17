public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;

        //System.out.println(remainder);
        boolean isPrime = true;

        //2 den 23'e kadar hiçbir sayı bölemedi
        if (number==1){
           // System.out.println("Sayı asal değidir");
            isPrime=false;
        }


        if(number<1){
            System.out.println("Geçersiz sayı");
            isPrime=false;
        }

        for (int i=2;i<number;i++){
           if(number % i == 0){
               isPrime=false;
           }
        }

        if(isPrime) {
            System.out.println("Sayı asaldıır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }
}
