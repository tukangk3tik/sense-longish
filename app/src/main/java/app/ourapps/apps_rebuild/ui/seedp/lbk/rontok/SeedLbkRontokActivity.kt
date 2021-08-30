package app.ourapps.apps_rebuild.ui.seedp.lbk.rontok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkRontokBinding

class SeedLbkRontokActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkRontokBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkRontokBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkRontokFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkRontokFragment::class.java.simpleName)

        if (fragment !is SeedLbkRontokFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRontok.id, mListFragment, SeedLbkRontokFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}