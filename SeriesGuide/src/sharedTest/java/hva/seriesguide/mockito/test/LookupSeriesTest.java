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


    @Mock
    Context mMockContext;


    @Test
    public void should_FailToSearchSeries_IfWrongSearchTerm(){

    }

    @Test
    public void should_ShowRecentlyAiredSeries(){

    }

    @Test
    public void should_ShowSeries_When_SearchedByTerm(){


    }

}
