package app.ourapps.apps_rebuild.ui.seedp.lbk.simpan_kiriman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkPengirimanBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkSimpanKirimanBinding
import app.ourapps.apps_rebuild.ui.seedp.lbk.pengiriman.SeedLbkPengirimanTambahFragment

class SeedLbkSimpanKirimanFragment : Fragment() {

    private var _binding: FragmentSeedLbkSimpanKirimanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedLbkSimpanKirimanBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedLbkSimpanKirimanTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(
                    R.id.fragment_container_simpan_kirim,
                    mFragment,
                    SeedLbkSimpanKirimanTambahFragment::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}