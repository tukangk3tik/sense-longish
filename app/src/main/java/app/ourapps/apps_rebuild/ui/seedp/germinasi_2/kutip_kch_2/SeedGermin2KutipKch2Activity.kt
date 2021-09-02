package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2KutipKch2Binding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_1.SeedGermin2KutipKch1Fragment

class SeedGermin2KutipKch2Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2KutipKch2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2KutipKch2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2KutipKch2Fragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2KutipKch2Fragment::class.java.simpleName)

        if (fragment !is SeedGermin2KutipKch2Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutipKch2.id, mListFragment, SeedGermin2KutipKch2Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}