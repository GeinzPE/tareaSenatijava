/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Locale;

/**
 *
 * @author Benjamin
 */
public class carClass {

    public int dni;
    public String last_name;
    public String name;
    public String typeCar;
    public String direcction;
    public double coust;
    public int tiem;
    public double total;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getDirecction() {
        return direcction;
    }

    public void setDirecction(String direcction) {
        this.direcction = direcction;
    }

    public double getCoust() {
        return coust;
    }

    public void setCoust(double coust) {
        this.coust = coust;
    }

    public int getTiem() {
        return tiem;
    }

    public void setTiem(int tiem) {
        this.tiem = tiem;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double generate_payment(int hora) {
        
        double total = 0.0;
        switch (typeCar.toLowerCase(Locale.ROOT)) {
            case "sedan":
                //20 so by minutes
                total = hora * 20;
                break;
            case "pickup":
                //25 so by minutes
                total = hora * 25;
                break;
            case "suv":
                //40 so by minutes
                total = hora * 40;
                break;
            default:
                throw new AssertionError();
        }
        return total;
    }

}
