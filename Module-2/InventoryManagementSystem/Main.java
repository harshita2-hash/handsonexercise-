public class Main {


    public static void main(String args[]) {


        InventoryManagement obj = new InventoryManagement();



        obj.addProduct(
            new Product(101,"Laptop",10,55000)
        );


        obj.addProduct(
            new Product(102,"Mouse",50,500)
        );



        System.out.println("\nInventory:");

        obj.displayInventory();



        obj.updateProduct(101,15,52000);



        System.out.println("\nAfter Update:");

        obj.displayInventory();



        obj.deleteProduct(102);



        System.out.println("\nAfter Delete:");

        obj.displayInventory();

    }
}