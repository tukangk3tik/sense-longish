package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2Kutip2Binding

class SeedGermin2Kutip2Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2Kutip2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2Kutip2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2Kutip2Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2Kutip2Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2Kutip2Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip2.id, mListFragment, SeedGermin2Kutip2Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}