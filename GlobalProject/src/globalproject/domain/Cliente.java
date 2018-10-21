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
public class Cliente {
    private String cliId;
    private String cliNombre;
    private String cliRubro;

    public Cliente(String cliId, String cliNombre, String cliRubro) {
        this.cliId=cliId;
        this.cliNombre=cliNombre;
        this.cliRubro=cliRubro;
        
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

  
    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliRubro() {
        return cliRubro;
    }

    public void setCliRubro(String cliRubro) {
        this.cliRubro = cliRubro;
    }
    
}
