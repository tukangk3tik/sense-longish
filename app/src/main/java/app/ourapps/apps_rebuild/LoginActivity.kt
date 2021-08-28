package app.ourapps.apps_rebuild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import app.ourapps.apps_rebuild.utils.preferencemanager.IPreferenceHelper
import app.ourapps.apps_rebuild.utils.preferencemanager.PreferenceManager
import kotlinx.android.synthetic.main.activity_login.*
import java.lang.Exception
import java.security.MessageDigest
import java.util.*

class LoginActivity : AppCompatActivity() {

    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }

    companion object {
        private const val FIELD_REQUIRED = " is required"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val statusLogin = preferenceHelper.getStatus()
        if (statusLogin){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_login.setOnClickListener {
            val username = edt_username.text.toString().trim()
            val password = edt_password.text.toString().trim()

            if (username.isEmpty()){
                edt_username.error = "Username $FIELD_REQUIRED"
                return@setOnClickListener
            }

            if (password.isEmpty()){
                edt_username.error = "Password $FIELD_REQUIRED"
                return@setOnClickListener
            }

            try {
                val md5 = MessageDigest.getInstance("MD5")
                val passHashByte = md5.digest(password.toByteArray()).toTypedArray()
                val passHashMd5 : String = byteArrayToHexString(passHashByte)

                //will connect to online network
                preferenceHelper.setUsername(username)
                preferenceHelper.setName("TEST USER")
                preferenceHelper.setJabatan("Test jabatan")
                preferenceHelper.setStatus(true)

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } catch (e: Exception) {
                d("HASH", "Password hash error")
            }
        }
    }

    private fun byteArrayToHexString(array : Array<Byte>): String {
        val result = StringBuilder(array.size * 2)

        for (byte in array){
            val toAppend = String.format("%2X", byte)
                .replace(" ", "0")

            result.append(toAppend)
        }

        return result.toString().lowercase(Locale.ROOT)
    }
}