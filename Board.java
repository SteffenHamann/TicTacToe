public class Board {
	
	String [] [] boardInput = new String[3][3];
	boolean winner;
	boolean boardEmpty;
	
	public void clearBoard(){
		for(int i = 0; i <= 2;i++){
			for(int j = 0; j <= 2;j++){
				boardInput[i][j] = "";
			}
		}
	}

	
	public void setMark(String mark, int x, int y){
		
		//check X
		if(x >= 0 && x <= 2){
			
			//check Y
			if(y >= 0 && y <= 2){
					
					boardInput[x][y] = mark;		
			}
			
			else{
				throw new ArithmeticException("Ungültige position Y: [ 0 , 1 , 2]  sind nur erlaubt");
			}
			
		}
		else{
			throw new ArithmeticException("Ungültige position X: [ 0 , 1 , 2 ] sind nur erlaubt");
		}
			
	}

	public boolean emptyBoardCheck(){
		
		
		for(int i = 0; i <= 2;i++){
			for(int j = 0; j <= 2;j++){
				if(boardInput[i][j].equals("")){
					
					boardEmpty = true;
				}
				else
				{
					boardEmpty = false;
					break;
				}
			}
		}
		
		return boardEmpty;
		
	}
	
	public boolean hasWinner(){
		
		//check x winner
		
		if(boardInput[0][0].equalsIgnoreCase("x") && boardInput[0][1].equalsIgnoreCase("x")&& boardInput[0][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[1][0].equalsIgnoreCase("x") && boardInput[1][1].equalsIgnoreCase("x")&& boardInput[1][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[2][0].equalsIgnoreCase("x") && boardInput[2][1].equalsIgnoreCase("x")&& boardInput[2][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[0][0].equalsIgnoreCase("x") && boardInput[1][0].equalsIgnoreCase("x")&& boardInput[2][0].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[0][1].equalsIgnoreCase("x") && boardInput[1][1].equalsIgnoreCase("x")&& boardInput[2][1].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[0][2].equalsIgnoreCase("x") && boardInput[1][2].equalsIgnoreCase("x")&& boardInput[2][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[0][0].equalsIgnoreCase("x") && boardInput[1][1].equalsIgnoreCase("x")&& boardInput[2][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
		
		else if(boardInput[2][0].equalsIgnoreCase("x") && boardInput[1][1].equalsIgnoreCase("x")&& boardInput[0][2].equalsIgnoreCase("x") ){
			winner = true;			
		}
			
		//check y winner
		
		else if(boardInput[0][0].equalsIgnoreCase("o") && boardInput[0][1].equalsIgnoreCase("o")&& boardInput[0][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[1][0].equalsIgnoreCase("o") && boardInput[1][1].equalsIgnoreCase("o")&& boardInput[1][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[2][0].equalsIgnoreCase("o") && boardInput[2][1].equalsIgnoreCase("o")&& boardInput[2][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[0][0].equalsIgnoreCase("o") && boardInput[1][0].equalsIgnoreCase("o")&& boardInput[2][0].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[0][1].equalsIgnoreCase("o") && boardInput[1][1].equalsIgnoreCase("o")&& boardInput[2][1].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[0][2].equalsIgnoreCase("o") && boardInput[1][2].equalsIgnoreCase("o")&& boardInput[2][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[0][0].equalsIgnoreCase("o") && boardInput[1][1].equalsIgnoreCase("o")&& boardInput[2][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else if(boardInput[2][0].equalsIgnoreCase("o") && boardInput[1][1].equalsIgnoreCase("o")&& boardInput[0][2].equalsIgnoreCase("o") ){
			winner = true;			
		}
		
		else{
			winner = false;
		}
		
		return winner;
		
	}

}