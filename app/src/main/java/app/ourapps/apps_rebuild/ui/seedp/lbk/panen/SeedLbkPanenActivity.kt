package app.ourapps.apps_rebuild.ui.seedp.lbk.panen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkPanenBinding

class SeedLbkPanenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkPanenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkPanenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkPanenFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkPanenFragment::class.java.simpleName)

        if (fragment !is SeedLbkPanenFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPanen.id, mListFragment, SeedLbkPanenFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}