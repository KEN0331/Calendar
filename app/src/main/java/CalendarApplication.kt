import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid

/**
 * application class for calendar.
 */
class CalendarApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this);
    }
}