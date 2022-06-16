package com.ozansoykan.androidbootcampodev2.nesneyonelimliprogramlam

class Odev2 {
    fun soru1(derece:Double) : Double{
        return derece * 1.8 + 32
    }

    fun soru2(kenar1 : Double , kenar2 : Double){
        var sonuc = (kenar1 + kenar2) * 2
        println("Sonuç 2 : $sonuc")
    }

    fun soru3(sayi:Int) : Int{
        var sonuc = 1
        for (i in 1..sayi){
            sonuc *= i
        }
        return sonuc
    }


    fun soru4(s: String, ch: Char) {
        var sonuc = s.filter { it == ch }.count()
        println("Sonuç 4 : $sonuc")
    }

    fun soru5(kenar:Int):Int{
        return (kenar - 2) * 180
    }

    fun soru6(gun : Int) : Int{
        var calismaSaat = gun * 8
        var sonuc = 0
        if(calismaSaat > 160){
            sonuc += (calismaSaat - 160) * 20 + calismaSaat * 10
        }else{
            sonuc += calismaSaat * 10
        }
        return sonuc
    }

    fun soru7(gb : Double) :Double{
        var sonuc = 0.0
        if(gb > 50){
            sonuc += gb * 4
        }else{
            sonuc += gb * 2
        }

        return sonuc
    }
}