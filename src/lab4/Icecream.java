package lab4;

public class Icecream {

    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    public String getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }
    
    public String toString() {
return "Icecream{" +
"icecreamType='" + icecreamType + '\'' +
", icecreamCompany='" + icecreamCompany + '\'' +
", icecreamPrice=" + icecreamPrice +
'}';
}
}
