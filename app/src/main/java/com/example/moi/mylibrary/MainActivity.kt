package com.example.moi.mylibrary

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.example.moi.mylibrary.fragments.*

class MainActivity : AppCompatActivity() {

    // Function that switches the content depending on the OnclickListener()

    private fun switchContent(id: Int) {
        val intent = Intent(this@MainActivity, BooksActivity::class.java)
        intent.putExtra("id", id)
        startActivity(intent)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Case of Book 1

        layout_first_book.setOnClickListener {

                                        //Case of 600dp

            if (resources.configuration.screenLayout and
                Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_LARGE
            ) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.largeSizeContainer, FirstBook()).commit()
            } else

            // Display First Book's Details

                switchContent(1)
            }
            //Case of Book 2

            layout_second_book.setOnClickListener {

                                        //Case of 600dp

                if (resources.configuration.screenLayout and
                    Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_LARGE
                ) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.largeSizeContainer, SecondBook()).commit()
                } else
                // Display Second Book's Details

                    switchContent(2)
            }

            //Case of Book 3

            layout_third_book.setOnClickListener {

                                        //Case of 600dp

                if (resources.configuration.screenLayout and
                    Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_LARGE
                ) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.largeSizeContainer, ThirdBook()).commit()
                } else

                // Display Third Book's Details

                    switchContent(3)
            }

            //Case of Book 4

            layout_fourth_book.setOnClickListener {

                                        //Case of 600dp

                if (resources.configuration.screenLayout and
                    Configuration.SCREENLAYOUT_SIZE_MASK == Configuration.SCREENLAYOUT_SIZE_LARGE
                ) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.largeSizeContainer, FourthBook()).commit()
                } else

                // Display Fourth Book's Details

                    switchContent(4)
            }

    }


}
