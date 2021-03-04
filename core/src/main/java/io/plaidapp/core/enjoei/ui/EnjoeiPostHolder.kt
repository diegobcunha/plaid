package io.plaidapp.core.enjoei.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class EnjoeiPostHolder(
    itemView: View,
    private val viewClicked: () -> Unit
) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener { viewClicked.invoke() }
    }
}