package com.fengge.mediarecordertest


import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.litepal.LitePal
import org.litepal.extension.delete
import org.litepal.extension.deleteAll
import org.litepal.extension.findAll
import org.litepal.tablemanager.Connector
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db=Connector.getDatabase()

        val n1=News()
        n1.title="啊实打实"
        n1.content="asdasdasdlkajsdlkajsd"
        n1.publishDate= Date()
        n1.save()

        /*val n1=News()
        n1.title="我喜欢你"
        n1.updateAll("id=?","1")*/

        LitePal.deleteAll<News>("id=?","2")
        val all=LitePal.findAll<News>()
        Log.d("Test","数目:"+all.size)
        val sb:StringBuilder=StringBuilder()
        for(al in all){
            Log.d("Test",""+al.id)
            Log.d("Test",""+al.title)
            Log.d("Test",""+al.content)
            Log.d("Test",""+al.publishDate)
            sb.append("id:"+al.id+"\n")
            sb.append("title:"+al.title+"\n")
            sb.append("content:"+al.content+"\n")
            sb.append("publishDate:"+al.publishDate+"\n")
        }
        textView.setText(sb)
    }
}
