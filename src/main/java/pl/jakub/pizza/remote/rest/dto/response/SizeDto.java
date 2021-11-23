package pl.jakub.pizza.remote.rest.dto.response;

import pl.jakub.pizza.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {

    private Integer id;
    private SizeType size;
    private BigDecimal price;

    public SizeDto(int i, SizeType s, BigDecimal bigDecimal){

    }
}
