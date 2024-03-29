package com.saud.gauchoblog;

import com.parse.ParseUser;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class Animation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
	super.onCreate(savedInstanceState);		
	setContentView(R.layout.activity_animation);
	
	ParseUser currentUser = ParseUser.getCurrentUser();
	if(currentUser != null) {
		if(currentUser.getBoolean("emailVerified")) {
    		finish();
    		Intent intent = new Intent(Animation.this, MapActivity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.slide_in_down,R.anim.slide_out_down);  
		}
	}
	
	blink();
    			
	}
	
	public void blink() {
		
	final TextView Text1 = (TextView) findViewById(R.id.Blink1);
	final TextView Text2 = (TextView) findViewById(R.id.Blink2);
	final ImageView Image = (ImageView)findViewById(R.id.NetworkingImage);

	AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
	anim.setDuration(1500);
	anim.setStartOffset(50);
	anim.setFillEnabled(true);
	anim.setFillAfter(true);
	Text1.startAnimation(anim);
		
	final AlphaAnimation anim1 = new AlphaAnimation(1.0f, 1.0f);
	anim1.setDuration(2000);
	anim1.setFillEnabled(true);
	anim1.setFillAfter(true);
		
	AlphaAnimation anim2 = new AlphaAnimation(0.0f, 1.0f);
	anim2.setDuration(1500);
	anim2.setStartOffset(250);
	anim2.setFillEnabled(true);
	anim2.setFillAfter(true);
	Image.startAnimation(anim2);
		
	final AlphaAnimation anim3 = new AlphaAnimation(1.0f, 1.0f);
	anim3.setDuration(2000);
	anim3.setFillEnabled(true);
	anim3.setFillAfter(true);
		
	AlphaAnimation anim4 = new AlphaAnimation(0.0f, 1.0f);
	anim4.setDuration(1500);
	anim4.setStartOffset(500);
	anim4.setFillEnabled(true);
	anim4.setFillAfter(true);
	Text2.startAnimation(anim4);
		
	final AlphaAnimation anim5 = new AlphaAnimation(1.0f, 1.0f);
	anim5.setDuration(2000);
	anim5.setFillEnabled(true);
	anim5.setFillAfter(true);
		
	anim.setAnimationListener(new AnimationListener() {
			
	@Override
	public void onAnimationEnd(android.view.animation.Animation animation) {
			
	Text1.startAnimation(anim1);
			
	}
		
	@Override
	public void onAnimationRepeat(android.view.animation.Animation animation) {
				
	}
		
	@Override
	public void onAnimationStart(android.view.animation.Animation animation) {
				
	}
	});
		
	anim1.setAnimationListener(new AnimationListener() {
			
	@Override
	public void onAnimationEnd(android.view.animation.Animation animation) {
		
		goToSignIn();
				
	}
	
	@Override
	public void onAnimationRepeat(android.view.animation.Animation animation) {
				
	}

	@Override
	public void onAnimationStart(android.view.animation.Animation animation) {
				
	}
	});
		
	anim2.setAnimationListener(new AnimationListener() {
			
	@Override
	public void onAnimationEnd(android.view.animation.Animation animation) {
		
		Image.startAnimation(anim3);
				
	}
		
	@Override
	public void onAnimationRepeat(android.view.animation.Animation animation) {
					
	}
		
	@Override
	public void onAnimationStart(android.view.animation.Animation animation) {
					
	}
	});
		
	anim4.setAnimationListener(new AnimationListener() {
			
	@Override
	public void onAnimationEnd(android.view.animation.Animation animation) {
				
		Text2.startAnimation(anim5);
			
	}
	
	@Override
	public void onAnimationRepeat(android.view.animation.Animation animation) {
				
	}
	
	@Override
	public void onAnimationStart(android.view.animation.Animation animation) {
				
	}
    });
		
	anim5.setAnimationListener(new AnimationListener() {
			
	@Override
	public void onAnimationEnd(android.view.animation.Animation animation) {
									
	}
		
	@Override
	public void onAnimationRepeat(android.view.animation.Animation animation) {
					
	}
		
	@Override
	public void onAnimationStart(android.view.animation.Animation animation) {
				
	}
	});
		
	}
	
	public void goToSignIn() {
		
		Intent intent = new Intent(Animation.this, SignIn.class);
		startActivity(intent);
		finish();
		
	}

}