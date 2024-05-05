package strategy;
public class CreditCard {
    private int amount = 1000;
    private final String number;
    private final String date;
    private final String cvv;
    
    public CreditCard(String _number, String _date, String _cvv){
    	number = _number;
    	date = _date;
    	cvv = _cvv;
    }
    
    public void setAmount(int _amount){
    	amount = _amount;    	
    }
    
    public int getAmount(){
    	return amount;
    }
}
