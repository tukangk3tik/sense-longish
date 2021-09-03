package app.ourapps.apps_rebuild.ui.breed.germinasi_2.rendam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2RendamBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam.SeedGermin2RendamFragment

class BreedGermin2RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2RendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2RendamFragment::class.java.simpleName)

        if (fragment !is BreedGermin2RendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, BreedGermin2RendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}