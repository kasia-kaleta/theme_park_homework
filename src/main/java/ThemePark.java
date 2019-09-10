import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
         ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
         reviewed.addAll(attractions);
         reviewed.addAll(stalls);
         return reviewed;
    }
}
