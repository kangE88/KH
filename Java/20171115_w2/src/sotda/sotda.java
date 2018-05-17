package sotda;

public class sotda {
	private int card[] = new int[20];
	
	private boolean swit[] = new boolean[20];

	private int userCard[] = new int[2];
	private int comCard[] = new int[2];
	
	private int w, r;
	private int player, com;
	
	private int temp;
	
	
	public void cardShupple(){
		for(int i=0;i<swit.length;i++){
			swit[i] = false;
		}
		//random(1~20) 1~10 * 2
		w = 0;
		while(w< 20) {
			r = (int)(Math.random()*20);
			if(swit[r] == false) {
				swit[r] = true;
				card[w] = r + 1;
				
				if(card[w] > 10) {
					card[w] = card[w] -10;
				}
				w++;
			}
		}
		
			for(int i=0;i<card.length;i++) {
				System.out.println("card[" + i + "] = " + card[i]);
			}
	}
	public void cardThrow(){
		userCard[0] = card[0];
		userCard[1] = card[1];
		
		comCard[0] = card[2];
		comCard[1] = card[3];
		
		if(userCard[0] > userCard[1]) {
			temp = userCard[0];
			userCard[0] = userCard[1];
			userCard[1] = temp;
			
		}
		if(comCard[0] > comCard[1]) {
			temp = comCard[0];
			comCard[0] = comCard[1];
			comCard[1] = temp;
		}
		
		for(int i=0; i<userCard.length;i++) {
			System.out.println("userCard[" + i + "] = "+userCard[i]);
		}
		
		for(int i=0; i<comCard.length;i++) {
			System.out.println("comCard[" + i + "] = "+comCard[i]);
		}
	}
	public int userScore(){
		if(userCard[0] == userCard[1]) {
			player = userCard[0] +20;
		}else if(userCard[0] == 1 && userCard[1] == 2) {
			player = 20;
		}else if(userCard[0] == 1 && userCard[1] == 4) {
			player = 19;
		}else if(userCard[0] == 1 && userCard[1] == 9) {
			player = 18;
		}else if(userCard[0] == 1 && userCard[1] == 10) {
			player = 17;
		}else if(userCard[0] == 4 && userCard[1] == 10) {
			player = 16;
		}else if(userCard[0] == 4 && userCard[1] == 6) {
			player = 15;
		}else{
			player = (userCard[0] + userCard[1]) % 10;
		}
		return player;
	}
	
	public int comScore(){
		if(comCard[0] == comCard[1]) {
			com = comCard[0] +20;
		}else if(comCard[0] == 1 && comCard[1] == 2) {
			com = 20;
		}else if(comCard[0] == 1 && comCard[1] == 4) {
			com = 19;
		}else if(comCard[0] == 1 && comCard[1] == 9) {
			com = 18;
		}else if(comCard[0] == 1 && comCard[1] == 10) {
			com = 17;
		}else if(comCard[0] == 4 && comCard[1] == 10) {
			com = 16;
		}else if(comCard[0] == 4 && comCard[1] == 6) {
			com = 15;
		}else{
			com = (comCard[0] + comCard[1]) % 10;
		}
		return com;
	}
	
	public void resultPrint(){
		
		int userScore = 0;
		int comScore = 0;
		
		int win=0;
		int lose =0;
		
		userScore = userScore();
		comScore = comScore();
		

		
		System.out.println("user Result :"+userScore);
		System.out.println("com Result :"+comScore);
		
		//승패
		if(userScore > comScore) {
			System.out.println("player  Win");
			win++;
		}else if(player == com){
			System.out.println("draw");
		}else {
			System.out.println("com Win");
			lose++;
		}
	}
}
