package app.ourapps.apps_rebuild.ui.seedp.germinasi_1.fungisida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1FungisidaBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin1RendamBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_1.rendam.SeedGermin1RendamTambahFragment

class SeedGermin1FungisidaFragment : Fragment() {

    private var _binding: FragmentSeedGermin1FungisidaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin1FungisidaBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin1FungisidaTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_fungisida, mFragment, SeedGermin1FungisidaTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }

}