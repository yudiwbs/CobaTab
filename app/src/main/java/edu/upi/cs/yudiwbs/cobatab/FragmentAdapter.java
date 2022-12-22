package edu.upi.cs.yudiwbs.cobatab;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return a NEW fragment instance in createFragment(int)
        Log.d("debugyudi", String.valueOf(position));
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FragmentSatu();
                break;
            case 1:
                fragment = new FragmentDua();
                break;
        }
        return  fragment;
    }
    @Override
    public int getItemCount() {
        return 2;
    }
}
