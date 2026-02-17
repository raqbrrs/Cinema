/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinema;

/**
 *
 * @author Raquel Barros
 */
public class Family extends Ticket{
    private int numPeople;
    
    public Family(double value, String name, boolean legend, int par2){
        super(value, name, legend);
        this.numPeople = numPeople;
    }
   
    @Override
    public double getValueReal() {
        double total = super.getValueReal() * numPeople;
        if (numPeople > 3){
            total = total * 0.95;
        }
        return total;
    }
}
