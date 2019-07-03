package pro.dev.vitorath.supplychainservice.domains.craftdrink;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity @Data
public class CraftDrinkProduct implements Serializable {

    @EmbeddedId
    private CrafDrinkProductPk primaryKeys;
    @Column(nullable = false, scale = 16, precision = 4)
    private BigDecimal productPurchasePrice;
    @Column(nullable = false, precision = 4)
    private Double amount;

}
