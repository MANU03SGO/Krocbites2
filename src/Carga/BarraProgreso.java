
package Carga;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BarraProgreso {
   public static void main(String[]args){
        PantaCarga Pc = new PantaCarga();
        Opcion lf = new Opcion();
        Pc.setVisible(true);
        
        
        for(int i = 1; i<=100; ++i){
            try {
                Thread.sleep(80);
                Pc.BarraProgre.setValue(i);
                
                if(i%2==0){
                    Pc.CargandoBarra.setText("Cargando.   .");  
                }else{
                    Pc.CargandoBarra.setText("Cargando...");
                }if(i==100){
                 Pc.setVisible(false);
                 lf.setVisible(true);
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(BarraProgreso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
   }
    
    
    
    
}
