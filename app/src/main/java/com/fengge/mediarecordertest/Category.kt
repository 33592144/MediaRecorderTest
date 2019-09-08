package com.fengge.mediarecordertest

import org.litepal.crud.LitePalSupport

class Category: LitePalSupport() {
    var id:Int=0
    var name:String=""
    var newList= emptyList<News>()
}