package app.ourapps.apps_rebuild.ui.seedp.lbk.rendam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkRendamBinding

class SeedLbkRendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkRendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkRendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkRendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkRendamFragment::class.java.simpleName)

        if (fragment !is SeedLbkRendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, SeedLbkRendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}