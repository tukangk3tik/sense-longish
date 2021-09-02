package app.ourapps.apps_rebuild.ui.breed.germinasi_1.rendam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin1RendamBinding

class BreedGermin1RendamActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin1RendamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin1RendamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin1RendamFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin1RendamFragment::class.java.simpleName)

        if (fragment !is BreedGermin1RendamFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRendam.id, mListFragment, BreedGermin1RendamFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}