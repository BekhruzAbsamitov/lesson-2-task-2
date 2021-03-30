package uz.pdp.lesson2task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.lesson2task2.entity.OrderDetails;
import uz.pdp.lesson2task2.projection.CustomOrderDetails;

@RepositoryRestResource(path = "orderDetail", excerptProjection = CustomOrderDetails.class)
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {
}
