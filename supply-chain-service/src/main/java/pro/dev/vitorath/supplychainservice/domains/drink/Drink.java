package pro.dev.vitorath.supplychainservice.domains.drink;

import lombok.Data;
import pro.dev.vitorath.supplychainservice.domains.Temperature;
import pro.dev.vitorath.supplychainservice.domains.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity @Data
public class Drink implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 40, unique = true)
    private UUID publicId;
    @Column(nullable = false, length = 75)
    private String name;
    @Column(nullable = false, scale = 16, precision = 4)
    private BigDecimal price;
    @Column(nullable = false, length = 15)
    private Temperature temperature;
    @OneToOne @JoinColumn(name = "product_id")
    private Product product;

}
