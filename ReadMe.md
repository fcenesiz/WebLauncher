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