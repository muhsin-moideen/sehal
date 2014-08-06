package com.awesome.sehal;



import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	//DECLARING VARIABLES
		Button nine,eig,sev,six,fiv,four,thr,two,one,zero,dot,plus,mins,div,mul,eq,cl,perc,nxt;
	    EditText et;
	    String s = " ";
	    float result = 0;
	    char lO = ' ';
	    int fl=0;
	    
	    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		
			//ASSIGNING THE BUTTON,TEXTAREA..
			nine=(Button)findViewById(R.id.buttonnine);
	        eig=(Button)findViewById(R.id.buttoneight);
	        sev=(Button)findViewById(R.id.buttonseven);
	        six=(Button)findViewById(R.id.buttonsix);
	        fiv=(Button)findViewById(R.id.buttonfive);
	        four=(Button)findViewById(R.id.buttonfour);
	        thr=(Button)findViewById(R.id.buttonthree);
	        two=(Button)findViewById(R.id.buttontwo);
	        one=(Button)findViewById(R.id.buttonone);
	        zero=(Button)findViewById(R.id.buttonzero);
	        dot=(Button)findViewById(R.id.buttonpoint);
	        plus=(Button)findViewById(R.id.buttonadd);
	        mins=(Button)findViewById(R.id.buttonsub);
	        div=(Button)findViewById(R.id.buttondiv);
	        mul=(Button)findViewById(R.id.buttonmul);
	        eq=(Button)findViewById(R.id.buttonequal);
	        cl=(Button)findViewById(R.id.buttonclear);
	        perc=(Button)findViewById(R.id.buttonpercentage);
	        et=(EditText)findViewById(R.id.editText1);
	        nxt=(Button)findViewById(R.id.btn);
	        
	        
	        
	        
	        //SETING ON CLICK LISTNER
	        nine.setOnClickListener(this);
	        eig.setOnClickListener(this);
	        sev.setOnClickListener(this);
	        six.setOnClickListener(this);
	        fiv.setOnClickListener(this);
	        four.setOnClickListener(this);
	        thr.setOnClickListener(this);
	        two.setOnClickListener(this);
	        one.setOnClickListener(this);
	        dot.setOnClickListener(this);
	        plus.setOnClickListener(this);
	        mins.setOnClickListener(this);
	        div.setOnClickListener(this);
	        mul.setOnClickListener(this);
	        eq.setOnClickListener(this);
	        cl.setOnClickListener(this);
	        et.setOnClickListener(this);
	        zero.setOnClickListener(this);
	        perc.setOnClickListener(this);
	        nxt.setOnClickListener(this);
		}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			s=et.getText().toString();
			switch(v.getId())
	        {
	        	case R.id.buttonzero:
	        		if (s.equals("0"))
	                {
	           		 String inDigit="0";
	           		 s=inDigit;
	                }
	               else
	                {
	               	String inDigit="0";
						s+=inDigit;
	                }
	        		et.setText(s);
	        		break;
	            case R.id.buttonone:
	            	 if (s.equals("0"))
	                 {
	            		 String inDigit="1";
	            		 s=inDigit;
	                 }
	                else
	                 {
	                	String inDigit="1";
						s+=inDigit;
	                 }
	            	et.setText(s);
	               break;
	               
	            case R.id.buttontwo:
	            	if (s.equals("0"))
	                {
	            		 String inDigit="2";
	                     s=inDigit;
	                }
	                else
	                {	
	                	String inDigit="2";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	                
	            case R.id.buttonthree:
	            	if (s.equals("0"))
	                {
	            		String inDigit="3";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="3";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttonfour:
	            	if (s.equals("0"))
	                {
	            		String inDigit="4";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="4";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttonfive:
	            	if (s.equals("0"))
	                {
	            		String inDigit="5";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="5";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttonsix:
	            	if (s.equals("0"))
	                {
	            		String inDigit="6";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="6";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttonseven:
	            	if (s.equals("0"))
	                {
	            		String inDigit="7";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="7";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttoneight:
	            	if (s.equals("0"))
	                {
	            		String inDigit="8";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="8";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            	
	            case R.id.buttonnine:
	            	if (s.equals("0"))
	                {
	            		String inDigit="9";
	                    s=inDigit;
	                }
	                else
	                {
	                	String inDigit="9";
						s+=inDigit;
	                }
	            	et.setText(s);
	            	break;
	            
	            case R.id.buttonpoint:
	            	
	            	if(s.equals(".789"))
	            	{
	            		et.setText("0000");
	            		Intent newIntent=new Intent(MainActivity.this,MainActivity2.class);
	            		startActivity(newIntent);
	            	}
	            	if(fl!=1)
	            	{
	            	if (s.equals("0"))
	                {
	           		 String inDigit=".";
	           		 s=inDigit;
	           		 fl=1;
	                }
	               else
	                {
	               	String inDigit=".";
						s+=inDigit;
						fl=1;
	                }
	            	
	            	et.setText(s);
	            	}
	            	break;
	           
	            case R.id.buttonadd:
	            	compute();
	            	lO = '+';
	            	fl=0;
	            	break;
	            case R.id.buttonsub:
	            	compute();
	            	lO = '-';
	            	fl=0;
	            	break;
	            case R.id.buttondiv:
	            	compute();
	            	lO = '/';
	            	fl=0;
	            	break;
	            case R.id.buttonmul:
	            	compute();
	            	lO = '*';
	            	fl=0;
	            	break;
	            case R.id.buttonequal:
	            	compute();
	            	lO = '=';
	            	fl=0;
	            	break;
	            case R.id.buttonpercentage:
	            	lO = '%';
	            	compute();
	            	break;
	            case R.id.buttonclear:
	            	result = 0;
	            	s = "0";
	            	lO = ' ';
	            	et.setText("0");
	            	fl=0;
	            	break;
	            	
	            case R.id.btn:
	            	float code = Float.parseFloat(s);
	            	
	            	if(code==789)
	            	{
	            		setContentView(R.layout.sa);
	            	}
	            	else
	            	{
	            		et.setText("INVALID CODE");
	            	}
	            	break;
	        }
		}
		
		private void compute() 
	    {
	        // TODO Auto-generated method stub
	        float inNum = Integer.parseInt(s);
	        s = "0";
	        if (lO == ' ') 
	        {
	            result = inNum;
	        } 
	        else if (lO == '+') 
	        {
	            result += inNum;
	        } 
	        else if (lO == '-') 
	        {
	            result -= inNum;
	        } 
	        else if (lO == '*') 
	        {
	            result *= inNum;
	        } 
	        else if (lO == '/') 
	        {
	            result /= inNum;
	        } 
	        else if (lO == '%') 
	        {	
	            result = inNum/100;
	        } 
	        else if (lO == '=') 
	        {
	           
	        }	        
	        et.setText(String.valueOf(result));
	    }
	}