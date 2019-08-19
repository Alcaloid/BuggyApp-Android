package scb.academy.jinglebell.fragment

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_profile.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.WelcomeActivity
import scb.academy.jinglebell.adapter.OnSongClickListener
import scb.academy.jinglebell.adapter.SongAdapter
import scb.academy.jinglebell.extension.showToast
import scb.academy.jinglebell.model.Song
import scb.academy.jinglebell.model.SongSearchResult
import scb.academy.jinglebell.service.ApiManager



class ProfileFragment : Fragment(){

    companion object{
        var name:String? =null
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(scb.academy.jinglebell.R.layout.fragment_profile, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_subit.setOnClickListener {
            val txt_name = edit_field_name.text.toString()
            if (txt_name!=""){
                val intent:Intent = Intent(context,WelcomeActivity::class.java)
                intent.putExtra("name",txt_name)
                name = txt_name
                startActivity(intent)
            }
        }
    }
}