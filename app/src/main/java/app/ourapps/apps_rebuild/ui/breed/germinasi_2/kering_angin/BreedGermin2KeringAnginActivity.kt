package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kering_angin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2KeringAnginBinding

class BreedGermin2KeringAnginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2KeringAnginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2KeringAnginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2KeringAnginFragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2KeringAnginFragment::class.java.simpleName)

        if (fragment !is BreedGermin2KeringAnginFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKeringAngin.id, mListFragment, BreedGermin2KeringAnginFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}