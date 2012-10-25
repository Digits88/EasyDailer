package com.aboutrafi.fkrafi.easydailer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EasyDailer extends Activity implements OnClickListener {

	TextView tvNumber;
	Button bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine,
			bZero, bStar, bHash, bCall, bBackSpace;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_easy_dailer);
		Init();
	}

	private void Init() {

		tvNumber = (TextView) findViewById(R.id.tvNumber);

		bOne = (Button) findViewById(R.id.bOne);
		bOne.setOnClickListener(this);
		bTwo = (Button) findViewById(R.id.bTwo);
		bTwo.setOnClickListener(this);
		bThree = (Button) findViewById(R.id.bThree);
		bThree.setOnClickListener(this);
		bFour = (Button) findViewById(R.id.bFour);
		bFour.setOnClickListener(this);
		bFive = (Button) findViewById(R.id.bFive);
		bFive.setOnClickListener(this);
		bSix = (Button) findViewById(R.id.bSix);
		bSix.setOnClickListener(this);

		bSeven = (Button) findViewById(R.id.bSeven);
		bSeven.setOnClickListener(this);
		bEight = (Button) findViewById(R.id.bEight);
		bEight.setOnClickListener(this);
		bNine = (Button) findViewById(R.id.bNine);
		bNine.setOnClickListener(this);
		bZero = (Button) findViewById(R.id.bZero);
		bZero.setOnClickListener(this);
		bStar = (Button) findViewById(R.id.bStar);
		bStar.setOnClickListener(this);
		bHash = (Button) findViewById(R.id.bHash);
		bHash.setOnClickListener(this);

		bCall = (Button) findViewById(R.id.bCall);
		bCall.setOnClickListener(this);
		bBackSpace = (Button) findViewById(R.id.bBackSpace);
		bBackSpace.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_easy_dailer, menu);
		return true;
	}

	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.bCall:
			String number = tvNumber.getText().toString();
			if (number.trim().length() > 0) {
				try {
					Intent phoneCallIntent = new Intent(Intent.ACTION_CALL);
					phoneCallIntent.setData(Uri.parse("tel:" + number));
					startActivity(phoneCallIntent);
				} catch (Exception exp) {
					Log.e("Dailed", "Dailing Error : " + exp);
				}
				finish();
			} else {
				Toast.makeText(this, "Invalid Phone Number!", Toast.LENGTH_LONG)
						.show();
			}
			break;
		case R.id.bBackSpace:
			String text = tvNumber.getText().toString();
			if (text.trim().length() > 0) {
				tvNumber.setText(text.substring(0, text.length() - 1));
			}
			break;
		case R.id.bOne:
			tvNumber.setText(tvNumber.getText() + "1");
			break;
		case R.id.bTwo:
			tvNumber.setText(tvNumber.getText() + "2");
			break;
		case R.id.bThree:
			tvNumber.setText(tvNumber.getText() + "3");
			break;
		case R.id.bFour:
			tvNumber.setText(tvNumber.getText() + "4");
			break;
		case R.id.bFive:
			tvNumber.setText(tvNumber.getText() + "5");
			break;
		case R.id.bSix:
			tvNumber.setText(tvNumber.getText() + "6");
			break;
		case R.id.bSeven:
			tvNumber.setText(tvNumber.getText() + "7");
			break;
		case R.id.bEight:
			tvNumber.setText(tvNumber.getText() + "8");
			break;
		case R.id.bNine:
			tvNumber.setText(tvNumber.getText() + "9");
			break;
		case R.id.bZero:
			tvNumber.setText(tvNumber.getText() + "0");
			break;
		case R.id.bStar:
			tvNumber.setText(tvNumber.getText() + "*");
			break;
		case R.id.bHash:
			tvNumber.setText(tvNumber.getText() + "#");

		}

	}
}
