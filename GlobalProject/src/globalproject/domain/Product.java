package globalproject.domain;

/**
 *
 * @author Jose Flavio
 */
public class Product {
    
    private int prodId;
    private String prodCode;
    private String prodName;
    private double prodPrice;

    public Product(int prodId, String prodCode, String prodName, double prodPrice) {
        this.prodId = prodId;
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }
    
    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }
    
    
    
}
