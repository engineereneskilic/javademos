public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2,9.3,4.3,5.6};
        double total=0;
        double max=myList[0];

        for (double number:myList){
            total+=number;
            //System.out.println(number);
        }
            System.out.println("Sayıların toplamı: "+total);

        for (double number:myList){
            if(max < number){
                max = number;
            }
            //System.out.println(number);
        }
        System.out.println("Sayıların en büyüğü: "+max);
    }
}
