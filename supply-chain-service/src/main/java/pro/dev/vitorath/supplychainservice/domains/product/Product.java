package pro.dev.vitorath.supplychainservice.domains.product;

import lombok.Data;
import pro.dev.vitorath.supplychainservice.domains.UnitOfMeasurement;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity(name = "products")
public class Product implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 40, unique = true)
    private UUID publicId;
    @Column(nullable = false, length = 75)
    private String name;
    @Column(nullable = false, scale = 16, precision = 4)
    private BigDecimal purchasePrice;
    @Column(nullable = false, precision = 4)
    private Double amount;
    @Column(nullable = false, precision = 4)
    private Double amountUsed;
    @Column(nullable = false, length = 2)
    private UnitOfMeasurement unitOfMeasurement;
    @Column(nullable = false, precision = 4)
    private Double alcoholContent;
    @Column(nullable = false, length = 20)
    private ProductType productType;
    @Column(nullable = false)
    private Boolean available;

}