/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author vania
 */
public class Alumno {
    private String numerodecuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numerodecuenta, int semestre, float promedio) {
        this.numerodecuenta = numerodecuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numerodecuenta=" + numerodecuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar( int minutos){
        System.out.println("Estudiando ... " + minutos + "minutos" );
    }
    
    public String evaluarDesempenio(){
        return this.promedio > 8.0f?"Sobresaliente":"Regular";
    }
    
}
