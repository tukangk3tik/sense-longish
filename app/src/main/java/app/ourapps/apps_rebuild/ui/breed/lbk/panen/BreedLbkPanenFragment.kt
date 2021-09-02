package app.ourapps.apps_rebuild.ui.breed.lbk.panen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentBreedLbkPanenBinding

class BreedLbkPanenFragment : Fragment() {

    private var _binding : FragmentBreedLbkPanenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentBreedLbkPanenBinding.inflate(inflater, container, false)
        val root : View = binding.root

        //For new scan
        binding.btnAddItem.setOnClickListener {
            val mFragment = BreedLbkPanenTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_panen, mFragment, BreedLbkPanenTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        return root
    }
}