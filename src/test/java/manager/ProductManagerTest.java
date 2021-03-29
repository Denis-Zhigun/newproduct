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
    void shouldSearchBySmartPhoneName() {
        Product[] expected = {new Smartphone(1, "Iphone", 100, "China")};
        Product[] actual = manager.searchBy("Iphone");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByNull() {
        Product[] actual = manager.searchBy("Siemens");
        Product[] expect = { };

        assertArrayEquals(expect, actual);
    }

    @Test
    void shouldSearchBySeveralBooks() {
        Product[] expected = {
                new Book(6, "War and piece", 200, "Tolstoy"),
                new Book(7, "War and piece", 200, "Tolstoy")};
        Product[] actual = manager.searchBy("Tolstoy");
        assertArrayEquals(expected, actual);

    }



}