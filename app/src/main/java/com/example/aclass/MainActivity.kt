package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//파라미터(생성자)가 없는 클래스
class Kotlin() {
    init {
        Log.d("class", "Kotlin 클래스 생성됨")
    }
}

//파라미터가 있는 세컨더리 생성자
class KotlinTwo {
    constructor(value: String) {
        Log.d("KotlinTwo", "파라미터값은 ${value}입니다.")
    }
}

//프로퍼티와 메소드
class KotlinThree {
    var one: String = "None"
    fun printOne() {
        Log.d("class", "one에 입력된 값은 ${one}입니다.")
    }
}

//스태틱 멤버를 갖는 클래스
class KotlinFour {
    companion object {
        var one: String = "None"
        fun printOne() {
            Log.d("class", "one에 입력된 값은 ${one}입니다.")
        }
    }
}

//데이터 클래스는 기본적으로 getter, setter함수 생성
//java object 클래스에 정의된 함수들을 자동으로 생성한다
data class DataUser(var name: String, var age: Int)
var dataUser = DataUser("hong", 21)

