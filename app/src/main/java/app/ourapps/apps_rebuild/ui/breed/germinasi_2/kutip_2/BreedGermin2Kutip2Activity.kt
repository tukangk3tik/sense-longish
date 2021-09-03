package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kutip_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivityBreedGermin2Kutip2Binding

class BreedGermin2Kutip2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBreedGermin2Kutip2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBreedGermin2Kutip2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = BreedGermin2Kutip2Fragment()
        val fragment = mFragmentManager.findFragmentByTag(BreedGermin2Kutip2Fragment::class.java.simpleName)

        if (fragment !is BreedGermin2Kutip2Fragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerKutip2.id, mListFragment, BreedGermin2Kutip2Fragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}