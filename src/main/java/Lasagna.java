public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven=40;
    int preprationTimeForOneLayer=2;
public int expectedMinutesInOven(){
    return expectedMinutesInOven;
}
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int minutesInOven){
    return (expectedMinutesInOven-minutesInOven);
}
    
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int noOfLayers){
    return (noOfLayers * preprationTimeForOneLayer);
}
    
    // TODO: define the 'totalTimeInMinutes()' method
public int totalTimeInMinutes(int noOfLayers, int minutesInOven){
    int totalTime= (noOfLayers * preprationTimeForOneLayer)+ minutesInOven;
    return totalTime;
}
    
}
