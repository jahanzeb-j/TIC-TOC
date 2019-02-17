/*

Created by jahanzeb jabbar
*/
package com.example.tictoc;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivityTC extends Activity {

	boolean b=true; String identify1="pa",identify2="pa",identify3="pa",identify4="pa",identify5="pa",identify6="pa",identify7="pa",identify8="pa",identify9="pa";
	String var;
	static ImageView img1;
	static ImageView img2;
	static ImageView img3;
	static ImageView img4;
	static ImageView img5;
	static ImageView img6;
	static ImageView img7;
	static ImageView img8;
	static ImageView img9;
	static Button resetbtn;
	// Lines 
	static ImageView lineH1;
	static ImageView lineH2;
	static ImageView lineH3;
	static ImageView lineV1;
	static ImageView lineV2;
	static ImageView lineV3;
	static ImageView lineD357;
	static ImageView lineD159;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_tc);
		
		img1=(ImageView) findViewById(R.id.imageView2);
		img2=(ImageView) findViewById(R.id.ImageView01);
		img3=(ImageView) findViewById(R.id.ImageView02);
		img4=(ImageView) findViewById(R.id.ImageView03);
		img5=(ImageView) findViewById(R.id.ImageView04);
		img6=(ImageView) findViewById(R.id.ImageView05);
		img7=(ImageView) findViewById(R.id.ImageView06);
		img8=(ImageView) findViewById(R.id.ImageView07);
		img9=(ImageView) findViewById(R.id.ImageView08);
		resetbtn= (Button) findViewById(R.id.button1);
		//Lines
		
		lineH1= (ImageView) findViewById(R.id.line_h1);
		lineH2= (ImageView) findViewById(R.id.line_h2);
		lineH3= (ImageView) findViewById(R.id.line_h3);
		lineV1= (ImageView) findViewById(R.id.line_v1);
		lineV2= (ImageView) findViewById(R.id.line_v2);
		lineV3= (ImageView) findViewById(R.id.line_v3);
		lineD357= (ImageView) findViewById(R.id.diagonal_357);
		lineD159= (ImageView) findViewById(R.id.diagonal_159);
		
		
		
		
		//Create actions 
		img1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify1="O";
					b=false;
				img1.setImageResource(R.drawable.zero);
				}
				else {
					identify1="X";
					b=true;
					img1.setImageResource(R.drawable.cross);
				}
				img1.setClickable(false);
				var=identify1;
				WIN(var);
				}
		});
		//image2
           img2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify2="O";
					b=false;
				img2.setImageResource(R.drawable.zero);
				}
				else {
					identify2="X";
					b=true;
					img2.setImageResource(R.drawable.cross);
				}
				img2.setClickable(false);
				var=identify2;
				WIN(var);
				}
		});
         //image3
           img3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify3="O";
					b=false;
				img3.setImageResource(R.drawable.zero);
				}
				else {
					identify3="X";
					b=true;
					img3.setImageResource(R.drawable.cross);
				}
				img3.setClickable(false);
				var=identify3;
				WIN(var);
				}
		});
         //image4
           img4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify4="O";
					b=false;
				img4.setImageResource(R.drawable.zero);
				}
				else {
					identify4="X";
					b=true;
					img4.setImageResource(R.drawable.cross);
				}
				img4.setClickable(false);
				var=identify4;
				WIN(var);
				}
		});
         //image5
           img5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify5="O";
					b=false;
				img5.setImageResource(R.drawable.zero);
				}
				else {
					identify5="X";
					b=true;
					img5.setImageResource(R.drawable.cross);
				}
				img5.setClickable(false);
				var=identify5;
				WIN(var);
				}
		});
         //image6
           img6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify6="O";
					b=false;
				img6.setImageResource(R.drawable.zero);
				}
				else {
					identify6="X";
					b=true;
					img6.setImageResource(R.drawable.cross);
				}
				img6.setClickable(false);
				var=identify6;
				WIN(var);
				}
		});
         //image7
           img7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify7="O";
					b=false;
				img7.setImageResource(R.drawable.zero);
				}
				else {
					identify7="X";
					b=true;
					img7.setImageResource(R.drawable.cross);
				}
				img7.setClickable(false);
				var=identify7;
				WIN(var);
				}
		});
         //image8
           img8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify8="O";
					b=false;
				img8.setImageResource(R.drawable.zero);
				}
				else {
					identify8="X";
					b=true;
					img8.setImageResource(R.drawable.cross);
				}
				img8.setClickable(false);
				var=identify8;
				WIN(var);
				}
		});
         //image9
           img9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b){
					identify9="O";
					b=false;
				img9.setImageResource(R.drawable.zero);
				}
				else {
					identify9="X";
					b=true;
					img9.setImageResource(R.drawable.cross);
				}
				img9.setClickable(false);
				var=identify9;
				WIN(var);
				}
		});
           
           resetbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Reset();	
			}
		});
          
		
	}

	public void WIN(String v){
	  	  
		if(identify1==v && identify2==v && identify3==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineH1.setImageResource(R.drawable.linehosrizontal);
			
			}
		else if(identify3==v && identify5==v && identify7==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineD357.setImageResource(R.drawable.digonal1);
			}
		
		else if(identify1==v && identify4==v && identify7==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineV1.setImageResource(R.drawable.linevertical);
			}
		else if(identify2==v && identify5==v && identify8==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineV2.setImageResource(R.drawable.linevertical);
			}
		else if(identify3==v && identify6==v && identify9==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineV3.setImageResource(R.drawable.linevertical);
			}
		else if(identify1==v && identify5==v && identify9==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineD159.setImageResource(R.drawable.digonal2);
			}
		else if(identify4==v && identify5==v && identify6==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineH2.setImageResource(R.drawable.linehosrizontal);
			}
		else if(identify7==v && identify8==v && identify9==v){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Congratz you  WIN !!");
			alt.show();
			lineH3.setImageResource(R.drawable.linehosrizontal);
			}
		else if(identify1!="pa" && identify2!="pa" && identify3!="pa" && identify4!="pa" && identify5!="pa" && identify6!="pa" &&
				identify7!="pa" && identify8!="pa" && identify9!="pa"){
			AlertDialog alt=new AlertDialog.Builder(this).setPositiveButton("OK", null).create();
			alt.setTitle("Draw !! Try Again !!");
			alt.show();
		}
		
		
    }
	public void Reset(){
		img1.setClickable(true);
		img2.setClickable(true);
		img3.setClickable(true);
		img4.setClickable(true);
		img5.setClickable(true);
		img6.setClickable(true);
		img7.setClickable(true);
		img8.setClickable(true);
		img9.setClickable(true);
		
		img1.setImageResource(0);
		img2.setImageResource(0);
		img3.setImageResource(0);
		img4.setImageResource(0);
		img5.setImageResource(0);
		img6.setImageResource(0);
		img7.setImageResource(0);
		img8.setImageResource(0);
		img9.setImageResource(0);
		b=true;
		var="p";
		identify1="pa";
		identify2="pa";
		identify3="pa";
		identify4="pa";
		identify5="pa";
		identify6="pa";
		identify7="pa";
		identify8="pa";
		identify9="pa";
		
		lineH1.setImageResource(0);
		lineH2.setImageResource(0);
		lineH3.setImageResource(0);
		lineV1.setImageResource(0);
		lineV2.setImageResource(0);
		lineV3.setImageResource(0);
		lineD159.setImageResource(0);
		lineD357.setImageResource(0);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_tc, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item){
		AlertDialog alt=new AlertDialog.Builder(this).create();
		alt.setTitle("Created by JaZi");
		alt.setMessage("TIC TOC !! Play and Enjoy");
		alt.show();
		
		return true;
	}

}
