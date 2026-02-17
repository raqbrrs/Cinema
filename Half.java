
package Cinema;

/**
 *
 * @author Raquel Barros
 */
public class  Half extends Ticket{
    public Half(double value, String name, boolean legend){
        super(value, name, legend);
    }
    
    @Override
    public double getValueReal(){
        return super.getValueReal() / 2;
    }
}


