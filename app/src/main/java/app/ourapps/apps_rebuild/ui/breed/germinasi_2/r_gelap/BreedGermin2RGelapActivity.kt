package app.ourapps.apps_rebuild.ui.breed.germinasi_2.r_gelap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2RgelapBinding

class BreedGermin2RGelapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2RgelapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2RgelapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2RGelapFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2RGelapFragment::class.java.simpleName)

        if (fragment !is BreedGermin2RGelapFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRuangGelap.id, mListFragment, BreedGermin2RGelapFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}