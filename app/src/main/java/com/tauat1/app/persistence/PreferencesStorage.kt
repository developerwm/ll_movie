package com.tauat1.app.persistence

import android.content.Context

private const val PREF_CATEGORY = "pref_category"
private const val PREF_QUERY = "pref_query"

object PreferencesStorage {

    fun getStoredQuery(context: Context):String?{
        val prefs = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context)
        return prefs.getString(PREF_QUERY,null)
    }
}