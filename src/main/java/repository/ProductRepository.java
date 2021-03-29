package repository;


import domain.Book;
import domain.Product;
import domain.Smartphone;

public class ProductRepository {

    private Product[] items = {
            new Smartphone(1, "Iphone", 100, "China"),
            new Smartphone(2, "Nokia", 200, "Euro"),
            new Smartphone(3, "LG", 300, "USA"),
            new Book(4, "Faust", 200, "Goethe"),
            new Book(5, "Fiesta", 200, "Hemingway")


    };


    public void save(Product item){
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Product[] findAll(){

        return items;
    }


    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }


}