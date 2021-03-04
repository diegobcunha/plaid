package io.plaidapp.core.enjoei.data

import io.plaidapp.core.data.PlaidItem

data class Enjoei(
    override val id: Long,
    override val title: String,
    override var url: String? = null
) : PlaidItem(
    id,
    title,
    url, 0
)