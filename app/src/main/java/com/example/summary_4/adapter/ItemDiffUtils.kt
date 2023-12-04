package com.example.summary_4.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.summary_4.model.Item

class ItemDiffUtils : DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Item, newItem: Item) = oldItem == newItem
}