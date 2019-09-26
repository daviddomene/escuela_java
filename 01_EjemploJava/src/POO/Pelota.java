package poo;

/**
 *
 * @author David Domene Domene
 */
public class Pelota implements Rodable{
    
    @Override
    public void moverse(){
        System.out.println("Rueda y bota");
    }

    @Override
    public int numRuedas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNumRuedas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
