public class USDDollar implements Coin {
    protected USDDollar() {
	commonName = "USDDollar";
    }    
    public void setCu(double percent) {
	cu = percent;
    }
    public void setZi(double percent) {
	zi = percent;
    }
    public void setMn(double percent) {
	mn = percent;
    }
    public void setNi(double percent) {
	ni = percent;
    }
}
