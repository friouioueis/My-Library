package com.example.moi.mylibrary


import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import com.example.moi.mylibrary.fragments.FirstBook
import com.example.moi.mylibrary.fragments.FourthBook
import com.example.moi.mylibrary.fragments.SecondBook
import com.example.moi.mylibrary.fragments.ThirdBook


class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        //Id of the fragment in action

        val booksId = intent.getIntExtra("id", 1)

        when (booksId) {

            //First Book

            1
            -> supportFragmentManager.beginTransaction().replace(R.id.frame, FirstBook())
                .commit()

            //Second Book

            2
            -> supportFragmentManager.beginTransaction().replace(R.id.frame, SecondBook())
                .commit()

            //Third Book

            3
            -> supportFragmentManager.beginTransaction().replace(R.id.frame, ThirdBook())
                .commit()

            //Fourth Book

            4
            -> supportFragmentManager.beginTransaction().replace(R.id.frame, FourthBook())
                .commit()

            //Default Case

            else
            -> supportFragmentManager.beginTransaction()
                    .replace(R.id.frame, ThirdBook()).commit()

        }
    }

}