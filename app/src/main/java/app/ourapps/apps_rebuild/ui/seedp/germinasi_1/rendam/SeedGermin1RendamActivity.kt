package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.rendam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1RendamBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung.SeedGermin1ApungFragment

class SeedGermin1RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1RendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1RendamFragment::class.java.simpleName)

        if (fragment !is SeedGermin1ApungFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, SeedGermin1RendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

}