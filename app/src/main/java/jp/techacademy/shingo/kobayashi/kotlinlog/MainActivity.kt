package jp.techacademy.shingo.kobayashi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("佐々木", 30, "動画制作")      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human2 = Human("鈴木", 25, "ランニング")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}