package pro.dev.vitorath.supplychainservice.domains.meal;

import lombok.Data;
import pro.dev.vitorath.supplychainservice.domains.product.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable @Data
public class MealProductPk implements Serializable {

    @ManyToOne @JoinColumn(name = "meal_id")
    private Meal meal;
    @ManyToOne @JoinColumn(name = "product_id")
    private Product product;

}
