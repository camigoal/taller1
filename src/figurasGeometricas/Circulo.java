/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author cami_
 */
public class Circulo extends FiguraGeometrica {
    
    public Circulo(double valor1) {
        super(valor1);
    }
    
    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.valor1, 2);
    }
    
    @Override
    public double getPerimetro() {
        return Math.PI*this.valor1;
    }
}
