package pro.dev.vitorath.supplychainservice.domains.craftdrink;

import lombok.Data;
import pro.dev.vitorath.supplychainservice.domains.product.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Embeddable @Data
public class CrafDrinkProductPk implements Serializable {

    @ManyToOne @JoinColumn(name = "craft_drink_id")
    private CraftDrink craftDrink;
    @ManyToOne @JoinColumn(name = "product_id")
    private Product product;

}
