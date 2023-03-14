/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author cami_
 */
public class Cuadrado extends FiguraGeometrica {
    
    public Cuadrado(double valor1) {
        super(valor1);
    }
    
    @Override
    public double getArea() {
        return Math.pow(this.valor1, 2);
    }
    
    @Override
    public double getPerimetro() {
        return this.valor1*4;
    }
}
