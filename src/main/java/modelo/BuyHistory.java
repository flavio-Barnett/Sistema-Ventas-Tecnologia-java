package modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BuyHistory {

    private final String Vendedor;
    private final String Detalle;
    private final String Total;
    private final String Fecha;
    
}
