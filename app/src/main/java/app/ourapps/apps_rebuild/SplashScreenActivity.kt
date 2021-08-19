package app.ourapps.apps_rebuild

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log.d
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlin.system.exitProcess

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var permissionCount = 0

        if (!checkCameraPermission()) {
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.CAMERA),
                1)
        } else {
            permissionCount += 1
        }

        if (permissionCount > 0) routeToLogin()
    }

    private fun checkCameraPermission(): Boolean {
        val permission = Manifest.permission.CAMERA
        val res = applicationContext.checkCallingOrSelfPermission(permission)
        return res == PackageManager.PERMISSION_GRANTED
    }

    private fun routeToLogin() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            1 -> if (
                grantResults.isNotEmpty()
                && grantResults[0] == PackageManager.PERMISSION_GRANTED
            ) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (
                        ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED
                    ) {
                        showMessageOKCancel("Allow Camera?") { dialog, which ->
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) requestPermission()
                        }
                    } else {
                        routeToLogin()
                    }
                }
            } else {
                d("PERMISSION", "Permission denied")
            }

            0 -> {
                finish()
                exitProcess(0)
            }
        }
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this, arrayOf(Manifest.permission.CAMERA),
            1
        )
    }

    private fun showMessageOKCancel(
        message: String,
        okListener: (Any, Any) -> Unit
    ) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton("OK", okListener)
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }
}