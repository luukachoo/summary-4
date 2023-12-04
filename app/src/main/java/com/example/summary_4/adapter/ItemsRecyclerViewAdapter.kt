package com.example.summary_4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.summary_4.databinding.ItemTextMessageBinding
import com.example.summary_4.databinding.ItemVoiceMessageBinding
import com.example.summary_4.model.Item

class ItemsRecyclerViewAdapter : ListAdapter<Item, RecyclerView.ViewHolder>(ItemDiffUtils()) {

    inner class ItemMessageViewHolder(private val binding: ItemTextMessageBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(item: Item) {
                with(binding) {
                    Glide.with(itemView.context)
                        .load(item.image)
                        .into(ivAccountImage)
                    tvName.text = item.owner
                    tvMessage.text = item.lastMessage
                    tvTime.text = item.lastActive
                    unreadMessagesCount.text = item.unreadMessages.toString()
                }
            }
        }


    inner class ItemVoiceMessageViewHolder(private val binding: ItemVoiceMessageBinding) :
    RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(item.image)
                    .into(ivAccountImage)
                tvName.text = item.owner
                tvTime.text = item.lastActive

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            MESSAGE -> ItemMessageViewHolder(
                ItemTextMessageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            VOICE -> ItemVoiceMessageViewHolder(
                ItemVoiceMessageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw Exception("aq mesame item unda damematebina ver movaswari ar gamagdot gtxovt :((")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        const val MESSAGE = 0
        const val VOICE = 1
        const val TYPING = 2
    }
}