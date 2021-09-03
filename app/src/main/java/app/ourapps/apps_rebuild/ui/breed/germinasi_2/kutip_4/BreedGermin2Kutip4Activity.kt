package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kutip_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2Kutip4Binding

class BreedGermin2Kutip4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2Kutip4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2Kutip4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2Kutip4Fragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2Kutip4Fragment::class.java.simpleName)

        if (fragment !is BreedGermin2Kutip4Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip4.id, mListFragment, BreedGermin2Kutip4Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}