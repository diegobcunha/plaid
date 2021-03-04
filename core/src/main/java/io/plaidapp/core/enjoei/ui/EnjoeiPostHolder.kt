package io.plaidapp.core.enjoei.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class EnjoeiPostHolder(
    itemvView: View,
    private val viewClicked: () -> Unit
) : RecyclerView.ViewHolder(itemvView) {

    init {
        itemvView.setOnClickListener { viewClicked.invoke() }
    }
}