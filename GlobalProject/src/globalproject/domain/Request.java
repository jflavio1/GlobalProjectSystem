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
public class Request {
    private int requestId;
    private String companyName;
    private String ruc;
    private double budget;
    private String servicesName;
    private String description;

    public Request(int requestId, String companyName, String ruc, double budget, String servicesName, String description) {
        this.requestId = requestId;
        this.companyName = companyName;
        this.ruc = ruc;
        this.budget = budget;
        this.servicesName = servicesName;
        this.description = description;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
