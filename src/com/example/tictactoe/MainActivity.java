/*
 * @Author: Timothy Deaner
 * @Date: Last Update: 4/28
 * @Version: 1.4
 * 
 * This is a very basic tic tac toe game on android. The game opens up to the game right off the bat, has the 9 buttons for the X's
 * and O's. Their is a new game button to reset the game and a text display to display who won the game.
 * 
 */

package com.example.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public boolean turn = false;//see whos turn it is. False for X, true for O.
	public final Button[] buttons = new Button[15];//the buttons to update the buttons being displays and what happens when they are clicked.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
	
		//this text intiates the buttons to their equivalent buttons on the display.
		buttons[0] = (Button) findViewById(R.id.button1);
		buttons[1] = (Button) findViewById(R.id.button2);
		buttons[2] = (Button) findViewById(R.id.button3);
		buttons[3] = (Button) findViewById(R.id.button4);
		buttons[4] = (Button) findViewById(R.id.button5);
		buttons[5] = (Button) findViewById(R.id.button6);
		buttons[6] = (Button) findViewById(R.id.button7);
		buttons[7] = (Button) findViewById(R.id.button8);
		buttons[8] = (Button) findViewById(R.id.button9);
		buttons[9] = (Button) findViewById(R.id.button10);
	
	
		buttons[9].setOnClickListener(new View.OnClickListener() {//this listener is for the new game button, it resets all the sqaures and display
			public void onClick(View v) {
        	
				String label = " ";
				TextView output = (TextView)findViewById(R.id.textView1);
				output.setText(" ");//resets the text box to blank

				turn = false;
        	
				for(int i=0; i<9; i++){//resets each X,O box to blank and to interact with them.
					buttons[i].setText(label);
					buttons[i].setEnabled(true);
				}
        	
        	
			}
		});

    
    
		buttons[0].setOnClickListener(new View.OnClickListener() {//listener for button top left button
			public void onClick(View v) {
				if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[0].setText(label);
	        	buttons[0].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[0].setText(label);
	            	buttons[0].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[1].setOnClickListener(new View.OnClickListener() {//listener for top middle button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	
	        	buttons[1].setText(label);
	        	buttons[1].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[1].setText(label);
	            	buttons[1].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[2].setOnClickListener(new View.OnClickListener() {//listener for top right button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	
	        	buttons[2].setText(label);
	        	buttons[2].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[2].setText(label);
	            	buttons[2].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[3].setOnClickListener(new View.OnClickListener() {//listener for middle left button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[3].setText(label);
	        	buttons[3].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[3].setText(label);
	            	buttons[3].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[4].setOnClickListener(new View.OnClickListener() {//listener for middle, middle button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[4].setText(label);
	        	buttons[4].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[4].setText(label);
	            	buttons[4].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[5].setOnClickListener(new View.OnClickListener() {//listener for middle right button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[5].setText(label);
	        	buttons[5].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[5].setText(label);
	            	buttons[5].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[6].setOnClickListener(new View.OnClickListener() {//listener for bottom left button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[6].setText(label);
	        	buttons[6].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[6].setText(label);
	            	buttons[6].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[7].setOnClickListener(new View.OnClickListener() {//listener for bottom middle button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[7].setText(label);
	        	buttons[7].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[7].setText(label);
	            	buttons[7].setEnabled(false);
	            	turn=false;
	        	}
	        
	        	checkWinner();
	        	
	        }
	    });
	    
	    buttons[8].setOnClickListener(new View.OnClickListener() {//listener for bottom right button
	        public void onClick(View v) {
	        	if(turn == false){
	        	
	        	String label = "X";
	        	
	        	buttons[8].setText(label);
	        	buttons[8].setEnabled(false);
	        	turn=true;
	        	}
	        	else{
	        		String label = "O";
	        		
	        		buttons[8].setText(label);
	            	buttons[8].setEnabled(false);
	            	turn=false;
	        		
	        	}
	        
	        	checkWinner();
	        	
	        	
	        }
	    });
	    
	   
	    	
	    	
	    
	    
		}
		
	/*
	 * this method checks the values in a 3x3 line to see if a player won or not.
	 * The method also outputs to the user which player won the game in the text field.
	 * 
	 */
		public void checkWinner(){
				
			if(buttons[0].getText().equals(buttons[1].getText()) && buttons[1].getText().equals(buttons[2].getText())){
				
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[0].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
				
				
			}
			else if(buttons[3].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[5].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[3].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
				
			}
			else if(buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[6].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
	
			}
			else if(buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[0].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
	
			}
			else if(buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[1].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
				
			}
			else if(buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[2].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
			}
			else if(buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[0].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
				
			}
			else if(buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText())){
				TextView output = (TextView)findViewById(R.id.textView1);
				String a = (String) buttons[2].getText();
				
				if(a=="X") {
					a = "Player 1 Wins!";
					output.setText(String.valueOf(a));
				}
				
				if(a=="O"){
					a = "Player 2 Wins!";
					output.setText(String.valueOf(a));
				}
				
				
			}
			
			
			
		}
			
		
		
}


