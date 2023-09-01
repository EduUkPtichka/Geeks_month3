package com.example.lessondz3v6

import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lessondz3v6.databinding.PlayListBinding

class SongAdapter (
    private val playlist: ArrayList<Song>
    ,val onClick: (tittle: String) -> Unit): Adapter<SongAdapter.PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(PlayListBinding.inflate(LayoutInflater
            .from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = playlist.size

    inner class PlaylistViewHolder(private val binding: PlayListBinding) : ViewHolder(binding.root){
        fun bind(){

            val item = playlist[adapterPosition]

            itemView.setOnClickListener {
                onClick(playlist[adapterPosition].name)
            }

            binding.apply {
                tvNumber.text = item.number
                tvSongName.text = item.name
                tvSinger.text = item.singer
                tvTime.text = item.time
            }
        }

    }


}