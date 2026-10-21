import java.time.LocalDate;

public class Factura {
    private  String id;
    private String numeroFactura;
    private  String numComprobante;
    private Venta venta;
    private LocalDate fechaImpresion;

    public  factura (
        String id,
        String numeroFactura,
        String numComprobante,
        Venta venta,
        LocalDate fechaImpresion
    )

    {
    this.id = id;
    this.numeroFactura = numeroFactura;
    this.numComprobante = numComprobante;
    this.venta = venta;
    this.LocalDate fechaImpresion;
    }
}
