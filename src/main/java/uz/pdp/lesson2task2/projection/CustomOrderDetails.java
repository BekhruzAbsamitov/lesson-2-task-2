package uz.pdp.lesson2task2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.lesson2task2.entity.Order;
import uz.pdp.lesson2task2.entity.OrderDetails;
import uz.pdp.lesson2task2.entity.Product;

import java.util.List;

@Projection(types = OrderDetails.class)
public interface CustomOrderDetails {

    Integer getId();

    List<Product> getProductsList();

    Order getOrder();

    Integer getQuantity();
}
