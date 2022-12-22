package com.mj.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter() :
    ListAdapter<String, LanguageAdapter.LanguageViewHolder>(LanguageDiffUtils()) {


    class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val language: TextView
            get() = itemView.findViewById(R.id.textView)

        fun bind(item: String) {

            language.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        return LanguageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_language, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}

class LanguageDiffUtils : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}

