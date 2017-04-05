// Find if today is between the given two dates range in groovy
def isTodayBetweenDates = {startdate, enddate ->
    def today = new Date();
    today.clearTime(); // reset time to 00:00:00:00
    return ((new Date(startdate)).compareTo(today) * today.compareTo(new Date(enddate)) >= 0);    
};

println isTodayBetweenDates("03/05/2017","04/04/2017"); // true
println isTodayBetweenDates("03/05/2017","04/05/2017"); // true
println isTodayBetweenDates("04/05/2017","04/05/2017"); // true
println isTodayBetweenDates("04/05/2017","04/07/2017"); // true
println isTodayBetweenDates("05/07/2017","06/05/2017"); // false
