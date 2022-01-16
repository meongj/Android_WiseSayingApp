package com.meongj.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.meongj.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        //명언 리스트
        val sentenceList = mutableListOf<String>()
        sentenceList.add("진정으로 웃으려면 고통을 참아야하며 , 나아가 고통을 즐길 줄 알아야 해")
        sentenceList.add("직업에서 행복을 찾아라. 아니면 행복이 무엇인지 절대 모를 것이다")
        sentenceList.add("신은 용기있는자를 결코 버리지 않는다")
        sentenceList.add("피할수 없으면 즐겨라")
        sentenceList.add("절대 어제를 후회하지 마라 . 인생은 오늘의 나 안에 있고 내일은 스스로 만드는 것이다")
        sentenceList.add("계단을 밟아야 계단 위에 올라설수 있다")
        sentenceList.add("오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아 간다")
        sentenceList.add("좋은 성과를 얻으려면 한 걸음 한 걸음이 힘차고 충실하지 않으면 안 된다")
        sentenceList.add("행복은 습관이다,그것을 몸에 지니라")
        sentenceList.add("성공의 비결은 단 한 가지, 잘할 수 있는 일에 광적으로 집중하는 것이다")
        sentenceList.add("자신감 있는 표정을 지으면 자신감이 생긴다")
        sentenceList.add("평생 살 것처럼 꿈을 꾸어라.그리고 내일 죽을 것처럼 오늘을 살아라")
        sentenceList.add("고통이 남기고 간 뒤를 보라! 고난이 지나면 반드시 기쁨이 스며든다")
        sentenceList.add("꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다")
        sentenceList.add("마음만을 가지고 있어서는 안된다. 반드시 실천하여야 한다")


        Log.e("MainActivity",sentenceList.random())

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }

        //랜덤하게 명언 띄우기
        binding.goodWordTextArea.setText(sentenceList.random())
    }
}