package hva.seriesguide.mockito.test;

import android.database.sqlite.SQLiteDatabase;

import com.battlelancer.seriesguide.provider.SeriesGuideDatabase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;



/**
 * Created by treyjarrin on 14/06/2017.
 */

public class MockitoTest  {

    @Mock
    SeriesGuideDatabase mockDb;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    //Requirement 1
    public void failToLoadSeries()  {

    }

    @Test
    //Requirement 2
    public void failToAddSerieAlreadyAdded(){

    }

    @Test
    //Requirement 3
    public void  addSerieWithoutDisplayingDescription(){

    }

    @Test (timeout = 5000)
    //Requirement 4
    public void addSerieWithin5Seconds(){

    }

    @Test
    //Requirement 5
    public void failToSearchSerieByTerm(){

    }

    @Test
    //Requirement 6
    public void cancelActionToAddSerie(){

    }

    @Test
    //Requirement 7
    public void showRecentlyAiredSeries(){

    }

    @Test
    //Requirement 8
    public void showSeriesSearchedByTerm(){


    }


}