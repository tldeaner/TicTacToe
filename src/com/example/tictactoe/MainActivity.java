package com.example.tictactoe;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	public boolean turn = false;
	public final Button[] buttons = new Button[15];
	public final String[] letters = new String[15];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	int player1 =1;
	int player2 =2;
	
	
	//output.setText("Hello!");
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
	
	
	buttons[9].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	
        	String label = " ";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
            turn = false;
        	
            for(int i=0; i<9; i++){
            	buttons[i].setText(label);
            	buttons[i].setEnabled(true);
            }
        	
        	
        }
    });

    
    
    buttons[0].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            //StringBuilder sb = new StringBuilder();
            //sb.append( label .substring(0,1) );
            //sb.append( label .substring(1).toLowerCase() );
            //label = sb.toString();
        	
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
    
    buttons[1].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
        	/*
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	*/
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
    
    buttons[2].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
        	/*
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	*/
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
    
    buttons[3].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	
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
    
    buttons[4].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	
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
    
    buttons[5].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	
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
    
    buttons[6].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	
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
    
    buttons[7].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            //StringBuilder sb = new StringBuilder();
            //sb.append( label .substring(0,1) );
            //sb.append( label .substring(1).toLowerCase() );
            //label = sb.toString();
        	
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
    
    buttons[8].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
        	if(turn == false){
        	
        	String label = "X";
            StringBuilder sb = new StringBuilder();
            sb.append( label .substring(0,1) );
            sb.append( label .substring(1).toLowerCase() );
            label = sb.toString();
        	
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
			
		}
		else if(buttons[6].getText().equals(buttons[7].getText()) && buttons[7].getText().equals(buttons[8].getText())){

		}
		else if(buttons[0].getText().equals(buttons[3].getText()) && buttons[3].getText().equals(buttons[6].getText())){

		}
		else if(buttons[1].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[7].getText())){
			
		}
		else if(buttons[2].getText().equals(buttons[5].getText()) && buttons[5].getText().equals(buttons[8].getText())){
			
		}
		else if(buttons[0].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[8].getText())){
			
		}
		else if(buttons[2].getText().equals(buttons[4].getText()) && buttons[4].getText().equals(buttons[6].getText())){
			
		}
		
		
	}
		
		
		
}


