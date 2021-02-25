package org.jdc.template.ux.directory

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.jdc.template.databinding.ListItemBinding
import org.jdc.template.util.ext.inflater
import org.jdc.template.util.ext.setOnClickListener
import org.jdc.template.model.db.main.directoryitem.DirectoryItem

class DirectoryAdapter(
    private val viewModel: DirectoryViewModel
) : ListAdapter<DirectoryItem, DirectoryAdapter.ViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent).apply {
            setOnClickListener { position ->
                viewModel.onDirectoryIndividualClicked(getItem(position))
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.listItemTextView.text = getItem(position).getFullName()
    }

    class ViewHolder(parent: ViewGroup, val binding: ListItemBinding = ListItemBinding.inflate(parent.inflater(), parent, false)) : RecyclerView.ViewHolder(binding.root)

    companion object {
        private val DIFF_CALLBACK: DiffUtil.ItemCallback<DirectoryItem> = object : DiffUtil.ItemCallback<DirectoryItem>() {
            override fun areItemsTheSame(oldItem: DirectoryItem, newItem: DirectoryItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: DirectoryItem, newItem: DirectoryItem): Boolean {
                return oldItem.firstName == newItem.firstName && oldItem.lastName == newItem.lastName
            }
        }
    }
}
