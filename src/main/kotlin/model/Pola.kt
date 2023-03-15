package model

open class Pola  {
    protected var karakter: String
    protected var jumlah: Int
    protected var resultPola: String = ""

    constructor(karakter: String, jumlah: Int) {
        this.karakter = karakter
        this.jumlah = jumlah
    }

    constructor(jumlah: Int){
        this.karakter = "*"
        this.jumlah = jumlah
    }

}