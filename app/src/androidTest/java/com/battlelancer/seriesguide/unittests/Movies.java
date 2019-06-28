package com.battlelancer.seriesguide.unittests;

import android.app.Activity;

import android.view.KeyEvent;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.ui.MoviesActivity;
import com.battlelancer.seriesguide.ui.movies.MoviesSearchActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import static com.google.common.truth.Truth.assertThat;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class Movies  {

    /**
     * Use {@link ActivityScenarioRule} to create and launch the activity under test, and close it
     * after test completes. This is a replacement for {@link androidx.test.rule.ActivityTestRule}.
     */
    @Rule public ActivityScenarioRule<MoviesSearchActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MoviesSearchActivity.class);

    private final String MOVIE_SEARCH_STRING = "avengers";

    @Test
    public void testSearchMovie()  {
        onView(withId(R.id.editTextSearchBar)).perform(typeText(MOVIE_SEARCH_STRING)).perform(
                ViewActions.pressKey(KeyEvent.KEYCODE_ENTER));

        onView(withId(R.id.editTextSearchBar)).check(matches(withText(MOVIE_SEARCH_STRING)));

        //Throws error when failing, passes if it correctly finds movies
        onView(withId(R.id.recyclerViewMoviesSearch)).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));

    }
}
