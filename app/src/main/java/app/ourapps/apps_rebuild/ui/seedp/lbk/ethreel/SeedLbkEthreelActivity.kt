package app.ourapps.apps_rebuild.ui.seedp.lbk.ethreel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedLbkEthreelBinding

class SeedLbkEthreelActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedLbkEthreelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedLbkEthreelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedLbkEthreelFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedLbkEthreelFragment::class.java.simpleName)

        if (fragment !is SeedLbkEthreelFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerEthreel.id, mListFragment, SeedLbkEthreelFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}