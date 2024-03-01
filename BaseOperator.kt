public open class BaseOperator  (override var OperatorName : String,
                                 override var CostPerMinute : Double,
                                 override var CoverageArea : Double) : MobileCommunication()
{
    var Pp = true
    override fun Input_Information() {
        try
        {
            print("Оператор: ")
            OperatorName = readLine()!!.toString()
            do {
                print("Стоимость 1 минуты разговора: ")
                CostPerMinute = readLine()!!.toDouble()
            }
            while (CostPerMinute<0.0)
            do {
                print("Площадь окрытия: ")
                CoverageArea = readLine()!!.toDouble()
            }
            while (CoverageArea<0.0)
            print("Есть плата за соединение? ")
            var p = readLine()!!.toString()
            if (p == "Да" || p == "да" || p == "ДА") Pp = true
            else Pp = false
        }
        catch(e : Exception)
        {
            println("Данные введены неправильно!")
        }
    }
    override fun PrintInfo()
    {
        println("Оператор: $OperatorName \nСтоимость 1 минуты разговора: $CostPerMinute \nПлощадь покрытия: $CoverageArea")
    }
    override fun Q()
    {
        var QQ = 0.0
        if (Pp==true) QQ = 0.7*(100*CoverageArea)/CostPerMinute
        else QQ = 1.5*(100*CoverageArea)/CostPerMinute
        println("Качество: $QQ")
    }
}
