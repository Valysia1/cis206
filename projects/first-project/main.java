public class Mountain {
private String name;
private String country;
private double elevation;
    
public Mountain(String name, String country, double elevation) {
    this.name=name;
    this.country=elevation;
}
    public String getName(){
     return name
}
public double getElevation(){
  return elevation;
}
public void setName(String s){
    name=s;
}
public void setCountry(String s){
 country=s;
}
public double calltoMeters(double ht){
    double ht_in_mtrs = (double) ht/3.2808
     return ht_in_mtrs;
}
public static double minElevation(Mountain[] mountains){
    int l= mountain.length;
    double min = mountains[0].getElevaiton();
    
    for(inti=0;i<l;i++)
  {
if(mountains[i].getElevation() < min)
{
min = mountains[i].getElevation();
}
}

return min;
};

public static void main(String[] args){
Mountain m1 = new Mountain("Chimborazo", "Ecuador", 20549);
Mountain m2 = new Mountain("Matterhorn", "Switzerland", 14692);
Mountain m3 = new Mountain("Olympus", "Greece", 9573);
Mountain m4 = new Mountain("Everest", "Nepal", 29029);
Mountain m5 = new Mountain("Mount Marcy", "United States", 5344);
Mountain m6 = new Mountain("Mount Mitchell", "United States", 6684);
Mountain m7 = new Mountain("Zugspitze", "Switzerland", 9719);


Mountain[] mountains = {m1, m2, m3, m4, m5, m6, m7};

int l = mountains.length;

System.out.print("Mountain ");
System.out.print("Country ");
System.out.print("Elevation ");
System.out.println("Elevation in metres");

for(int i=0 ; i < l ; i++){
System.out.print(mountains[i].getName() + " ");
System.out.print(mountains[i].getCountry() + " ");
System.out.print(mountains[i].getElevation() + " ");
System.out.println(mountains[i].calltoMeters(mountains[i].getElevation()));
}


}
}    
 
