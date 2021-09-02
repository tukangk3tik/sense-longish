package app.ourapps.apps_rebuild.ui.breed.germinasi_1.fungisida

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedGermin1FungisidaBinding

class BreedGermin1FungisidaFragment : Fragment() {

    private var _binding: FragmentBreedGermin1FungisidaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedGermin1FungisidaBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedGermin1FungisidaTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_fungisida, mFragment, BreedGermin1FungisidaTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}