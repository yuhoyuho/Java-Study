package chapter12;
import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class _06GenericType {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);

    }
    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
