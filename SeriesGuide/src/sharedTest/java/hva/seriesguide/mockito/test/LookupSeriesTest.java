package hva.seriesguide.mockito.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.battlelancer.seriesguide.provider.SeriesGuideDatabase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Ahmed on 23-6-2017.
 */

public class LookupSeriesTest {


    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    Context mMockContext;


    @Test
    //Requirement 5
    public void should_FailToSearchSeries_IfWrongSearchTerm(){

    }


    @Test
    //Requirement 7
    public void should_ShowRecentlyAiredSeries(){

    }

    @Test
    //Requirement 8
    public void should_ShowSeries_When_SearchedByTerm(){


    }

}
