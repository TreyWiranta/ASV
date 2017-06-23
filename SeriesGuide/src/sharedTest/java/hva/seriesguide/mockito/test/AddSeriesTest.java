package hva.seriesguide.mockito.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.provider.SeriesGuideDatabase;
import com.battlelancer.seriesguide.util.TraktTools;

import static org.assertj.android.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Locale;

public class AddSeriesTest {

    @Mock
    Context mMockContext;


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void should_FailToLoadSeriesBeforeAdding_When_noConnection()  {
       
    }

    @Test
    public void should_FailToAdd_When_SeriesIsAlreadyAdded(){

    }

    @Test
    public void  should_AddSeries_WithoutDisplayingDescription(){

    }

    @Test (timeout = 5000)
    public void should_AddSeries_Within5Seconds(){

    }

    @Test
    public void should_CancelAddingSeries_When_OptionIsSelected(){

    }

}
