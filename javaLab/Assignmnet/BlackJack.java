/* BlackJack
   Name:Wong Tsz Chun	
   Class:1C
   StudentNumber: 170465169 	
   The purpose of the program:A Java Blackjack card game designed for people to play.
*/
   
import java.util.*;
public class BlackJack {
	public static void main(String [ ] args) { 
		Scanner input = new Scanner(System.in);
		int numCards =1; //The initial value after a card is drawn in the deck 
		int numCards_testmode = 1; //The initial value after a card is drawn in the deck in Testmode
		int[] deck = new int[53]; // A array storing the value of the deck
		int testmode=0; //For testmode
		int players=0; //The variable storing number of player
		int standhit=0; //The variable storing the value the player hit or not
		int testInput=0; //The initial value of the input in testmode
		int playerCard[][] = new int[52][52]; //2D array recording a player's card number
		int dealerCard[] = new int[52]; //array recording the dealer 's card number
		String[][] status= new String[52][52]; //array recording the status of a player 
		String[] suits = {"Spade", "Heart", "Club", "Diamond"}; //Array storing the value of the suits of the deck
		String[] numbers = {"Ace", "02", "03", "04", "05", "06", "07", "08", "09", "10", "Jack", "Queen", "King"}; //Array storing the value of the ranks of the deck
		String[][] numberofsuit_Player = new String[52][52]; //Array recording a player 's suit of card
		String[][] numberofrank_Player = new String[52][52];//Array recording a dealer 's rank of card
		String[] numberofsuit_Dealer = new String[52]; //Array recording a dealer 's suit of card
		String[] numberofrank_Dealer = new String[52]; //Array recording a dealer 's rank of card
		
		for(int i=0; i<52;i++){
			deck[i+1] = (i+1);
        }
   
        for(int i=0; i<52;i++){
			int index = (int)(Math.random()*52 +1);
			int temp = deck[i+1];
			deck[i+1] = deck[index];
			deck[index] = temp;
		}	
	 
		System.out.print("Go to Test Mode (0-No, 1-Yes): ");
		testmode = input.nextInt();
		System.out.println();
		if (testmode == 1){
			for(int i=0; i<52;i++){
				System.out.print("Input Card" + (i+1) +" in your deck (0 to end): ");
				testInput = input.nextInt();
				if (testInput ==0)
					break;
				deck[numCards_testmode] = testInput;
				numCards_testmode++;
			}	
		}	
		else if(testmode == 0){
		}
		
	
		System.out.print("How many players?");
		players = input.nextInt();
		while (true){
			if (players <= 0){
				System.out.println("Number of players must be greater than or equal to 1!");
				System.out.print("How many players?");
				players = input.nextInt();
			}
			else if(players >0)
				break;
		}
		System.out.println();
		System.out.println("Game Start! (" + players + " players)");
		System.out.println("======================================");
		
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				if (numCards ==52 ){
					System.out.println("All cards in the deck are drawn.No winner or loser");
					System.exit(0);
				}
				else{
					playerCard[i][0] = numCards;
					numberofsuit_Player[i][0] = suits[((deck[numCards])-1) / 13];
					numberofrank_Player[i][0] = numbers[((deck[numCards])-1) % 13];
					numCards++;
				}
			} 	
		}
		
		dealerCard[0] = numCards;
	    numberofsuit_Dealer[0] = suits[((deck[numCards])-1) / 13];
	    numberofrank_Dealer[0] = numbers[((deck[numCards])-1) % 13];
		numCards++;
		
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				if (numCards ==52 ){
					System.out.println("All cards in the deck are drawn.No winner or loser");
					System.exit(0);
				}
				else{
					playerCard[i][1] = numCards;
					numberofsuit_Player[i][1] = suits[((deck[numCards])-1) / 13];
					numberofrank_Player[i][1] = numbers[((deck[numCards])-1) % 13];
					numCards++;
				}
			System.out.println("Player " + (i+1) + "'s Hand: [ Unkown "+ numberofsuit_Player[i][1] +":" + numberofrank_Player[i][1] +" ]" );	
			} 	
		}
		
		
		
		
		
		
		
		
		dealerCard[1] = numCards;
		numberofsuit_Dealer[1] = suits[((deck[numCards])-1) / 13];
		numberofrank_Dealer[1] = numbers[((deck[numCards])-1) % 13];
		numCards++;
		System.out.println("Dealer's hand: [ Unknown " + numberofsuit_Dealer[1] +":" + numberofrank_Dealer[1] +" ]" );
		
		System.out.println();
		System.out.println("Players' Round (" + players + " players)");
		System.out.println("======================================");
		
		for(int i=0; i<players; i++){
		    for(int j=i; j<=i; j++){
				for(int n=0; n<2; n++){
			    numberofsuit_Player[i][n] = suits[((deck[playerCard[i][n]])-1) / 13];
				numberofrank_Player[i][n] = numbers[((deck[playerCard[i][n]])-1) % 13];
				}
				int playersum =0; //The sum of a player's point	
				playersum = getPoints((((deck[playerCard[i][0]]-1) %13)+1),(((deck[playerCard[i][1]]-1) %13)+1));	
				status[i][0] = chkStatus((((deck[playerCard[i][0]]-1) %13)+1),(((deck[playerCard[i][1]]-1) %13)+1));	
				System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] +" ] "  + status[i][0]);
				if(status[i][0] == "BlackJack!")
					break;
				System.out.print("Player " + (i+1) + " do you want to Stand or Hit (0-Stand, 1-Hit)?");
				standhit = input.nextInt();
				innerloop:
				while (true){
					if (standhit != 0 && standhit != 1){
					System.out.println("You must input 0 or 1!");
					System.out.print("Player " + (i+1) + " do you want to Stand or Hit (0-Stand, 1-Hit)?");
					standhit = input.nextInt();
					}
				else if(standhit == 0 || standhit == 1)
					break innerloop;
				}
			
				if (standhit == 0){
					break;
				}	
				else if (standhit == 1){
					playerCard[i][2] = numCards;
					numberofsuit_Player[i][2] = suits[((deck[numCards])-1) / 13];
					numberofrank_Player[i][2] = numbers[((deck[numCards])-1)  % 13];
					numCards++; 
					playersum += getPointsPlayer((((deck[playerCard[i][2]]-1) %13)+1),playersum,(((deck[playerCard[i][0]]-1) %13)+1),(((deck[playerCard[i][1]]-1) %13)+1));
					status[i][1] = chkStatus((((deck[playerCard[i][0]]-1) %13)+1),(((deck[playerCard[i][1]]-1) %13)+1),(((deck[playerCard[i][2]]-1) %13)+1));
					System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] + " "+ numberofsuit_Player[i][2] +":" +numberofrank_Player[i][2] +" ] " + status[i][1]);
					if(status[i][1] == "BlackJack!" || status[i][1] == "Bust!")
								break;
					innerloop2:
					for(int n=3; n>0;n++){	
						System.out.print("Player " + (i+1) + " do you want to Stand or Hit (0-Stand, 1-Hit)?");
						standhit = input.nextInt();
						while (true){
							if (standhit != 0 && standhit != 1){
							System.out.println("You must input 0 or 1!");
							System.out.print("Player " + (i+1) + " do you want to Stand or Hit (0-Stand, 1-Hit)?");
							standhit = input.nextInt();
							}
							else if(standhit == 0 || standhit == 1)
								break;
						}
						if (standhit == 0){
							break;
						}	
						else if (standhit == 1){
							playerCard[i][n] = numCards;
							numberofsuit_Player[i][n] = suits[((deck[numCards])-1) / 13];
							numberofrank_Player[i][n] = numbers[((deck[numCards])-1) % 13];
							numCards++;						
							playersum = getPointsPlayerSum(n,playerCard,i,deck);
							status[i][n-1] = chkStatusPlayer(playersum);
							System.out.print("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] +":" +numberofrank_Player[i][1] + " " + numberofsuit_Player[i][2] +":" +numberofrank_Player[i][2]);
							for(int k=3; k<=n; k++){ 
								System.out.print(" " + numberofsuit_Player[i][k] + ":" +numberofrank_Player[i][k]);							
								if (k==n){
									System.out.println(" ]" + status[i][n-1]);
								}
							}	
							if(status[i][n-1] == "BlackJack!" || status[i][n-1] == "Bust!")
								break innerloop2;
						}
					
					}
				}
			}
		}
		
		
		System.out.println();	
		System.out.println("Dealer's Round (" + players + " players)");	
		System.out.println("======================================");
		
		boolean endGame = true;
		
		for(int i=0; i<players; i++){
			if (status[i][0]=="BlackJack!")
				endGame = false;
		}
		int dealersum = 0; //the sum of the dealer's point
		if (endGame == false)
			System.out.println("All players have won or lost the game!");
			else{
				int playercounter =0;
				for(int i=0; i<players; i++){
					for(playercounter=2;playercounter>0;playercounter++){
						if (playerCard[i][playercounter] == 0){
							playercounter--;
							break;
						}
					}
					
					if(playercounter ==1){
						if (status[i][0] == null)
							System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" " + numberofsuit_Player[i][1]  +":" + numberofrank_Player[i][1]+ " ] ");
							else
								System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" " + numberofsuit_Player[i][1]  +":" + numberofrank_Player[i][1]+ " ] " + status[i][0]);	
					}else{
							System.out.print("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] + ":" + numberofrank_Player[i][1]);	
							for(int k=2; k<=playercounter; k++){
								System.out.print(" " + numberofsuit_Player[i][k] +":" + numberofrank_Player[i][k]);
								if (k==playercounter && status[i][k-1] == null)
									System.out.println(" ] ");
								if (k==playercounter && status[i][k-1]!=null)
									System.out.println(" ] " + status[i][k-1]);
							}
						}
				}
				System.out.println("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1] + " ]");
				mainloop:
				while(true){
					dealersum = getPoints((((deck[dealerCard[0]]-1) %13)+1),(((deck[dealerCard[1]]-1) %13)+1));
					if(dealersum >= 17)
						break;
						else{
							for(int n=2; n>0;n++){	
								dealerCard[n] = numCards;
								numberofsuit_Dealer[n] = suits[((deck[numCards])-1) / 13];
								numberofrank_Dealer[n] = numbers[((deck[numCards])-1) % 13];
								numCards++;	
								dealersum += getPointsDealer((((deck[dealerCard[n]]-1) %13)+1),dealersum,(((deck[dealerCard[0]]-1) %13)+1),(((deck[dealerCard[1]]-1) %13)+1));				
								if(dealersum >= 17 && n==2){
									System.out.println("Lower than 17, add new cards!");
									System.out.println("Dealer's hand: [ " + numberofsuit_Dealer[0] +":" + numberofrank_Dealer[0] + " " + numberofsuit_Dealer[1] + ":" +numberofrank_Dealer[1] + " " + numberofsuit_Dealer[n] +":" + numberofrank_Dealer[n] + " ]");
									break mainloop;
								}	
								else if(dealersum >= 17 && n>2){
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
			}
		System.out.println();
	    System.out.println("Final Result (" + players + " players)");		
		System.out.println("======================================");
		int playercounter =0; //count  how many cards players drawed
				for(int i=0; i<players; i++){
					for(playercounter=2;playercounter>0;playercounter++){
						if (playerCard[i][playercounter] == 0){
							playercounter--;
							break;
						}
					}
					int playersum = 0; //the sum of the player's point
					playersum = getPointsPlayerSum(playercounter,playerCard,i,deck);
					String statusPlayer=" ";  //storing a player's status
					statusPlayer =  chkStatusPlayer(playersum,dealersum);
					if(playercounter ==1){
						if (status == null)
							System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" " + numberofsuit_Player[i][1]  +":" + numberofrank_Player[i][1]+ " ] ");
							else
								System.out.println("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" " + numberofsuit_Player[i][1]  +":" + numberofrank_Player[i][1]+ " ] " + statusPlayer);	
					}else{
							System.out.print("Player " + (i+1) + "'s Hand: [ "+ numberofsuit_Player[i][0] +":" + numberofrank_Player[i][0] +" "+ numberofsuit_Player[i][1] + ":" + numberofrank_Player[i][1]);	
							for(int k=2; k<=playercounter; k++){
								System.out.print(" " + numberofsuit_Player[i][k] +":" + numberofrank_Player[i][k]);
								if (k==playercounter && status == null)
									System.out.println(" ] ");
								if (k==playercounter && status!=null)
									System.out.println(" ] " + statusPlayer);
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
		
	
	public static int getPointsPlayerSum(int playercounter, int[][] playerCard, int playerNo, int [] deck){ //the method calculating a player's sum of point
		int playersum=0;
		int ace =0;
		for(int i=0; i <= playercounter; i++){
			int temp = deck[playerCard[playerNo][i]];
			temp = (temp-1) % 13 + 1;
			if (temp == 1){
				temp = 11;
				ace += 1;
			}
			if (temp > 10)
				temp = 10;
			playersum += temp;
		}
		if(ace==1 && playersum>21)
				playersum= (playersum - 10 *1);
			else if(ace==2 && playersum>21)
				playersum= (playersum - 10 *2);
			else if(ace==3 && playersum>21)
				playersum= (playersum - 10 *3);
			else if(ace==4 && playersum>21)
				playersum= (playersum - 10 *4);
		return playersum;
	}
	
	
	public static String chkStatusPlayer(int playersum, int dealersum){ //check the status of the player
		String status = " ";
		if (playersum > 21){
			status = "Bust!";
		}
		else if (playersum == 21){
			status =  "BlackJack!";
		}
		else if (playersum <=21 && dealersum > 21){
			status = "Win!";
		}	
		else if  (playersum <=21 && playersum > dealersum && dealersum <=21){
			status = "Win!";
		}
		else if (playersum <=21 && playersum < dealersum && dealersum <=21){
			status = "Lose!";
		}
		else if (playersum <=21 && playersum == dealersum && dealersum <=21){
			status = "Push!";
		}	
		
		return status;
	}
	
	
	public static String chkStatus(int numCards1, int numCards2, int numCards3){ //check the status of the player's first three card
		int sum=0;
	    if (numCards1 >=11){
			numCards1 =10;
		}
		if (numCards2 >=11){
			numCards2 =10;
		}
		if (numCards3 >=11){ 
			numCards3 =10;
		}
		if (numCards1 == 1 && (numCards2+numCards3 <=10))
			numCards1 =11;
		if (numCards2 == 1 && (numCards1+numCards3 <=10))
			numCards2 =11;
		if (numCards3 == 1 && (numCards1+numCards2 <=10))
			numCards3 =11;
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
	
	public static String chkStatus(int numCards1, int numCards2){ //overloading check status method checking the first two card of a player
		int sum=0;
	    if (numCards1 >=11){
			numCards1 =10;
		}
		if (numCards2 >=11){
			numCards2 =10;
		}
		if (numCards1 == 1 && numCards2 ==10)
			numCards1 =11;
		if (numCards1 == 10 && numCards2 ==1)
			numCards2 =11;
		sum = numCards1 + numCards2;
		String status = " ";
		if (sum == 21){
			status =  "BlackJack!";
		}
		return status;
	}
	
	public static int getPoints(int numCards1, int numCards2){ //calculate the first two cards points of a player's 
		int sum=0;
	    if (numCards1 >=11) 
			numCards1 =10;
		if (numCards2 >=11) 
			numCards2 =10;
		if (numCards1 == 1)
			numCards1 =11;
		if (numCards2 == 1)
			numCards2 =11;
		sum = numCards1 + numCards2;
		if (sum > 21 && (numCards1 == 11|| numCards2 == 11))
			sum = sum - 10;	
		return sum;
	}		
	
	

	
	
	public static int getPointsPlayer(int numCards3, int playersum, int numCards1, int numCards2){ //overloading method calculate the first three cards points of a player's
		int sum=0;
	    if (numCards3 >=11) 
			numCards3 =10;
		if (numCards3 == 1)
			numCards3 = 11;
		sum = numCards3;
		if (sum > 21 && numCards3 == 11)
			sum = sum - 10;	
		if ((playersum + numCards3) > 21 && numCards1 == 1 && numCards2 ==1)
			sum = sum - 10;
		return sum;
	}		
	
	public static String chkStatusPlayer(int playersum){ //check the status of a player
		String status = " ";
		if (playersum > 21){
			status = "Bust!";
		}
		else if (playersum == 21){
			status =  "BlackJack!";
		}
		
		return status;
	}
		
	public static int getPointsDealer(int numCards3, int dealersum, int numCards1, int numCards2){ //calculate the points a dealer get
		int sum=0;
	    if (numCards3 >=11) 
			numCards3 =10;
		if (numCards3 == 1)
			numCards3 = 11;
		sum = numCards3;
		if (sum > 21 && numCards3 == 11)
			sum = sum - 10;	
		if ((dealersum + numCards3) > 21 && numCards1 == 1 && numCards2 ==1)
			sum = sum - 10;
		return sum;
	}		
}