package es.um.asio.domain;

import es.um.asio.abstractions.domain.Operation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PojoLinkedToData {

	/**
     * Operation to perform.
     */
    private Operation action;
    
    /**
     * POJO data.
     */
    private Object linkedTo;
}
