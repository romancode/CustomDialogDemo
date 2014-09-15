package com.example.customdialogdemo;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.Dialog;

public class MainActivity extends Activity {
	
	Button btnShowDialog; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnShowDialog=(Button)findViewById(R.id.btnShowDialog);
		
		btnShowDialog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Create custom dialog object
                final Dialog dialog = new Dialog(MainActivity.this);
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialog_window);
                // Set dialog title
                dialog.setTitle("Item Details");
 
                // set values for custom dialog components - text, image and button
             /*   TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Custom dialog Android example.");
                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
                image.setImageResource(R.drawable.image0);*/
 
                dialog.show();
                 
                Button declineButton = (Button) dialog.findViewById(R.id.btnCancel);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });
			}
		});
	}	
}
