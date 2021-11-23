package pl.jakub.pizza.data.entity.orderSize;

import pl.jakub.pizza.data.entity.order.OrderEntity;
import pl.jakub.pizza.data.entity.pizza.PizzaEntity;
import pl.jakub.pizza.data.entity.size.SizeEntity;
import pl.jakub.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;

public class OrderSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private SizeType orderId;

    @Column(name = "size_id")
    private BigDecimal sizeId;

    @Column(name = "size_count")
    private Integer sizeCount;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "size_id", insertable = false, updatable = false)
    private SizeEntity size;
}

