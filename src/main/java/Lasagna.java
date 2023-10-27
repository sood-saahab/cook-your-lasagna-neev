public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
public int expectedMinutesInOven(){
    int expectedMinutesInOven=40;
    return expectedMinutesInOven;
}
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int minutesInOven){
    int expectedMinutesInOven=40;
    return (expectedMinutesInOven-minutesInOven);
}
    
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int noOfLayers){
    int preprationTimeForOneLayer=2;
    return (noOfLayers * preprationTimeForOneLayer);
}
    
    // TODO: define the 'totalTimeInMinutes()' method
public int totalTimeInMinutes(int noOfLayers, int minutesInOven){
    int preprationTimeForOneLayer=2;
    int totalTime= (noOfLayers * preprationTimeForOneLayer)+ minutesInOven;
    return totalTime;
}
    
}
