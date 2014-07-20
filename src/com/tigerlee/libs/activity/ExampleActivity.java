package com.tigerlee.libs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.tigerlee.libs.FasterAnimationsContainer;
import com.tigerlee.libs.R;

public class ExampleActivity extends Activity {

	FasterAnimationsContainer mFasterAnimationsContainer;
	private static final int[] IMAGE_RESOURCES = { R.drawable.anim_1,
			R.drawable.anim_2, R.drawable.anim_3, R.drawable.anim_4,
			R.drawable.anim_5, R.drawable.anim_6, R.drawable.anim_7,
			R.drawable.anim_8 };
	
	private static final int ANIMATION_INTERVAL = 500;// 200ms

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example);
		ImageView imageView = (ImageView) findViewById(R.id.imageview);
		mFasterAnimationsContainer = FasterAnimationsContainer
				.getInstance(imageView);
		mFasterAnimationsContainer.addAllFrames(IMAGE_RESOURCES,
				ANIMATION_INTERVAL);
		mFasterAnimationsContainer.start();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mFasterAnimationsContainer.stop();
	}
}
