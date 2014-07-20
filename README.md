FasterAnimationsContainer
============================
FasterAnimationsContainer will help you to avoid from OutOfMemoryError. Android loads all the drawables at once, so animation with many frames causes this error. This class loads & sets and releases an image on background thread.

Easy to implement
-------------------


```java
public class ExampleActivity extends Activity {
  	FasterAnimationsContainer mFasterAnimationsContainer;
  	private static final int[] IMAGE_RESOURCES = { R.drawable.anim_1,
  			R.drawable.anim_2, R.drawable.anim_3, R.drawable.anim_4,
  			R.drawable.anim_5, R.drawable.anim_6, R.drawable.anim_7,
  			R.drawable.anim_8 };
  	
  	private static final int ANIMATION_INTERVAL = 500;// 500ms
  
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
```
