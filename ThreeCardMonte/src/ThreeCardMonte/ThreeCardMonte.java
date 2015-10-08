package ThreeCardMonte;
import java.util.Random;
import java.util.Scanner;


public class ThreeCardMonte {
	Scanner keyboard = new Scanner(System.in);
	private String again="y";
	public double balance=100,bet=5;
	
	
	public int Shuffle(){
		Random r = new Random();
		int place = 1 + r.nextInt(3);
		return place;
	}
	public void Display(){
		while(again.equals("y")){
		System.out.println("Welcome to Three Card Monte!\nMoney: $"+balance+" (Buyin $5 minimum)\n");	
		betCheck(balance);
		System.out.println("Where's the ace?\nPick a card...\n\n"+
							"\t##  ##  ##\n"+
							"\t##  ##  ##\n"+
							"\t1   2   3  \n");
		int pick=keyboard.nextInt();
		Reveal(Shuffle(),pick);
		if (balance<5){System.out.println("You're broke!\n");return;}
		System.out.println("Play again?(y/n)\n");
		again=keyboard.next();
		
		}
	}
	public void Reveal(Integer rand, Integer p){
		if (p==rand){
			System.out.println("You're right!");
			balance=balance+bet*2;
		}
		else System.out.println("HAH! You lose!");
		if (rand==1){
		System.out.println("\n"+
						   "\tAA  ##  ##\n"+
						   "\tAA  ##  ##\n"+
						   "\t1   2   3  \n");}
		else if (rand==2){
			System.out.println("\n"+
							   "\t##  AA  ##\n"+
							   "\t##  AA  ##\n"+
							   "\t1   2   3  \n");}
		else if (rand==3){
			System.out.println("\n"+
							   "\t##  ##  AA\n"+
							   "\t##  ##  AA\n"+
							   "\t1   2   3  \n");}
	}
	public void betCheck(Double uBalance){
		double ubet=uBalance+10;
		while (ubet>uBalance||ubet<5){
		System.out.println("What's your bet?\n");
		ubet=keyboard.nextDouble();
		if(ubet<5)System.out.println("$5 minimum, bub!");
		else if (ubet>uBalance)System.out.println("You don't have enough money!");
		else {balance=uBalance-ubet; bet=ubet;}
		}
	}
	

}
