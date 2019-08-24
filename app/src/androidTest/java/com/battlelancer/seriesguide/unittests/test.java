package com.battlelancer.seriesguide.unittests;

import android.content.Context;
import android.os.RecoverySystem;
import android.util.StatsLog;
import android.widget.ProgressBar;
import androidx.test.platform.app.InstrumentationRegistry;
import com.battlelancer.seriesguide.dataliberation.model.List;
import com.battlelancer.seriesguide.ui.ListsActivity;
import com.battlelancer.seriesguide.ui.lists.ListsTools;
import com.battlelancer.seriesguide.ui.movies.MovieDetails;
import com.battlelancer.seriesguide.ui.search.SearchResult;
import com.battlelancer.seriesguide.ui.stats.StatsFragment;
import com.battlelancer.seriesguide.ui.stats.StatsViewModel;
import com.uwetrottmann.seriesguide.backend.lists.Lists;
import com.uwetrottmann.thetvdb.entities.Series;
import io.opencensus.stats.Stats;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

import static com.google.common.truth.Truth.*;



@RunWith(MockitoJUnitRunner.class)
public class test {


    MovieDetails movieDetails;
    SearchResult searchResult;
    ProgressBar progressBar;
    StatsFragment statsFragment;
    List list;
    ListsTools listsTools;

//    @Test
//    public void setSeries(){
//
//
//
//        list = new List();
//        list.name = "String";
//
//
//    }

//    @Test
//    public void getProgressBar() {
//
//        statsFragment = new StatsFragment();
//        statsFragment.progressBarMoviesWatched.setMin(0);
//        statsFragment.progressBarMoviesWatched.setMax(5);
//
//
//        Assert.assertNotNull(statsFragment.progressBarMoviesWatched.getMax());
//
//
//    }

    @Before
    public void setup(){
        searchResult = new SearchResult();
        searchResult.setTitle("Avengers");
        searchResult.setLanguage("English");

    }




    @Test
    public void  findMovie(){
        //Arrange: creating a searchResult object that is used to search for movies
        searchResult = new SearchResult();

        //Act: giving the search result a title and language
        searchResult.setTitle("Avengers");
        searchResult.setLanguage("English");

        //Assert: checking if the searchResult object is created with the right parameters
        Assert.assertEquals(searchResult.getTitle(), "Avengers");
        Assert.assertEquals(searchResult.getLanguage(), "Englishh");
    }


    @Test
    public void setMovieRating(){
        movieDetails = new MovieDetails();
        movieDetails.setUserRating(1);

        Assert.assertEquals(movieDetails.getUserRating(), 3);
    }

    @Test
    public void setMovieWatched(){
        movieDetails = new MovieDetails();
        movieDetails.setWatched(true);
       // movieDetails.isWatched();

        Assert.assertTrue(movieDetails.isWatched());
    }

    @Test
    public void setMovieInCollection(){
        movieDetails = new MovieDetails();
        movieDetails.setInCollection(true);
        movieDetails.isInCollection();

        Assert.assertTrue(movieDetails.isInCollection());
    }

    @Test
    public void setMovieInWatchlist(){
        movieDetails = new MovieDetails();
        movieDetails.setInWatchlist(true);
        Assert.assertTrue(movieDetails.isInWatchlist());
    }

    @Test
    public void getMovieDetails(){
        //Arrange: creating a new searchResult object
        searchResult = new SearchResult();

        //Act: Giving the searchResult a title and a description
        searchResult.setTitle("Avengers");
        searchResult.setOverview("Avengers is about super heroes and aliens!");

        //Assert: checking if the Overview is not null, this should be true because we gave it a description
        Assert.assertNotNull(searchResult.getOverview());
    }

}
