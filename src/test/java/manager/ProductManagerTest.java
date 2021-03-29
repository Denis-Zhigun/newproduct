package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;



class ProductManagerTest {

    ProductRepository repository = new ProductRepository();

    ProductManager manager = new ProductManager(repository);

    @Test
    void shouldSearchByBookName() {
        Product[] expected = {new Book(4, "Faust", 200, "Goethe")};
        Product[] actual = manager.searchBy("Faust");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookAuthor() {
        Product[] expected = {new Book(5, "Fiesta", 200, "Hemingway")};
        Product[] actual = manager.searchBy("Hemingway");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartPhoneName() {
        Product[] expected = {new Smartphone(1, "Iphone", 100, "China")};
        Product[] actual = manager.searchBy("Iphone");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartPhoneMadeIn() {
        Product[] expected = {new Smartphone(2, "Nokia", 200, "Euro")};
        Product[] actual = manager.searchBy("Euro");
        assertArrayEquals(expected, actual);
    }



}