package app.ourapps.apps_rebuild.ui.seedp.lbk.rendam

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkRendamTambahBinding
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkRontokTambahBinding

class SeedLbkRendamTambahFragment : Fragment() {

    private var _binding: FragmentSeedLbkRendamTambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeedLbkRendamTambahBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        // Inflate the layout for this fragment
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.edtNokawinan.inputType = InputType.TYPE_NULL
        binding.edtNokawinan.setTextIsSelectable(false)
    }

}