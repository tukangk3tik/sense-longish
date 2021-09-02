package app.ourapps.apps_rebuild.ui.breed.germinasi_1.aerasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin1AerasiBinding

class BreedGermin1AerasiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin1AerasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin1AerasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin1AerasiFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin1AerasiFragment::class.java.simpleName)

        if (fragment !is BreedGermin1AerasiFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerAerasi.id, mListFragment, BreedGermin1AerasiFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}