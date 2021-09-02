package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip5Binding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_1.SeedGermin2Kutip1Fragment

class SeedGermin2Kutip5Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2Kutip5Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2Kutip5Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2Kutip5Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip5.id, mListFragment, SeedGermin2Kutip5Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}