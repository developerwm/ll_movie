package com.tauat1.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.tauat1.R;

public class Second2FragmentDirections {
  private Second2FragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSecond2FragmentToFirst2Fragment() {
    return new ActionOnlyNavDirections(R.id.action_Second2Fragment_to_First2Fragment);
  }
}
