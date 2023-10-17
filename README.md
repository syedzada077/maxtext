# MaxText

MaxText is an Android library that provides a variety of custom fonts to enhance the text appearance in Android applications.

## Installation

### Gradle

Step 1. Add the JitPack repository to your build file if not already added:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

#### Step 2. Add the dependency:

dependencies {
    implementation 'com.github.syedzada077:maxtext:1.0.0'
}


#### To apply custom fonts to TextViews in your application, follow the steps below:

Initialize MaxText in your activity or fragment
MaxText.applyFont(context, textView, R.font.your_custom_font);

Here's an example of how to apply a custom font to a TextView:

TextView textView = findViewById(R.id.textView);
MaxText.applyFont(this, textView, R.font.custom_font_1);

