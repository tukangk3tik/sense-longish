package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_apung

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1ApungBinding

class SeedGermin1ApungActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1ApungBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1ApungBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1ApungFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1ApungFragment::class.java.simpleName)

        if (fragment !is SeedGermin1ApungFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerApung.id, mListFragment, SeedGermin1ApungFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}