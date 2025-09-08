package Condicionales;
public class DiscountCalculator {
    public static void main(String[] args) {
        // Calculadora de descuentos
        var precioProducto = 135.00;
        var code = "TECNO15";
        var isVip = true;
        var restaPorcentaje =  precioProducto - (0.15*precioProducto);
        var clienteVIP = precioProducto - (0.05*precioProducto);
        
        if (precioProducto > 100.00 && code.equals("TECNO15")) {
            System.out.println("Felicidades, al aplicar el código de descuento en su producto el precio será de: " + restaPorcentaje);
        }   else if (isVip == true) {
            System.out.println("Cliente VIP, por su membresía reciba un %.2f de descuento!".formatted(clienteVIP));
        } else {
            System.out.println("No hay descuento.");
        }
    }
}