package domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Book extends Product{

    private String author;

    public Book(long id, String name, int price, String author){
        super(id, name, price);
        this.author = author;
    }

}