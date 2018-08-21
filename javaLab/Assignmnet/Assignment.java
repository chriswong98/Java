import java.util.*;
public class Assignment {
	public static void main(String [ ] args) {
		Scanner input = new Scanner(System.in);
		int numCards =52;
		int[] deck = new int[52];
		int players=0;
		int standhit=0;
		int playerCard[][] = new int[52][52];
		int dealerCard[] = new int[52];
		String[] suits = {"Spade", "Heart", "Club", "Diamond"};
		String[] numbers = {"Ace", "02", "03", "04", "05", "06", "07", "08", "09", "10", "Jack", "Queen", "King"};
		String[][] numberofsuit_Player = new String[52][52];
		String[][] numberofrank_Player = new String[52][52];
		String[] numberofsuit_Dealer = new String[52];
		String[] numberofrank_Dealer = new String[52];
		
		for(int i=0; i<deck.length;i++){
			deck[i] = (i+1);
        }
   
        for(int i=0; i<deck.length;i++){
			int index = (int)(Math.random()*52);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}	
	
		System.out.print("How many players?");
		players = input.nextInt();
		System.out.println("Game Start! (" + players + " players)");
		System.out.println("======================================");
		
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				if (numCards ==0 ){
					System.out.println("All cards in the deck are drawn.No winner or loser");
					System.exit(0);
				}
				else{
					for(int n=0; n<2; n++){
					playerCard[i][n] = numCards;
					numberofsuit_Player[i][n] = suits[((deck[numCards-1])-1) / 13];
					numberofrank_Player[i][n] = numbers[deck[numCards-1] % 13];
					numCards--;
					}
				System.out.println("Player " + (i+1) + "'s Hand: [ Unkown "+ numberofsuit_Player[i][1] +":" + numberofrank_Player[i][1] +" ]" );
				} 
					
			}
		}
	
		dealerCard[0] = numCards;
	    numberofsuit_Dealer[0] = suits[((deck[numCards-1])-1) / 13];
	    numberofrank_Dealer[0] = numbers[deck[numCards-1] % 13];
		numCards--;
		dealerCard[1] = numCards;
		numberofsuit_Dealer[1] = suits[((deck[numCards-1])-1) / 13];
		numberofrank_Dealer[1] = numbers[deck[numCards-1] % 13];
		numCards--;
		System.out.println("Dealer's hand: [ Unknown " + numberofsuit_Dealer[1] +":" + numberofrank_Dealer[1] +" ]" );
		
		System.out.println();
		System.out.println("Players' Round (" + players + " players)");
		System.out.println("======================================");
		
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				for(int n=0; n<2; n++){
			    numberofsuit_Player[i][n] = suits[((deck[playerCard[i][n]-1])-1) / 13];
				numberofrank_Player[i][n] = numbers[deck[playerCard[i][n]-1] % 13];
				}
			System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] +" ]");
			System.out.print("Player " + (i+1) + " do you want to Stand or Hit (0-Stand, 1-Hit)?");
			standhit = input.nextInt();
			if (standhit == 0){
				break;
			}	
			else if (standhit == 1){
			playerCard[i][2] = numCards;
			numberofsuit_Player[i][2] = suits[((deck[numCards-1])-1) / 13];
			numberofrank_Player[i][2] = numbers[deck[numCards-1] % 13];
			numCards--;
			String status=" "; 
			status = chkStatus(((deck[playerCard[i][0]-1] %13)+1),((deck[playerCard[i][1]-1] %13)+1),((deck[playerCard[i][2]-1] %13)+1));
			System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] + " "+ numberofsuit_Player[i][2] +":" +numberofrank_Player[i][2] +" ] " + status);	
			}
			}
		}
			
		System.out.println();	
		System.out.println("Dealer's Round (" + players + " players)");	
		System.out.println("======================================");
		System.out.println("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1] + " ]");
		int sum = 0;
		mainloop:
		while(true){
			sum = getPoints(((deck[dealerCard[0]-1] %13)+1),((deck[dealerCard[1]-1] %13)+1));
			if(sum >= 17)
				break;
			else{
				for(int n=2; n>0;n++){	
				    dealerCard[n] = numCards;
					numberofsuit_Dealer[n] = suits[((deck[numCards-1])-1) / 13];
					numberofrank_Dealer[n] = numbers[deck[numCards-1] % 13];
					numCards--;	
					sum += getPoints(((deck[dealerCard[n]-1] %13)+1));
					if(sum > 17 && n==2){
						System.out.println("Lower than 17, add new cards!");
						System.out.println("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1] + " " + numberofsuit_Dealer[n] +":" + numberofrank_Dealer[n] + " ]");
						break mainloop;
					}	
					else if(sum > 17 && n>2){
						for(int k=2; k<=n; k++){ 
							System.out.println("Lower than 17, add new cards!");
							System.out.print("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1]);
							for(int j=2; j<=k;j++){ 
								System.out.print(" " + numberofsuit_Dealer[j] + ":" +numberofrank_Dealer[j]);
								if (j==k){
								System.out.println(" ]");
								}
							}
							if (k==n){
								break mainloop;
							}		
						}	
					}		
				}
			}	
	    }	
		
		System.out.println();
	    System.out.println("Final Result (" + players + " players)");		
		System.out.println("======================================");
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				if (playerCard[i][2] > 0){
					for(int n=0; n<3; n++){
					numberofsuit_Player[i][n] = suits[((deck[playerCard[i][n]-1])-1) / 13];
					numberofrank_Player[i][n] = numbers[deck[playerCard[i][n]-1] % 13];
					}
					String status=" "; 
					status = chkStatus(((deck[playerCard[i][0]-1] %13)+1),((deck[playerCard[i][1]-1] %13)+1),((deck[playerCard[i][2]-1] %13)+1));
					System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] + " " + numberofsuit_Player[i][2] +":" + numberofrank_Player[i][2] +" ] "  + status);
				}
				else{
					for(int n=0; n<2; n++){
					numberofsuit_Player[i][n] = suits[((deck[playerCard[i][n]-1])-1) / 13];
					numberofrank_Player[i][n] = numbers[deck[playerCard[i][n]-1] % 13];
					}	
					String status=" "; 
					status = chkStatus(((deck[playerCard[i][0]-1] %13)+1),((deck[playerCard[i][1]-1] %13)+1));
					System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] +" ] " + status);
			    } 
			}
		}
		
			int counter =0;
			for(counter=2;counter>0;counter++){
				if (dealerCard[counter] == 0){
					counter--;
					break;
				}
			}
			if(counter ==1)
			{
			System.out.print("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1]+ " ]");
			}	
			else{
				System.out.print("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1]);
				for(int k=2; k<=counter; k++){
					System.out.print(" " + numberofsuit_Dealer[k] +":" + numberofrank_Dealer[k]);
					if (k==counter)
						System.out.println(" ]");
				}
			}
		
		
		
		
	}

	
	
	public static String chkStatus(int numCards1, int numCards2, int numCards3){
		int sum=0;
	    if (numCards1 >=10){
			numCards1 =10;
		}
		else if (numCards2 >=10){
			numCards2 =10;
		}
		else if (numCards3 >=10){ 
			numCards3 =10;
		}
		sum = numCards1 + numCards2 + numCards3;
		String status = " ";
		if (sum > 21){
			status = "Bust!";
		}
		else if (sum == 21){
			status =  "BlackJack!";
		}
		return status;
	}
	
	public static String chkStatus(int numCards1, int numCards2){
		int sum=0;
	    if (numCards1 >=10){
			numCards1 =10;
		}
		else if (numCards2 >=10){
			numCards2 =10;
		}
		sum = numCards1 + numCards2;
		String status = " ";
		if (sum > 21){
			status = "Bust!";
		}
		else if (sum == 21){
			status =  "BlackJack!";
		}
		return status;
	}
	
	public static int getPoints(int numCards1, int numCards2){
		int sum=0;
	    if (numCards1 >=10) 
			numCards1 =10;
		else if (numCards2 >=10) 
			numCards2 =10;
		sum = numCards1 + numCards2;
		return sum;
	}		
	
	public static int getPoints(int numCards1){
		int sum=0;
	    if (numCards1 >=10) 
			numCards1 =10;
		sum += numCards1 ;
		return sum;
	}		
}	