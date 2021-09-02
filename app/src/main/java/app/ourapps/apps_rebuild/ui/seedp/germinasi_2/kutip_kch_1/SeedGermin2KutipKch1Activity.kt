package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2KutipKch1Binding

class SeedGermin2KutipKch1Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2KutipKch1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2KutipKch1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2KutipKch1Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2KutipKch1Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2KutipKch1Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutipKch1.id, mListFragment, SeedGermin2KutipKch1Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}