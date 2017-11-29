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
            ArrayList<Edificios> Che = null;
            ArrayList<Edificios> Ciencias = null;
            ArrayList<Edificios> Leyes = null;
            ArrayList<Edificios> Salud = null;
            ArrayList<Edificios> CienciasAgrarias = null;
            ArrayList<Edificios> Artes = null;
            ArrayList<Edificios> Ingenieria = null;
            ArrayList<Edificios> Fumanas= null;
            
            
            
            //che 
            ArrayList<Edificios> contiguosChe = null;
            Edificios che = new Edificios("Che");
            Che.add(che);
            
            
            //ciencias
            ArrayList<Edificios> contiguosPosgradosFEM = null;
            Edificios PosgradosFEM = new Edificios("Posgrados FEM");
            ArrayList<Edificios> contiguosFEM  = null;
            Edificios FEM = new Edificios("FEM");
            ArrayList<Edificios> contiguosIngeominas  = null;
            Edificios Ingeominas = new Edificios("Ingeominas");
            ArrayList<Edificios> contiguosCienciasNaturales  = null;
            Edificios CienciasNaturales  = new Edificios("CienciasNaturales");
            ArrayList<Edificios> contiguosQuimica  = null;
            Edificios Quimica = new Edificios("Quimica");
            ArrayList<Edificios> contiguosFarmacia  = null;
            Edificios Farmacia = new Edificios("Farmacia");
            ArrayList<Edificios> contiguosFacultasCiencias = null;
            Edificios FacultasCiencias = new Edificios("FacultasCiencias");
            Ciencias.add(FEM);
            Ciencias.add(PosgradosFEM);
            Ciencias.add(Ingeominas);
            Ciencias.add(CienciasNaturales);
            Ciencias.add(Quimica);
            Ciencias.add(Farmacia);
            Ciencias.add(FacultasCiencias);
            
            
            //leyes
            ArrayList<Edificios> contiguosDerecho = null;
            Edificios Derecho  = new Edificios("Derecho");
            Leyes.add(Derecho);
            
            
            //salud
            ArrayList<Edificios> contiguosMedicina = null;
            Edificios Medicina   = new Edificios("Medicina" );
            ArrayList<Edificios> contiguosEnfermeria = null;
            Edificios Enfermeria = new Edificios("Enfermeria" );
            ArrayList<Edificios> contiguosOdontologia = null;
            Edificios Odontologia = new Edificios("Odontologia" );
            Salud.add(Medicina);
            Salud.add(Enfermeria);
            Salud.add(Odontologia);
            
            
            //cienciasAgrarias
            ArrayList<Edificios> contiguosPequeñosAnimales = null;
            Edificios PequeñosAnimales = new Edificios("Pequeños Animales" );
            ArrayList<Edificios> contiguosVeterinaria = null;
            Edificios Veterinaria = new Edificios("Veterinaria" );
            ArrayList<Edificios> contiguosSaludAnimal = null;
            Edificios SaludAnimal  = new Edificios("SaludAnimal" );
            ArrayList<Edificios> contiguosAgronomia = null;
            Edificios Agronomia = new Edificios("Agronomia" );
            CienciasAgrarias.add(PequeñosAnimales);
            CienciasAgrarias.add(Veterinaria);
            CienciasAgrarias.add(SaludAnimal);
            CienciasAgrarias.add(Agronomia);
            
            
            //artes
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
            
            
            //ingenieria
            ArrayList<Edificios> contiguosAulasIngenieria  = null;
            Edificios AulasIngenieria = new Edificios("Aulas de Ingenieria");
            ArrayList<Edificios> contiguosCYT  = null;
            Edificios CYT = new Edificios("CYT");
            ArrayList<Edificios> contiguosMateriales = null;
            Edificios Materiales = new Edificios("Materiales");
            ArrayList<Edificios> contiguosLabIngenieria  = null;
            Edificios LabIngenieria = new Edificios("LabIngenieria");
            ArrayList<Edificios> contiguosLabIngenieriaQuimica  = null;
            Edificios LabIngenieriaQuimica = new Edificios("LabIngenieriaQuimica");
            ArrayList<Edificios> contiguosHidraulica  = null;
            Edificios Hidraulica = new Edificios("Hidraulica");
            ArrayList<Edificios> contiguosViejo  = null;
            Edificios Viejo  = new Edificios("Viejo ");
            ArrayList<Edificios> contiguosCADE  = null;
            Edificios CADE = new Edificios("CADE");
            ArrayList<Edificios> contiguosIEI  = null;
            Edificios IEI = new Edificios("IEI");
            Ingenieria.add(AulasIngenieria);
            Ingenieria.add(IEI);
            Ingenieria.add(CYT);
            Ingenieria.add(Materiales);
            Ingenieria.add(LabIngenieria);
            Ingenieria.add(LabIngenieriaQuimica);
            Ingenieria.add(Hidraulica);
            Ingenieria.add(CADE);
            
            //Fumanas
            
            ArrayList<Edificios> contiguosAulasHumanas  = null;
            Edificios AulasHumanas = new Edificios("Aulas de Humanas");
            ArrayList<Edificios> contiguosCienciasHumanas  = null;
            Edificios CienciasHumanas  = new Edificios("Ciencias Humanas ");
            ArrayList<Edificios> contiguosPosgradosHumanas  = null;
            Edificios PosgradosHumanas = new Edificios("Posgrados Humanas");
            
            
            
            
            //Conexiones
            
            
            Facultad ciencias= new Facultad("ciencias", 5, Ciencias);
            Facultad artes = new Facultad("Artes", 5, Artes);
            Facultad plazache= new Facultad("Plaza Che", 3, Che);
            Facultad medicina= new Facultad("Medicina", 3, Che);
            Facultad ingenieria=new Facultad("Ingenieria", 7, Ingenieria);
            Facultad leyes=new Facultad("leyes", 1,Leyes);
            Facultad cienciasAgrarias=new Facultad("ciencias Agrarias", 7,CienciasAgrarias);
            Facultad fumanas=new Facultad("Fumanas", 7,Fumanas);
    }
    
}
