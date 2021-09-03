package app.ourapps.apps_rebuild.ui.breed.germinasi_2.kutip_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin2Kutip3Binding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2Kutip3Binding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_3.SeedGermin2Kutip3TambahFragment

class BreedGermin2Kutip3Fragment : Fragment() {

    private var _binding: FragmentBreedGermin2Kutip3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin2Kutip3Binding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedGermin2Kutip3TambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kutip3, mFragment, BreedGermin2Kutip3TambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}