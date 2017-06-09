package frame.project.ray.projectframe.ui.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager extends ViewPager {
  
    private boolean isScrollable = false;
  
    public CustomViewPager(Context context) {
        super(context);  
    }  
  
    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);  
    }  
  
    public void setScanScroll(boolean isCanScroll){  
        this.isScrollable = isCanScroll;
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (!isScrollable ) {
            return false;
        } else {
            return super.onTouchEvent(ev);
        }

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (!isScrollable) {
            return false;
        } else {
            return super.onInterceptTouchEvent(ev);
        }

    }
}