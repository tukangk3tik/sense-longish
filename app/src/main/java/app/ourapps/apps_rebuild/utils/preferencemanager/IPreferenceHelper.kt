package app.ourapps.apps_rebuild.utils.preferencemanager

interface IPreferenceHelper {

    fun setIdUser(id: Int)
    fun getIdUser(): Int

    fun setUsername(username: String)
    fun getUsername(): String

    fun setName(name: String)
    fun getName(): String

    fun setJabatan(jabatan: String)
    fun getJabatan(): String

    fun setStatus(status: Boolean)
    fun getStatus(): Boolean

    fun clearSession()

}