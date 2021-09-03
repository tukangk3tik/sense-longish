package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kutip_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2Kutip5Binding

class BreedGermin2Kutip5Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2Kutip5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2Kutip5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2Kutip5Fragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2Kutip5Fragment::class.java.simpleName)

        if (fragment !is BreedGermin2Kutip5Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip5.id, mListFragment, BreedGermin2Kutip5Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}