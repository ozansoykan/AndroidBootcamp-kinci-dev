package com.ozansoykan.androidbootcampodev2

import com.ozansoykan.androidbootcampodev2.nesneyonelimliprogramlam.Odev2

fun main(){
    var f = Odev2()
    val gelenSonuc1 = f.soru1(20.0)
    println("Sonuç 1 : $gelenSonuc1")
    f.soru2(2.0,3.0)
    val gelenSonuc2 = f.soru3(5)
    println("Sonuç 3 : $gelenSonuc2")
    f.soru4("android bootcamp",'a')
    val gelenSonuc3 = f.soru5(3)
    println("Sonuç 5 : $gelenSonuc3")
    var gelenSonuc4 = f.soru6(20)
    println("Sonuç 6 : $gelenSonuc4")
    val gelenSonuc5 = f.soru7(100.0)
    println("Sonuc 7 : $gelenSonuc5 ₺")





}