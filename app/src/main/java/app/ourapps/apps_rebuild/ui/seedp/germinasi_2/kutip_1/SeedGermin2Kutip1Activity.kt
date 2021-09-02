package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip1Binding

class SeedGermin2Kutip1Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2Kutip1Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2Kutip1Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2Kutip1Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip1.id, mListFragment, SeedGermin2Kutip1Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}