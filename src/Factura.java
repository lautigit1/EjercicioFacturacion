    import java.util.ArrayList;

    public class Factura {
        private String fechaFactura;
        private long numeroFactura;
        private String cliente;
        private double totalCalculadoFactura;
        private ArrayList<DetalleFactura> detallesFactura;

        public Factura() {
            this.detallesFactura = new ArrayList<>();
        }

        public void setFechaFactura(String fechaFactura) {
            this.fechaFactura = fechaFactura;
        }

        public void setNumeroFactura(long numeroFactura) {
            this.numeroFactura = numeroFactura;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public void agregarDetalle(DetalleFactura detalle) {
            detallesFactura.add(detalle);
        }

        public void calcularMontoTotal() {
            totalCalculadoFactura = 0;
            for (DetalleFactura detalle : detallesFactura) {
                totalCalculadoFactura += detalle.getSubtotal();
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Fecha: ").append(fechaFactura).append("\n");
            sb.append("Número: ").append(numeroFactura).append("\n");
            sb.append("Cliente: ").append(cliente).append("\n");
            sb.append("Código\tNombre\tCantidad\tPrecio Unitario\tDescuento\tSubtotal\n");
            for (DetalleFactura detalle : detallesFactura) {
                sb.append(detalle).append("\n");
            }
            sb.append("Total: ").append(totalCalculadoFactura).append("\n");
            return sb.toString();
        }
    }


