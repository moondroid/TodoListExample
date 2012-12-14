package com.example.it.moondroid.todolistexample;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;

public class TodoListItemView extends TextView {

	public TodoListItemView(Context context) {
		super(context);
		init();
	}

	public TodoListItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TodoListItemView(Context context, AttributeSet ats, int ds) {
		super(context, ats, ds);
		init();
	}

	private void init() {
		
	}

	@Override
	public void onDraw(Canvas canvas) {

		// Draw things on the canvas under the text ...

		// Render the text as usual using the TextView base class.
		super.onDraw(canvas);

		// Draw things on the canvas over the text ...

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent keyEvent) {
		// Perform some special processing ...
		// based on a particular key press ...
		
		
		// Use the existing functionality implemented by
		// the base class to respond to a key press event.
		return super.onKeyDown(keyCode, keyEvent);
	}
}
