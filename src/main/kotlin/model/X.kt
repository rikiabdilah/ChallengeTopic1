package model

class X: Pola, PolaInterface {
    constructor(karakter: String, jumlah: Int) : super(karakter, jumlah){
        super.karakter = karakter
        super.jumlah = jumlah
    }

    constructor(jumlah: Int): super(jumlah){
        super.karakter = "*"
        super.jumlah = jumlah
    }

    override fun membuatPola() {
        for (i in 1..super.jumlah){
            for (j in 1..super.jumlah){
                if (j == i || j + i == super.jumlah + 1){
                    if (super.jumlah % 2 == 1 && super.jumlah / 2 + 1 == i){
                        super.resultPola += "${super.karakter} "
                    }  else {
                        super.resultPola += super.karakter
                    }
                }else {
                    super.resultPola += " "
                }
            }
            super.resultPola += "\n"
        }
    }

    override fun getPola(): String {
        if (super.resultPola.isBlank()){
            return super.resultPola
        }

        super.resultPola = ""
        membuatPola()
        return super.resultPola
    }

    init {
        println("Membuat Pola X dengan karakter ${this.karakter} dengan jumlah ${this.jumlah}")
    }
}