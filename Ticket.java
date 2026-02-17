
package Cinema;

/**
 *
 * @author Raquel Barros
 */
public class Ticket {
    protected double value;
    
    protected String name;
    
    protected boolean legend;

    
    public Ticket(double value, String name, boolean legend){
        this.value = value;
        this.name = name;
        this.legend = legend;
    }
    
    public double getValueReal(){
        return this.value;
    }
    
    public String getInfo(){
        String audio = legend ? "Dublado" : "Legendado";
        return "Filme: " + name + "(" + audio +")";
    }
   
    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the legend
     */
    public boolean isLegend() {
        return legend;
    }

    /**
     * @param legend the legend to set
     */
    public void setLegend(boolean legend) {
        this.legend = legend;
    }
    
}
