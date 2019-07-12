# tempconverter


## What to watch out for 

If we do need to create this from a project that has no activity be sure to add into the manifest.xml the inent filter 

it should look like this 

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
  package="io.github.matthewjones2435.tempconverter">

  <application
    android:allowBackup="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:supportsRtl="true"
    android:theme="@style/AppTheme">
    <activity
      android:name=".MainActivity"
      android:windowSoftInputMode="adjustResize">
      <intent-filter >
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
      </intent-filter>
    </activity>
  </application>

</manifest>

We will also need to change the layout of the objects according to his specifications 

the computed results display a ton of decimal places we will probally need to format this to show only a few decimal places 

## What Does work 

All of the calculations are correct, all of the text edits will allow signed number input, all of the buttons display the correct calculations above the 
corresponding edit text, edit texts have hints 
temperature values and displays are coded with the unicode value for the degree symbol, keyboard pushes view objets and resizes them so all will display
while keyboard is visible.







