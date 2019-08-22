package com.battlelancer.seriesguide.unittests;

import com.battlelancer.seriesguide.ui.movies.MovieDetails;
import com.battlelancer.seriesguide.ui.search.SearchResult;
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


    @Before
    public void setup(){
        searchResult = new SearchResult();
        searchResult.setTitle("Avengers");
        searchResult.setLanguage("English");
    }



    @Test
    public void  setSearchResult(){
        Assert.assertEquals(searchResult.getTitle(), "Avengers");
        Assert.assertEquals(searchResult.getLanguage(), "English");
    }


    @Test
    public void setMovieRating(){
        movieDetails = new MovieDetails();
        movieDetails.setUserRating(1);

        Assert.assertEquals(movieDetails.getUserRating(), 1);
    }

    @Test
    public void setMovieWatched(){
        movieDetails = new MovieDetails();
        movieDetails.setWatched(true);
        movieDetails.isWatched();

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
        movieDetails.isInWatchlist();
        Assert.assertTrue(movieDetails.isInWatchlist());
    }

}
