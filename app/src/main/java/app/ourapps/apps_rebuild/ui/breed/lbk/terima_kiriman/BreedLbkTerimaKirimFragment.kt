package app.ourapps.apps_rebuild.ui.breed.lbk.terima_kiriman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedLbkTerimaKirimBinding

class BreedLbkTerimaKirimFragment : Fragment() {

    private var _binding: FragmentBreedLbkTerimaKirimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedLbkTerimaKirimBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedLbkTerimaKirimTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_container_terima_kirim,
                    mFragment,
                    BreedLbkTerimaKirimTambahFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }


}