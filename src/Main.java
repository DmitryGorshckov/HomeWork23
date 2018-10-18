import ru.gorshckov.basket.BasketImple;
import ru.gorshckov.basket.Product;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        BasketImple basketImple = new BasketImple();
        /*Product meat = new Product("meat");
        Product milk = new Product("milk");
        Product bread = new Product("bread");*/

        basketImple.addProduct("meat",6);  //добавление товара
        basketImple.addProduct("milk",3);
        basketImple.addProduct("bread",2);

        System.out.println(basketImple.getProducts()); // получение списка товара
        System.out.println("=========");
        basketImple.addProduct("potato",5);
        System.out.println(basketImple.getProducts());
        System.out.println("=========");
        basketImple.removeProduct("potato");  // удаление товара по имени
        System.out.println(basketImple.getProducts());
        System.out.println("=========");
        //basketImple.clear(); // очищение корзины
        System.out.println(basketImple.getProductList());
        System.out.println("=========");
        basketImple.updateProductQuantity("meat",4);  // обновление товара в корзине
        System.out.println(basketImple.getProducts());
        System.out.println("=========");
        System.out.println(basketImple.getProductQuantity("meat"));  // получение количества товара по имени




    }
}
