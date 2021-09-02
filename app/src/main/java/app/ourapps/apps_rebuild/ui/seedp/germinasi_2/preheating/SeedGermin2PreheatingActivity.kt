package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.preheating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2PreheatingBinding

class SeedGermin2PreheatingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2PreheatingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2PreheatingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2PreheatingFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2PreheatingFragment::class.java.simpleName)

        if (fragment !is SeedGermin2PreheatingFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerPreheating.id, mListFragment, SeedGermin2PreheatingFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}