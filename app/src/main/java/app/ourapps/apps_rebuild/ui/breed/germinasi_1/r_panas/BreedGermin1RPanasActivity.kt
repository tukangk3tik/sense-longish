package app.ourapps.apps_rebuild.ui.breed.germinasi_1.r_panas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin1RpanasBinding

class BreedGermin1RPanasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin1RpanasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin1RpanasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin1RPanasFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin1RPanasFragment::class.java.simpleName)

        if (fragment !is BreedGermin1RPanasFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerRuangPanas.id, mListFragment, BreedGermin1RPanasFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}