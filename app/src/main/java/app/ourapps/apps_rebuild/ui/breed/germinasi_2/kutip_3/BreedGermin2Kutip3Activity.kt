package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kutip_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2Kutip3Binding

class BreedGermin2Kutip3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2Kutip3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2Kutip3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2Kutip3Fragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2Kutip3Fragment::class.java.simpleName)

        if (fragment !is BreedGermin2Kutip3Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip3.id, mListFragment, BreedGermin2Kutip3Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}