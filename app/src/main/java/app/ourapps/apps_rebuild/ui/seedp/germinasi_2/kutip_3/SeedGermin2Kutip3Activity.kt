package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip3Binding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_1.SeedGermin2Kutip1Fragment

class SeedGermin2Kutip3Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2Kutip3Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2Kutip3Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2Kutip3Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip3.id, mListFragment, SeedGermin2Kutip3Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}