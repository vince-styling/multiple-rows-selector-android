package com.vincestyling.multiple_rows_selector;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

import java.util.Arrays;

public class FinderListView extends ListView {
    public FinderListView(Context context, AttributeSet attrs) {
        super(context, attrs);

        StateListDrawable selector = new StateListDrawable() {
            private boolean mIsPressed;
            @Override
            protected boolean onStateChange(int[] stateSet) {
                boolean result = super.onStateChange(stateSet);

                int aboveChildIndex = mMotionPosition - getFirstVisiblePosition();
                if (--aboveChildIndex < 0) return result;

                if (Arrays.binarySearch(stateSet, android.R.attr.state_pressed) > -1) {
                    if (mIsPressed) return result;

                    View child = getChildAt(aboveChildIndex);
                    child.findViewById(R.id.lotDivider).setBackgroundResource(R.drawable.finder_booklist_divider_pressed_layer);
                    mIsPressed = true;
                } else if (mIsPressed) {
                    View child = getChildAt(aboveChildIndex);
                    child.findViewById(R.id.lotDivider).setBackgroundResource(R.drawable.finder_booklist_divider_layer);
                    mIsPressed = false;
                }

                return result;
            }
        };
        selector.addState(new int[]{android.R.attr.state_pressed},
                getResources().getDrawable(R.color.finder_booklist_bg_pressed));
        setSelector(selector);
    }

    private int mMotionPosition;

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            mMotionPosition = findMotionRow(ev.getY());
        }
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * Find which position is motion on.
     * Note : this method copy into public from 4.0 source code.
     * @param y Y coordinate of the motion event.
     * @return Selected index (starting at 0) of the data item.
     */
    private int findMotionRow(float y) {
        int childCount = getChildCount();
        if (childCount > 0) {
            if (!isStackFromBottom()) {
                for (int i = 0; i < childCount; i++) {
                    View v = getChildAt(i);
                    if (y <= v.getBottom()) {
                        return getFirstVisiblePosition() + i;
                    }
                }
            } else {
                for (int i = childCount - 1; i >= 0; i--) {
                    View v = getChildAt(i);
                    if (y >= v.getTop()) {
                        return getFirstVisiblePosition() + i;
                    }
                }
            }
        }
        return INVALID_POSITION;
    }
}