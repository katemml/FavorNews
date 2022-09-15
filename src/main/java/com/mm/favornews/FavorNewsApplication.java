

import android.app.Application;

import androidx.room.Room;

import com.mm.favornews.database.TinNewsDatabase;

public class FavorNewsApplication extends Application {
    private static TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
//        database.articleDao().getAllArticles()
    }

    public static TinNewsDatabase getDatabase() {
        return database;
    }
}
