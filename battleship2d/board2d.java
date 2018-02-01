public class board2d{

	
	int[][] locationCells = new int[7][7];
	int numOfHits = 0;
	int numOfGuess = 0;

	void createBoard(){
		String boatDir = getDir();
		System.out.println(boatDir);

		if(boatDir.equals("up")){
			int yAxes = ((int)(Math.random()*5))+2;
			int xAxes = (int)(Math.random()*7);
			System.out.println("y axis: " + yAxes);
			System.out.println("x axis: " + xAxes);

			locationCells[yAxes][xAxes] = 1;
			locationCells[--yAxes][xAxes] = 1;
			locationCells[--yAxes][xAxes] = 1;
			for(int i=0; i<7; i++){
				
				for(int j=0; j<7; j++){
					System.out.print(locationCells[i][j]);
				}
				System.out.println();
			}
		}
		else if(boatDir.equals("down")){
			int yAxes = (int)(Math.random()*5);
			int xAxes = (int)(Math.random()*7);
			System.out.println("y axis: " + yAxes);
			System.out.println("x axis: " + xAxes);

			locationCells[yAxes][xAxes] = 1;
			locationCells[++yAxes][xAxes] = 1;
			locationCells[++yAxes][xAxes] = 1;
			for(int i=0; i<7; i++){
				for(int j=0; j<7; j++){
					System.out.print(locationCells[i][j]);
				}
				System.out.println();
			}
		}
		else if(boatDir.equals("left")){
			int yAxes = (int)(Math.random()*7);
			int xAxes = ((int)(Math.random()*5))+2;
			System.out.println("y axis: " + yAxes);
			System.out.println("x axis: " + xAxes);

			locationCells[yAxes][xAxes] = 1;
			locationCells[yAxes][--xAxes] = 1;
			locationCells[yAxes][--xAxes] = 1;
			for(int i=0; i<7; i++){
				for(int j=0; j<7; j++){
					System.out.print(locationCells[i][j]);
				}
				System.out.println();
			}
		}
		else if(boatDir.equals("right")){
			int yAxes = (int)(Math.random()*7);
			int xAxes = (int)(Math.random()*5);
			System.out.println("y axis: " + yAxes);
			System.out.println("x axis: " + xAxes);

			locationCells[yAxes][xAxes] = 1;
			locationCells[yAxes][++xAxes] = 1;
			locationCells[yAxes][++xAxes] = 1;
			for(int i=0; i<7; i++){
				for(int j=0; j<7; j++){
					System.out.print(locationCells[i][j]);
				}
				System.out.println();
			}
		}
	}

	//chooses direction of the boat so starting point can be made accordingly 
	//eg. for up has to start 2 from the top to leave room
	String getDir(){
		int dir = (int)(Math.random()*9);
		System.out.println(dir);
		if(dir <= 2){
			return "up";
			//System.out.println("up");
		}
		else if(dir <= 4){
			return "down";
			//System.out.println("down");
		}
		else if(dir <= 6){
			return "left";
			//System.out.println("left");
		}
		else if(dir <= 8){
			return "right";
			//System.out.println("right");
		}
		else{
			System.out.println("error picking direction");
			return "error";
		}
	}

	String checkYourself(String yGuess, String xGuess){
		numOfGuess++;
		int bomblocY = Integer.parseInt(yGuess);
		int bomblocX = Integer.parseInt(xGuess);
		//boolean hit = false;

		if(locationCells[bomblocY][bomblocX] == 1){
			numOfHits++;
			if(numOfHits == 3){
				//hit = true;
				return "you sunk the battleship";
			}
			else{
				//hit = true
				return "hit";
			}
		}
		else{
			return "missed try again";
		}
	}



}