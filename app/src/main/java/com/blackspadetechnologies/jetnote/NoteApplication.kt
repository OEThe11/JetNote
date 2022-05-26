package com.blackspadetechnologies.jetnote

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Gives hilt access to the entire app
@HiltAndroidApp
class NoteApplication : Application() {

}