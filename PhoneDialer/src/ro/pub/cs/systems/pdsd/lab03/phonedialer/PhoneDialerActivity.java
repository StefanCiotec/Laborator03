package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.View;
import android.widget.ImageView;


public class PhoneDialerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        
        final EditText mEdit   = (EditText)findViewById(R.id.editText1);
        
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "1");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "2");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "3");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button4 = (Button) findViewById(R.id.button7);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "4");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button5 = (Button) findViewById(R.id.button8);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "5");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button6 = (Button) findViewById(R.id.button9);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "6");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button7 = (Button) findViewById(R.id.button10);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "7");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button8 = (Button) findViewById(R.id.button11);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "8");
            	mEdit.setSelection(mEdit.length());
            	
            }
        });
        final Button button9 = (Button) findViewById(R.id.button12);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "9");
            	mEdit.setSelection(mEdit.length());
            }
        });
        final Button button0 = (Button) findViewById(R.id.button5);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "0");
            	mEdit.setSelection(mEdit.length());
            }
        });
        final Button button_star = (Button) findViewById(R.id.button4);
        button_star.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "*");
            	mEdit.setSelection(mEdit.length());
            }
        });
        final Button button_hash = (Button) findViewById(R.id.button6);
        button_hash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	mEdit.setText(mEdit.getText().toString() + "#");
            	mEdit.setSelection(mEdit.length());
            }
        });
        final ImageButton button_del = (ImageButton) findViewById(R.id.imageButton1);
        button_del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String s = mEdit.getText().toString();
            	if (s.length() > 0) {
            		s = s.substring(0, s.length() - 1);
            		mEdit.setText(s);
            		mEdit.setSelection(mEdit.length());
            	}
            }
        });
        final ImageButton button_call = (ImageButton) findViewById(R.id.imageButton2);
        button_call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	String phoneNumber = mEdit.getText().toString();
            	Intent intent = new Intent(Intent.ACTION_CALL);
            	intent.setData(Uri.parse("tel:"+phoneNumber));
            	startActivity(intent);
            }
        });
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
