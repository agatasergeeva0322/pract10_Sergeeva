abstract class MobileCommunication
{
    abstract var OperatorName : String
    abstract var CostPerMinute: Double
    abstract var CoverageArea: Double
    open fun Q()
    {
        var QQ = (100*CoverageArea)/CostPerMinute
        println("$QQ")
    }
    open fun Input_Information() {}
    open fun PrintInfo() {}
}

