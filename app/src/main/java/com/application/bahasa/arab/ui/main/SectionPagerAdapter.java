package com.application.bahasa.arab.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.application.bahasa.arab.R;
import com.application.bahasa.arab.ui.unit.ListUnitFragment;
import com.application.bahasa.arab.ui.additional.ListAdditionalFragment;
import com.application.bahasa.arab.ui.semester.ListSemesterFragment;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.semester,R.string.theUnit,R.string.additional};
    private final Context myContext;

    public SectionPagerAdapter(@NonNull Context context, FragmentManager fm) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position ){
            case 0 :
                return new ListSemesterFragment();
            case 1 :
                return new ListUnitFragment();
            case 2 :
                return new ListAdditionalFragment();
            default:
                return new Fragment();
            }
        }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return myContext.getResources().getString(TAB_TITLES[position]);
    }
}
