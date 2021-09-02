package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.r_gelap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2RgelapBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam.SeedGermin2RendamFragment

class SeedGermin2RGelapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2RgelapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2RgelapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2RGelapFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2RGelapFragment::class.java.simpleName)

        if (fragment !is SeedGermin2RendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRuangGelap.id, mListFragment, SeedGermin2RGelapFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}