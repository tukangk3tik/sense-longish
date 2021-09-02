package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2RendamBinding

class SeedGermin2RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2RendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2RendamFragment::class.java.simpleName)

        if (fragment !is SeedGermin2RendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, SeedGermin2RendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}