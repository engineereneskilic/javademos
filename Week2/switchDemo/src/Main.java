public class Main {
    public static void main(String[] args) {
        char grade = 'C';
        //
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel A aldınız");
                break;
            case 'B':
            case 'C':
                System.out.println("Çok güzel: Geçtiniz");
                System.out.println("Güzel: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena değil geçtiniz");
                break;
            case 'F':
                System.out.println("AA kaldınız..");
                break;
            default:
                System.out.println("Geçersiz not girdiniz !");
        }
    }
}
