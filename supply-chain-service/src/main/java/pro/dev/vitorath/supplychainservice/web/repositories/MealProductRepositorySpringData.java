package pro.dev.vitorath.supplychainservice.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.dev.vitorath.supplychainservice.domains.meal.MealProduct;
import pro.dev.vitorath.supplychainservice.domains.meal.MealProductPk;

public interface MealProductRepositorySpringData extends JpaRepository<MealProduct, MealProductPk> {
}
