package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip4Binding

class SeedGermin2Kutip4Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2Kutip4Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2Kutip4Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2Kutip4Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip4.id, mListFragment, SeedGermin2Kutip4Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}