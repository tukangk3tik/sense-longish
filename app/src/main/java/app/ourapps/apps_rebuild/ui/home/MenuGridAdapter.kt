package app.ourapps.apps_rebuild.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.ourapps.apps_rebuild.AppRoutes
import app.ourapps.apps_rebuild.databinding.ItemGridMenuBinding
import app.ourapps.apps_rebuild.models.menu.Menu
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MenuGridAdapter()
    : RecyclerView.Adapter<MenuGridAdapter.MenuGridHolder>()
{
    private val listMainMenu = ArrayList<Menu>()
    private val routes = AppRoutes.getInstance()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuGridHolder {
        val binding = ItemGridMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuGridHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuGridHolder, position: Int) {
        holder.bind(listMainMenu[position])
    }

    override fun getItemCount(): Int = listMainMenu.size

    inner class MenuGridHolder(private val binding: ItemGridMenuBinding)
        : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(menu: Menu) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(menu.imageIcon)
                    .apply(RequestOptions().override(350, 550))
                    .into(menuIcon)

                menuString.text = itemView.resources.getString(menu.nameStrRes)

                itemView.setOnClickListener {
                    routes.setDestination(menu.route)

                    val destination = routes.getActivityRoute()
                    if (destination != null){
                        val mIntent = Intent(itemView.context, destination)
                        itemView.context.startActivity(mIntent)
                    }
                }
            }
        }
    }

    fun setData(items: List<Menu>) {
        listMainMenu.clear()
        listMainMenu.addAll(items)
    }
}