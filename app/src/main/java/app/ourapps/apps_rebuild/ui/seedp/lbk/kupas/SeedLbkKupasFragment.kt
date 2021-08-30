package app.ourapps.apps_rebuild.ui.seedp.lbk.kupas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkKupasBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkRendamBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.rendam.SeedLbkRendamTambahFragment

class SeedLbkKupasFragment : Fragment() {

    private var _binding: FragmentSeedLbkKupasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedLbkKupasBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedLbkKupasTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kupas, mFragment, SeedLbkKupasTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root

    }

}