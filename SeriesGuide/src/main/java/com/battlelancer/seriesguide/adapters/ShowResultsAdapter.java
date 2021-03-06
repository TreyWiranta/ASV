package com.battlelancer.seriesguide.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import com.battlelancer.seriesguide.provider.SeriesGuideContract;
import com.battlelancer.seriesguide.thetvdbapi.TvdbImageTools;
import com.battlelancer.seriesguide.util.DBUtils;

/**
 * Adapter for show search result items.
 */
public class ShowResultsAdapter extends BaseShowsAdapter {

    public ShowResultsAdapter(Activity activity, OnContextMenuClickListener listener) {
        super(activity, listener);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ShowViewHolder viewHolder = (ShowViewHolder) view.getTag();

        viewHolder.showTvdbId = cursor.getInt(Query.ID);
        viewHolder.isFavorited = cursor.getInt(Query.FAVORITE) == 1;

        // show title
        viewHolder.name.setText(cursor.getString(Query.TITLE));

        // favorited label
        setFavoriteState(viewHolder.favorited, viewHolder.isFavorited);

        // network, day and time
        viewHolder.timeAndNetwork.setText(buildNetworkAndTimeString(context,
                cursor.getInt(Query.RELEASE_TIME),
                cursor.getInt(Query.RELEASE_WEEKDAY),
                cursor.getString(Query.RELEASE_TIMEZONE),
                cursor.getString(Query.RELEASE_COUNTRY),
                cursor.getString(Query.NETWORK)));

        // poster
        TvdbImageTools.loadShowPosterResizeCrop(context, viewHolder.poster, cursor.getString(Query.POSTER));

        // context menu
        viewHolder.isHidden = DBUtils.restoreBooleanFromInt(cursor.getInt(Query.HIDDEN));
    }

    public interface Query {
        String[] PROJECTION = new String[] {
                SeriesGuideContract.Shows._ID, // 0
                SeriesGuideContract.Shows.TITLE,
                SeriesGuideContract.Shows.POSTER,
                SeriesGuideContract.Shows.FAVORITE,
                SeriesGuideContract.Shows.HIDDEN, // 4
                SeriesGuideContract.Shows.RELEASE_TIME,
                SeriesGuideContract.Shows.RELEASE_WEEKDAY,
                SeriesGuideContract.Shows.RELEASE_TIMEZONE,
                SeriesGuideContract.Shows.RELEASE_COUNTRY,
                SeriesGuideContract.Shows.NETWORK // 9
        };

        int ID = 0;
        int TITLE = 1;
        int POSTER = 2;
        int FAVORITE = 3;
        int HIDDEN = 4;
        int RELEASE_TIME = 5;
        int RELEASE_WEEKDAY = 6;
        int RELEASE_TIMEZONE = 7;
        int RELEASE_COUNTRY = 8;
        int NETWORK = 9;
    }
}
