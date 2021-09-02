package app.ourapps.apps_rebuild.ui.breed.germinasi_1.kering_angin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin1KeringAnginBinding

class BreedGermin1KeringAnginFragment : Fragment() {

    private var _binding: FragmentBreedGermin1KeringAnginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin1KeringAnginBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedGermin1KeringAnginTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kering_angin, mFragment, BreedGermin1KeringAnginTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}