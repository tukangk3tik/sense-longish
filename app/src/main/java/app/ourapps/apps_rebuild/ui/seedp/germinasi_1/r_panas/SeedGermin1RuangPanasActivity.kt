package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.r_panas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin1RuangPanasBinding

class SeedGermin1RuangPanasActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin1RuangPanasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin1RuangPanasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin1RuangPanasFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin1RuangPanasFragment::class.java.simpleName)

        if (fragment !is SeedGermin1RuangPanasFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRuangPanas.id, mListFragment, SeedGermin1RuangPanasFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}