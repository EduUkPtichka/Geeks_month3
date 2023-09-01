package com.example.lessondz3v7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lessondz3v7.databinding.ItemListBinding


class TAdapter(val RmList: List<T>, val onClick: (rm: T) -> Unit) :
    RecyclerView.Adapter<TAdapter.RmViewHolder>() {

    inner class RmViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = RmList[adapterPosition]

            binding.apply {
                tvLife.text = item.life
                tvName.text = item.name
                imgPicture.setImageResource(item.picture)
            }
            itemView.setOnClickListener {
                onClick.invoke(item)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RmViewHolder {
        return RmViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: RmViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return RmList.size
    }
}
