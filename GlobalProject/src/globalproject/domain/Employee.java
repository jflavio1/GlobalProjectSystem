/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalproject.domain;

/**
 *
 * @author alumno
 */
public class Employee {
    private String empId;
    private String empNombre;
    private String empEdad;
    private String empEspecialidad;

    public Employee(String empId, String empNombre, String empEdad, String empEspecialidad) {
        this.empId = empId;
        this.empNombre = empNombre;
        this.empEdad = empEdad;
        this.empEspecialidad = empEspecialidad;
    }
    
        public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpEdad() {
        return empEdad;
    }

    public void setEmpEdad(String empEdad) {
        this.empEdad = empEdad;
    }

    public String getEmpEspecialidad() {
        return empEspecialidad;
    }

    public void setEmpEspecialidad(String empEspecialidad) {
        this.empEspecialidad = empEspecialidad;
    }
    
    
}
