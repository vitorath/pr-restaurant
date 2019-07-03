package pro.dev.vitorath.supplychainservice.domains.meal;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity(name = "meal_product")
public class MealProduct implements Serializable {

    @EmbeddedId
    private MealProductPk primaryKeys;
    @Column(nullable = false, scale = 16, precision = 4)
    private BigDecimal productPurchasePrice;
    @Column(nullable = false, precision = 4)
    private Double amount;

}
