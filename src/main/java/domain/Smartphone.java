package domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Smartphone extends Product{

    private String madeIn;

    public Smartphone(long id, String name, int price, String madeIn) {
        super(id, name, price);
        this.madeIn = madeIn;
    }
}
