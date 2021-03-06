package pl.jakub.pizza.data.entity.size;

import pl.jakub.pizza.data.entity.orderSize.OrderSizeEntity;
import pl.jakub.pizza.data.entity.pizza.PizzaEntity;
import pl.jakub.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private SizeType sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;
    @Column(name = "pizza_id")
    private Integer PizzaId;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSize;
}

