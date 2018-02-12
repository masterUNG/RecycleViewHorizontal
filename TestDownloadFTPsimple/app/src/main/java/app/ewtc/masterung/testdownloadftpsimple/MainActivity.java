// Important: Don't forget to include the call to System.loadLibrary
// as shown at the bottom of this code sample.
package app.ewtc.masterung.testdownloadftpsimple;

import android.app.Activity;

import android.os.Bundle;

import org.jibble.simpleftp.SimpleFTP;

public class MainActivity extends Activity {

    private static final String TAG = "Chilkat";

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleFTP ftp = new SimpleFTP();

        boolean success;

        //  Any string unlocks the component for the 1st 30-days.
        success = ftp.UnlockComponent("Anything for 30-day trial");
        if (success != true) {
            Log.i(TAG, ftp.lastErrorText());
            return;
        }

        ftp.put_Hostname("ftp.someFtpServer.com");
        ftp.put_Username("myLogin");
        ftp.put_Password("myPassword");

        //  Connect and login to the FTP server.
        success = ftp.Connect();
        if (success != true) {
            Log.i(TAG, ftp.lastErrorText());
            return;
        }

        //  Change to the remote directory where the file is located.
        //  This step is only necessary if the file is not in the root directory
        //  for the FTP account.
        success = ftp.ChangeRemoteDir("junk");
        if (success != true) {
            Log.i(TAG, ftp.lastErrorText());
            return;
        }

        String localFilename = "c:/temp/hamlet.xml";
        String remoteFilename = "hamlet.xml";

        //  Download a file.
        success = ftp.GetFile(remoteFilename,localFilename);
        if (success != true) {
            Log.i(TAG, ftp.lastErrorText());
            return;
        }

        success = ftp.Disconnect();

        Log.i(TAG, "File Downloaded!");

    }

    static {
        // Important: Make sure the name passed to loadLibrary matches the shared library
        // found in your project's libs/armeabi directory.
        //  for "libchilkat.so", pass "chilkat" to loadLibrary
        //  for "libchilkatemail.so", pass "chilkatemail" to loadLibrary
        //  etc.
        //
        System.loadLibrary("chilkat");

        // Note: If the incorrect library name is passed to System.loadLibrary,
        // then you will see the following error message at application startup:
        //"The application <your-application-name> has stopped unexpectedly. Please try again."
    }
}
