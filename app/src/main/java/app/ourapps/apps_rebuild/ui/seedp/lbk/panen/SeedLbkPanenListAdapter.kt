package app.ourapps.apps_rebuild.ui.seedp.lbk.panen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.ItemListKawinanBinding
import app.ourapps.apps_rebuild.models.kawinan.Kawinan
import app.ourapps.apps_rebuild.utils.kawinan.KawinanClickListener

class SeedLbkPanenListAdapter : RecyclerView.Adapter<SeedLbkPanenListAdapter.ViewHolder>() {

    private val listKawinan = ArrayList<Kawinan>()
    var listener: KawinanClickListener? = null

    inner class ViewHolder(private val binding: ItemListKawinanBinding)
        : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(kawinan: Kawinan){
            with(binding) {
                noPekerjaan.text = kawinan.noKawinan

                if (kawinan.waktuScan != null){
                    waktuScan.text = kawinan.waktuScan
                    waktuScan.visibility = View.VISIBLE
                    iconValidator.setImageResource(R.drawable.ic_circle_check_green)

                    itemView.setOnLongClickListener {
                        listener?.onLongItemTap(it, kawinan)
                        true
                    }
                } else {
                    itemView.setOnClickListener {
                        listener?.onLongItemTap(it, kawinan)
                    }
                }

            }
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listKawinan[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : ViewHolder {
        val binding = ItemListKawinanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listKawinan.size

    fun setData(items: List<Kawinan>) {
        listKawinan.clear()
        listKawinan.addAll(items)
    }
}