package assign4;
import java.util.*;

public class ProductMain {
	public static void main(String[] args) {
		Queue<Product> Productqueue = new PriorityQueue<>();
		Productqueue.add(new Product(12,"Flour",45));
        Productqueue.add(new Product(123,"Rice",67));
        Productqueue.add(new Product(1236,"Toothpaste",20));
        Productqueue.add(new Product(1232,"Almonds",500));
        Productqueue.add(new Product(1234,"Tide",400));
        while (!Productqueue.isEmpty()) {
            System.out.println(Productqueue.remove());
        }
	  }

}
