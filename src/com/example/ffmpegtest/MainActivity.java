package com.example.ffmpegtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ffmpegtext.R;
import com.shadowsong.avhelper.FFMpegUtils;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((TextView) findViewById(R.id.hello_textView)).setText("result:"
				+ FFMpegUtils.getString());
	}
}
