# PVDialogLibary
This library make you easy to use and wirte code and again and again.
To use this library:

### JitPack
```
allprojects {
    repositories {
    ...
      maven { url 'https://jitpack.io' }
    }
}
```

### Gradle
```
dependencies {
    implementation 'com.github.VichitGit:PVDialogLibary:0.5'
}
```

### Create Constructor
```
PVDialog pvDialog = new PVDialog(Context context, String title, String message);

```

### Control dialog
```
dialog.setCancelable(false);

```


### Listener Button
```
pvDialog.setActionButton("Yes", "No", new OnShowDialog() {

     @Override
     public void setOnNegativeButton(DialogInterface dialogInterface) {
         Toast.makeText(ComponentActivity.this, "Negative Button", Toast.LENGTH_SHORT).show();
         dialogInterface.dismiss();
     }

     @Override
     public void setOnPositiveButton(DialogInterface dialogInterface) {
         Toast.makeText(ComponentActivity.this, "Positive Button", Toast.LENGTH_SHORT).show();
         dialogInterface.dismiss();
     }
});

```

