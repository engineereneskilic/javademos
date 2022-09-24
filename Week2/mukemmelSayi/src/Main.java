public class Main {
    public static void main(String[] args) {
        // 6 --> 1,2,3 bölünür
        // 28 --> 1,2,4,7,14 bölünür ve toplarsan 28 eder

        int number = 28;

        int total=0;

        for (int i=1;i<number;i++){
            if (number % i == 0) { // bölünür
                total = total + i; // bölünen sayıyı topla
            }
        }

        if(total== number) {
            System.out.println("Mükemmel sayıdır..");
        } else {
            System.out.println("Mükemmel sayı deildir");
        }

    }
}
