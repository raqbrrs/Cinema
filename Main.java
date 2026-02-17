package Cinema;


/**
 *
 * @author Raquel Barros
 */
public class Main {



    public static void main(String[] args) {
        Ticket comum = new Ticket(50.0, "Batman", false);
        Half ticket = new Half(40.0, "Batman", false);
        Family tick = new Family(50.0, "Batman", true, 4);

        System.out.println(comum.getInfo() + " | Valor: R$ " + ticket.getValueReal());
        System.out.println("Meia Entrada | Valor: R$ " + ticket.getValueReal());
        System.out.println("Combo Familia (4 pessoas) | Valor: R$ " + tick.getValueReal());
    }
}

