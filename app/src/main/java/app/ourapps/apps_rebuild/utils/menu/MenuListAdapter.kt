package app.ourapps.apps_rebuild.utils.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.ourapps.apps_rebuild.databinding.ItemSubmenuChildBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import app.ourapps.apps_rebuild.utils.MenuClickListener
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MenuListAdapter: RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

    private val listMenu = ArrayList<Menu>()
    var listener: MenuClickListener? = null

    inner class ViewHolder(private val binding: ItemSubmenuChildBinding)
        : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(menu: Menu){
            with(binding) {
                Glide.with(itemView.context)
                    .load(menu.imageIcon)
                    .apply(RequestOptions().override(350, 550))
                    .into(menuIcon)

                titleMenu.text = itemView.context.getString(menu.nameStrRes)

                itemView.setOnClickListener {
                    listener?.onItemClicked(it, menu)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : ViewHolder {
        val binding = ItemSubmenuChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuListAdapter.ViewHolder, position: Int) {
        holder.bind(listMenu[position])
    }

    override fun getItemCount(): Int = listMenu.size

    fun setData(items: List<Menu>) {
        listMenu.clear()
        listMenu.addAll(items)
    }
}