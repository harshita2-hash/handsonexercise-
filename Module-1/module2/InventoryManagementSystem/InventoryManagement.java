import java.util.HashMap;
import java.util.Map;


public class InventoryManagement {


    HashMap<Integer, Product> inventory = new HashMap<>();


    void addProduct(Product product) {

        inventory.put(product.productId, product);

        System.out.println("Product Added");
    }



    void updateProduct(int id, int quantity, double price) {


        if(inventory.containsKey(id)) {

            Product p = inventory.get(id);

            p.quantity = quantity;
            p.price = price;

            System.out.println("Product Updated");

        }
        else {

            System.out.println("Product Not Found");
        }

    }



    void deleteProduct(int id) {


        if(inventory.remove(id)!=null)

            System.out.println("Product Deleted");

        else

            System.out.println("Product Not Found");

    }




    void displayInventory() {


        for(Map.Entry<Integer,Product> item : inventory.entrySet()) {

            item.getValue().displayProduct();

        }
    }
}