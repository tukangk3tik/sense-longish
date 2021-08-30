package app.ourapps.apps_rebuild.ui.seedp.lbk.terima_kiriman

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkTerimaKirimTambahBinding

class SeedLbkTerimaKirimTambahFragment : Fragment() {

    private var _binding: FragmentSeedLbkTerimaKirimTambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeedLbkTerimaKirimTambahBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        // Inflate the layout for this fragment
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.edtNokawinan.inputType = InputType.TYPE_NULL
        binding.edtNokawinan.setTextIsSelectable(false)

        binding.edtNogoni.inputType = InputType.TYPE_NULL
        binding.edtNogoni.setTextIsSelectable(false)

    }


}