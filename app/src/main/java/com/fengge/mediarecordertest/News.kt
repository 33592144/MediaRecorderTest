package com.fengge.mediarecordertest

import org.litepal.crud.LitePalSupport
import java.util.*

class News: LitePalSupport() {
    var id:Int=0
    get()=field
    set(value){field=value}
    var title:String=""
    get()=field
    set(value){field=value}
    var content:String=""
    get()=field
    set(value){field=value}
    var publishDate:Date=Date()
    get()=field
    set(value){field=value}
    var commentCount:Int=0
    get()=field
    set(value){field=value}
    var introduction:Introduction= Introduction()
    var commentList= emptyList<Comment>()
    var categoryList= emptyList<Category>()
}