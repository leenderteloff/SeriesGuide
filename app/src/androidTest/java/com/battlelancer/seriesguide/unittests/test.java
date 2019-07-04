package com.battlelancer.seriesguide.unittests;

import com.battlelancer.seriesguide.ui.movies.MovieDetails;
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

    @Spy
    MovieDetails movieDetails;


    @Test
    public void setMovieToWatched(){
        MockitoAnnotations.initMocks(this);
     //   String movie = movieDetails.tmdbMovie().title = "Avengers";
        movieDetails = new MovieDetails();
        movieDetails.setUserRating(1);

      //  assertThat(movieDetails.getUserRating());
        Assert.assertEquals(movieDetails.getUserRating(), 1);

    }


}
