package app.ourapps.apps_rebuild.ui.breed.germinasi_1.fungisida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin1FungisidaBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida.SeedGermin1FungisidaFragment

class BreedGermin1FungisidaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin1FungisidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin1FungisidaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin1FungisidaFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin1FungisidaFragment::class.java.simpleName)

        if (fragment !is BreedGermin1FungisidaFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerFungisida.id, mListFragment, BreedGermin1FungisidaFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}