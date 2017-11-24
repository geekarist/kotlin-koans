
import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeSpan: TimeSpan) =
        addTimeIntervals(timeSpan.timeInterval, timeSpan.number)

operator fun TimeInterval.times(number: Int) = TimeSpan(this, number)

class TimeSpan(val timeInterval: TimeInterval, val number: Int)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
