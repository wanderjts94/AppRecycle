package pe.idat.edu.apprecycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.idat.edu.apprecycle.databinding.ItemListaBinding

class AdapterLista (private var lstItem:List<String>): RecyclerView.Adapter<AdapterLista.ViewHolder>(){
    inner class  ViewHolder(val binding: ItemListaBinding)
        :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return   ViewHolder(binding)
    }

    override fun getItemCount()= lstItem.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.twnombre.setText(lstItem.get(position))
    }
}