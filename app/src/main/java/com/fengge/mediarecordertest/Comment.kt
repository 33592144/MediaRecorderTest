package com.fengge.mediarecordertest

import org.litepal.crud.LitePalSupport
import java.util.*

class Comment: LitePalSupport() {
    var id:Int=0
    get()=field
    set(value) {field=value}
    var content:String=""
    get()=field
    set(value) {field=value}
    var publishDate:Date= Date()
    get()=field
    set(value) {field=value}
    var news:News= News()
}