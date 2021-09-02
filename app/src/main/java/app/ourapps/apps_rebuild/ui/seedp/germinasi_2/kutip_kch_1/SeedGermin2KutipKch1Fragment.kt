package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2Kutip1Binding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2KutipKch1Binding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_1.SeedGermin2Kutip1TambahFragment

class SeedGermin2KutipKch1Fragment : Fragment() {

    private var _binding: FragmentSeedGermin2KutipKch1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin2KutipKch1Binding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin2KutipKch1TambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kutip_kch1, mFragment, SeedGermin2KutipKch1TambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}