package com.example.annotationdemo;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

	@ViewById
	TextView tv;

	@AfterViews
	void afterView() {
		tv.setText("好啊好啊");
	}

	@Click(R.id.tv)
	void onClick() {
		tv.setText("测试而已");
	}
}
