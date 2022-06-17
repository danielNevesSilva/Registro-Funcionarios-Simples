/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;

/**
 *
 * @author danie
 */
public class Utilitarios {

    private String name;
    private double salary;
    private Integer id;

    public Utilitarios(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return salary;
    }

    public void setSallary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addsalary(double porcentagem) {
        salary += salary * porcentagem / 100.0;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
 
    }
}
