package app.ourapps.apps_rebuild.ui.seedp.lbk.panen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedLbkPanenBinding
import app.ourapps.apps_rebuild.models.kawinan.Kawinan
import app.ourapps.apps_rebuild.utils.kawinan.KawinanClickListener

class SeedLbkPanenFragment : Fragment(), KawinanClickListener {

    private var _binding : FragmentSeedLbkPanenBinding? = null
    private val binding get() = _binding!!
    private val viewModel: SeedLbkPanenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedLbkPanenBinding.inflate(inflater, container, false)
        val root : View = binding.root

        val adapter = SeedLbkPanenListAdapter()
        adapter.listener = this
        binding.rvItemList.layoutManager = LinearLayoutManager(root.context)
        binding.rvItemList.adapter = adapter
        //here view model to show data
        //ViewModel Area


        //For new scan
        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedLbkPanenTambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_panen, mFragment, SeedLbkPanenTambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        return root
    }

    //when item click
    override fun onItemClicked(view: View, kawinan: Kawinan) {
        TODO("Not yet implemented")
    }

    override fun onLongItemTap(view: View, kawinan: Kawinan) {
        TODO("Not yet implemented")
    }

}