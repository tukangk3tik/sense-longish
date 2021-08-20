package app.ourapps.apps_rebuild.utils.preferencemanager

import android.content.Context
import android.content.SharedPreferences

open class PreferenceManager constructor(context: Context) : IPreferenceHelper
{
    private val PREFS_NAME = "UserSession"
    private var preferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    override fun setIdUser(id: Int) {
        preferences[USER_ID] = id
    }

    override fun getIdUser(): Int {
        return preferences[USER_ID] ?: 0
    }

    override fun setUsername(username: String) {
        preferences[USERNAME] = username
    }

    override fun getUsername(): String {
        return preferences[USERNAME] ?: ""
    }

    override fun setName(name: String) {
        preferences[NAME] = name
    }

    override fun getName(): String {
        return preferences[NAME] ?: ""
    }

    override fun setStatus(status: Boolean) {
        preferences[STATUS] = status
    }

    override fun getStatus(): Boolean {
        return preferences[STATUS] ?: false
    }

    override fun clearSession() {
        preferences.edit().clear().apply()
    }

    companion object {
        const val USER_ID = "id"
        const val USERNAME = "username"
        const val NAME = "name"
        const val STATUS = "status"
    }
}

/**
 * SharedPreferences extension function, to listen the edit() and apply() fun calls
 * on every SharedPreferences operation.
 */
private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
    val editor = this.edit()
    operation(editor)
    editor.apply()
}

/**
 * puts a key value pair in shared prefs if doesn't exists, otherwise updates value on given [key]
 */
private operator fun SharedPreferences.set(key: String, value: Any?) {
    when (value) {
        is String? -> edit { it.putString(key, value) }
        is Int -> edit { it.putInt(key, value) }
        is Boolean -> edit { it.putBoolean(key, value) }
        is Float -> edit { it.putFloat(key, value) }
        is Long -> edit { it.putLong(key, value) }
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}


/**
 * finds value on given key.
 * [T] is the type of value
 * @param defaultValue optional default value - will take null for strings, false for bool and -1 for numeric values if [defaultValue] is not specified
 */
private inline operator fun <reified T: Any> SharedPreferences.get(
    key: String,
    defaultValue: T? = null
): T? {
    return when (T::class) {
        String::class -> getString(key, defaultValue as? String) as T?
        Int::class -> getInt(key, defaultValue as? Int ?: -1) as T?
        Boolean::class -> getBoolean(key, defaultValue as? Boolean ?: false) as T?
        Float::class -> getFloat(key, defaultValue as? Float ?: -1f) as T?
        Long::class -> getLong(key, defaultValue as? Long ?: -1) as T?
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}