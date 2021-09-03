package app.ourapps.apps_rebuild.ui.breed.germinasi_2.fungisida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2FungisidaBinding

class BreedGermin2FungisidaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2FungisidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2FungisidaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2FungisidaFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2FungisidaFragment::class.java.simpleName)

        if (fragment !is BreedGermin2FungisidaFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerFungisida.id, mListFragment, BreedGermin2FungisidaFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}