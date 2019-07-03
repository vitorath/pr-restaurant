package pro.dev.vitorath.supplychainservice.domains.craftdrink;

import lombok.Data;
import pro.dev.vitorath.supplychainservice.domains.UnitOfMeasurement;
import pro.dev.vitorath.supplychainservice.domains.Temperature;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity @Data
public class CraftDrink implements Serializable {

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
    @Column(nullable = false, precision = 4)
    private Double alcoholContent;
    @Column(nullable = false, length = 2)
    private UnitOfMeasurement unitOfMeasurement;

}
