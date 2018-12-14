package danelia.maya.loginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Picasso.get().load("https://data.whicdn.com/images/323486155/large.jpg").placeholder(R.mipmap.background2).into(image1)
        Picasso.get().load("https://data.whicdn.com/images/323536145/large.jpg").placeholder(R.mipmap.background2).into(image2)
        Picasso.get().load("https://data.whicdn.com/images/323531636/large.jpg").placeholder(R.mipmap.background2).into(image3)
        Picasso.get().load("https://data.whicdn.com/images/323489960/large.jpg").placeholder(R.mipmap.background2).into(image4)
        Picasso.get().load("https://data.whicdn.com/images/323506355/large.jpg").placeholder(R.mipmap.background2).into(image5);
    }
}
