package app.ourapps.apps_rebuild.ui.breed.germinasi_1.kering_angin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin1KeringAnginBinding

class BreedGermin1KeringAnginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin1KeringAnginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin1KeringAnginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin1KeringAnginFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin1KeringAnginFragment::class.java.simpleName)

        if (fragment !is BreedGermin1KeringAnginFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKeringAngin.id, mListFragment, BreedGermin1KeringAnginFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}