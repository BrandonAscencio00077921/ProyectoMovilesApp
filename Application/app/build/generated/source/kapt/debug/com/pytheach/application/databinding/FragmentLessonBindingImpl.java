package com.pytheach.application.databinding;
import com.pytheach.application.R;
import com.pytheach.application.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLessonBindingImpl extends FragmentLessonBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 1);
        sViewsWithIds.put(R.id.textView, 2);
        sViewsWithIds.put(R.id.lesson1Card, 3);
        sViewsWithIds.put(R.id.lesson1Text, 4);
        sViewsWithIds.put(R.id.lesson2Card, 5);
        sViewsWithIds.put(R.id.lesson2Text, 6);
        sViewsWithIds.put(R.id.lesson3Card, 7);
        sViewsWithIds.put(R.id.lesson3Text, 8);
        sViewsWithIds.put(R.id.lesson4Card, 9);
        sViewsWithIds.put(R.id.lesson4Text, 10);
        sViewsWithIds.put(R.id.lesson5Card, 11);
        sViewsWithIds.put(R.id.lesson5Text, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLessonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentLessonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}