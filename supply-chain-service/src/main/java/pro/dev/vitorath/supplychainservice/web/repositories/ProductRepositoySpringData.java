package pro.dev.vitorath.supplychainservice.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.dev.vitorath.supplychainservice.domains.product.Product;

public interface ProductRepositoySpringData extends JpaRepository<Product, Long> {
}
