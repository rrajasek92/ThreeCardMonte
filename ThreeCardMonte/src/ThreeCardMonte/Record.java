package ThreeCardMonte;
import java.util.ArrayList;

public class Record {
  
	public ArrayList<Double> BET = new ArrayList<Double>();
	public ArrayList<String> OUT = new ArrayList<String>();
	public ArrayList<Double> BAL = new ArrayList<Double>();
	public int count=0;
	public void RecordIt(Double bet,String out, Double balance){
		BET.add(bet);
		OUT.add(out);
		BAL.add(balance);
		count++;
	}
	public void Display(){
		System.out.println("\n--------------------------------\nHistory:\n");
		for(int i=0;i<count;i++){
		String fBet=BET.get(i).toString();
		String fOut=OUT.get(i).toString();
		String fBal=BAL.get(i).toString();
		System.out.println("Bet: $"+fBet+", Outcome: "+fOut+", Balance: $"+fBal);
		}
		System.out.println("\n--------------------------------\n");
	}
}
