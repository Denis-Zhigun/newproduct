package manager;


import domain.Book;
import domain.Product;
import domain.Smartphone;
import repository.ProductRepository;

public class ProductManager {

    private ProductRepository repository;

    ProductManager(ProductRepository repository){
        this.repository=repository;
    }


    public void add(Product item) {
        repository.save(item);
    }


    public Product[] searchBy(String name) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, name)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (book.getAuthor().equalsIgnoreCase(search)) {
                return true;
            }
        }
        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (smartphone.getName().equalsIgnoreCase(search)) {
                return true;
            }
            if (smartphone.getMadeIn().equalsIgnoreCase(search)) {
                return true;
            }
        }
        return false;
    }



}