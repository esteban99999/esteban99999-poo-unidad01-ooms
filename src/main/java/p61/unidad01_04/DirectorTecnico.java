/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad01_04;

/**
 *
 * @author morti
 */
public class DirectorTecnico extends Persona {
    
    
    private String nacionalidad;
    private int yearsTrayectoria;
    
    public String mostrarInfoTecnico(){
        return this.mostrarInfoTecnico()+" es de nacionalidad"+this.nacionalidad
                +" tiene "+this.getYearsTrayectoria()
                +" años de trayectoria";
    }
    
    
    
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }

    

    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }
    
    
    
    
}
