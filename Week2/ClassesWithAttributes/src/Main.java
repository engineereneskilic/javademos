public class Main {
    public static void main(String[] args) {

        Product product = new Product(12,"Laptop","Süper hızlı oyun bilgisayarı",1250.65,5,"Mavi");
       /*
        product.setName("Laptop");
        product.setId(12);
        product.setDescription(" Süper hızlı oyun bilgisayarı");
        product.setPrice(5000);
        product.setStockAmount(20);
        product.setRenk("Mavi");
        */
        System.out.println(product.getName());



        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());

        /*
        productManager.Add2(1, "dd", "süper", 5, 200);

        productManager.Add2(1, "dd", "süper", 5, 200);
        productManager.Add2(1, "dd", "süper", 5, 200);

        productManager.Add2(1, "dd", "süper", 5, 200);
        */

    }
}
