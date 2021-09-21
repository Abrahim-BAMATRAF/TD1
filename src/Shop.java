import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        boolean finish = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the stock name");
        String stockName = scan.next();
        System.out.println("Enter the stock address");
        String stockAddress = scan.next();
        Stock stock = new Stock(stockName,stockAddress);

        while(!finish) {



            //creating the products
            boolean createProduct = false;

            System.out.println("Do you want to create a product?(y/n)");
            String answer = scan.next();
            if(answer.contains("y")) {
                createProduct = true;
            }else {
                createProduct = false;
            }

            while(createProduct) {
                System.out.println("every product you create will be added to the stock \n");
                System.out.println("Enter the product name");
                String productName = scan.next();
                System.out.println("Enter the product quantity");
                int productQuantity = scan.nextInt();

                stock.addProduct(new Product(productName,productQuantity));

                System.out.println("do you want to continue adding other products?(y/n)");
                System.out.println("\n");
                answer = scan.next();
                if(answer.contains("y")) {
                    createProduct = true;
                }else {
                    createProduct = false;
                }
            }

            //Showing the products
            boolean showProduct = false;

            System.out.println("Do you want to show the info of a product?(y/n)");
            answer = scan.next();
            if(answer.contains("y")) {
                showProduct = true;
            }else {
                showProduct = false;
            }

            while(showProduct){
                System.out.println("Enter the name of the produc you want to see the info of");
                String nameGivenByUser = scan.next();
                System.out.println("here");
                System.out.println(nameGivenByUser);
                stock.nameToProduct(nameGivenByUser).display();

                System.out.println("Do you want to show the info of a product?(y/n)");
                answer = scan.next();
                if(answer.contains("y")) {
                    showProduct = true;
                }else {
                    showProduct = false;
                }

            }

            //ajouter/retirer une quantité d'un produit donné au stock.

            //Showing the products
            boolean changeQuantity = false;

            System.out.println("Do you want to change the quantity of a product?(y/n)");
            answer = scan.next();
            if(answer.contains("y")) {
                changeQuantity = true;
            }else {
                changeQuantity = false;
            }

            while(changeQuantity){
                System.out.println("Enter the name of the produc you want to change it's quantity");
                String nameOfProductToChange = scan.next();
                System.out.println("Enter the Quantity");
                int quantity = scan.nextInt();
                System.out.println("Enter (add/take)");
                String addOrTake = scan.next();

                if(addOrTake.contains("add")){
                    stock.nameToProduct(nameOfProductToChange).addToQuantity(quantity);
                }

                if(addOrTake.contains("take")){
                    stock.nameToProduct(nameOfProductToChange).takeFromQuantity(quantity);
                }


                System.out.println("Do you want to change the quantity of a product?(y/n)");
                answer = scan.next();
                if(answer.contains("y")) {
                    changeQuantity = true;
                }else {
                    changeQuantity = false;
                }

            }





            System.out.println("Do you want to Exit the program?(y/n)");
            answer = scan.next();
            if(answer.contains("y")) {
                finish = true;
            }else {
                finish = false;
            }




        }






        scan.close();

    }




}