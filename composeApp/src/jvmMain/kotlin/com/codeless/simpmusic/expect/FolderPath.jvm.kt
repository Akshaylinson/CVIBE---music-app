package com.codeless.simpmusic.expect

actual fun getDownloadFolderPath(): String = System.getProperty("user.home") + "/Downloads"