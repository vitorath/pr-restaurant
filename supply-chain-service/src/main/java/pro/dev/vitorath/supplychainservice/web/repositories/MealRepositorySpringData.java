package pro.dev.vitorath.supplychainservice.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.dev.vitorath.supplychainservice.domains.meal.Meal;

public interface MealRepositorySpringData extends JpaRepository<Meal, Long> {
}
