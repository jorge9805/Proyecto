/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Datos.Edificios;
import Datos.Facultad;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ArrayList<Edificios> Artes = null;
            
            ArrayList<Edificios> contiguosArquitectura = null;
            Edificios Arquitectura = new Edificios("Arquitectura" );
            
            ArrayList<Edificios> contiguosBellasArtes  = null;
            Edificios BellasArtes = new Edificios("BellasArtes");
            
            ArrayList<Edificios> contiguosConservatorio  = null;
            Edificios Conservatorio = new Edificios("Conservatorio");
            
            ArrayList<Edificios> contiguosMuseo  = null;
            Edificios Museo = new Edificios("Museo de Arte");
            
            ArrayList<Edificios> contiguosAulas  = null;
            Edificios Aulas = new Edificios("Aulas de Construiccion");

           
               Artes.add(Arquitectura);
               Artes.add(BellasArtes);
               Artes.add(Conservatorio);
               Artes.add(Museo);
               Artes.add(Aulas);
            

            Facultad artes = new Facultad("Artes", 5, Artes);
    }
    
}
