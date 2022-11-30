## Implicit Intent Usage
Redirect the app to open a webpage
```Java
Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/fcenesiz"));
startActivity(intent);
```

![](img_list.png ) ![](img_intentsender.png )
![](img_list.png ) ![](img_launcher_selection.png )
![](img_list.png ) ![](img_weblauncher.png )


Set intent filter tag inside manifest file for weblauncher app
````xml
<intent-filter tools:ignore="AppLinkUrlError">
    <action android:name="android.intent.action.VIEW" />
    <category android:name="android.intent.category.DEFAULT"/>
    <data android:scheme="https"/>
</intent-filter>
````