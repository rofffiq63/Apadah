package com.nurrofiqi.editor.apadah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView textView;
   Switch switcherSoalSatu, switcherSoalDua, switcherSoalTiga;

   public boolean isSoalSatu() {
	  return soalSatu;
   }

   public void setSoalSatu(boolean soalSatu) {
	  this.soalSatu = soalSatu;
   }

   public boolean isSoalDua() {
	  return soalDua;
   }

   public void setSoalDua(boolean soalDua) {
	  this.soalDua = soalDua;
   }

   public boolean isSoalTiga() {
	  return soalTiga;
   }

   public void setSoalTiga(boolean soalTiga) {
	  this.soalTiga = soalTiga;
   }

   boolean soalSatu, soalDua, soalTiga;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  textView = findViewById(R.id.status);
	  switcherSoalSatu = findViewById(R.id.switcher1);
	  switcherSoalDua = findViewById(R.id.switcher2);
	  switcherSoalTiga = findViewById(R.id.switcher3);
   }

   String checkSoal(){

	  if (soalSatu && soalDua && soalTiga) {
		 //kalo kondisi terpenuhi return value
		 return "kamu p3";
	  }

	  if (soalSatu && soalDua) {
		 //kalo kondisi terpenuhi return value
		 return "kamu p2";
	  }

	  if (soalSatu) {
		 //kalo kondisi terpenuhi return value
		 return "kamu p1";
	  }

	  //kalo gak ada kondisi yang terpenuhi return value
	  return "kamu bukan orang";
   }

   public void OnClick(View view) {
	  switch (view.getId()){
		 case R.id.switcher1:
			//ngecek state switcher soal nomor 1 kalo checked ngasih nilai soal satu true
			if (switcherSoalSatu.isChecked()) setSoalSatu(true);
			else setSoalSatu(false);
			//setiap switchernya di klik jalanin method cek soal
			textView.setText(checkSoal());
			break;
		 case R.id.switcher2:
			//sama
			if (switcherSoalDua.isChecked()) setSoalDua(true);
			else setSoalDua(false);
			//setiap switchernya di klik jalanin method cek soal
			textView.setText(checkSoal());
			break;
		 case R.id.switcher3:
			//sama
			if (switcherSoalTiga.isChecked()) setSoalTiga(true);
			else setSoalTiga(false);
			//setiap switchernya di klik jalanin method cek soal
			textView.setText(checkSoal());
			break;
	  }
   }
}
